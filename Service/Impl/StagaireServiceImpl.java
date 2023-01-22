package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.StagaireDto;
import com.example.demo.Model.Stagaire;
import com.example.demo.Repository.StagaireRepository;
import com.example.demo.Service.StagaireService;

@Service
public class StagaireServiceImpl implements StagaireService {

	private StagaireRepository stagaireRepository;
	
	public StagaireServiceImpl(StagaireRepository stagaireRepository)
	{
		this.stagaireRepository=stagaireRepository;
	}
	
	@Override
	public StagaireDto save(StagaireDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				StagaireDto.fromEntity(stagaireRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<StagaireDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Stagaire>cOptional=stagaireRepository.findById(id);
		return
				Optional.of(StagaireDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<StagaireDto> FindAll() {
		return 
				stagaireRepository.findAll().stream()
				.map(StagaireDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		stagaireRepository.deleteById(id);
	}

}
