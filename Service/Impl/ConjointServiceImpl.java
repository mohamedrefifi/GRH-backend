package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ConjointDto;
import com.example.demo.Model.Conjoint;
import com.example.demo.Repository.ConjointRepository;
import com.example.demo.Service.ConjointService;

@Service
public class ConjointServiceImpl implements ConjointService {
	
	private ConjointRepository conjointRepository;
	
	public ConjointServiceImpl (ConjointRepository conjointRepository)
	{
		this.conjointRepository=conjointRepository;
	}

	@Override
	public ConjointDto save(ConjointDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return 
				ConjointDto.fromEntity(conjointRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<ConjointDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Conjoint> cOptional = conjointRepository.findById(id);
		return
		Optional.of(ConjointDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<ConjointDto> FindAll() {
		return
		conjointRepository.findAll().stream()
		.map(ConjointDto::fromEntity)
		.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}	
		conjointRepository.deleteById(id);
	}

}
