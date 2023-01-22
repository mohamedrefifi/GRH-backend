package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.DecisionDto;
import com.example.demo.Model.Decision;
import com.example.demo.Repository.DecisionRepository;
import com.example.demo.Service.DecisionService;

@Service
public class DecisionServiceImpl implements DecisionService {
	
	private DecisionRepository decisionRepository;
	
	public DecisionServiceImpl(DecisionRepository decisionRepository)
	{
		this.decisionRepository=decisionRepository;
	}

	@Override
	public DecisionDto save(DecisionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
		DecisionDto.fromEntity(decisionRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<DecisionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Decision>cOptional=decisionRepository.findById(id);
		return
				Optional.of(DecisionDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<DecisionDto> FindAll() {
		return
				decisionRepository.findAll().stream()
				.map(DecisionDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}	
		decisionRepository.deleteById(id);
	}

}
