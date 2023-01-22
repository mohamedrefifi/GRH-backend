package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ApprentiDto;
import com.example.demo.Model.Apprenti;
import com.example.demo.Repository.ApprentiRepository;
import com.example.demo.Service.ApprentiService;

@Service

public class ApprentiServiceImpl  implements ApprentiService{

	
	private ApprentiRepository apprentiRepository;
	
	public ApprentiServiceImpl (ApprentiRepository apprentiRepository)
	{
		this.apprentiRepository=apprentiRepository;
	}
	
	@Override
	public ApprentiDto save(ApprentiDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
		ApprentiDto.fromEntity(apprentiRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<ApprentiDto> FindById(Integer id) {
	if (id == null)
	{
		return null;
	}
	Optional<Apprenti> dtOptional = apprentiRepository.findById(id);
	return Optional.of(ApprentiDto.fromEntity(dtOptional.get()));
	
	}

	@Override
	public List<ApprentiDto> FindAll() {
	
		return apprentiRepository.findAll().stream()
				.map(ApprentiDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) 
	{
    if(id==null)
    {
	return ;
    }
    apprentiRepository.deleteById(id);
	}
}
