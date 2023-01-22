package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.FormationDto;
import com.example.demo.Model.Formation;
import com.example.demo.Repository.FormationRepository;
import com.example.demo.Service.FormationService;

@Service

public class FormationSeerviceimpl implements FormationService{
	
	private FormationRepository formationRepository;
	
	public FormationSeerviceimpl(FormationRepository formationRepository)
	{
		this.formationRepository=formationRepository;
	}

	@Override
	public FormationDto save(FormationDto dto) {
	if (dto==null)
	{
		return null;
	}
	return
			FormationDto.fromEntity(formationRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<FormationDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		Optional<Formation>cOptional=formationRepository.findById(id);
		return
				Optional.of(FormationDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<FormationDto> FindAll() {
		return
				formationRepository.findAll().stream()
				.map(FormationDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if (id==null)
		{
			return ;
		}	
		formationRepository.deleteById(id);
	}

}
