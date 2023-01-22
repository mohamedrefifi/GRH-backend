package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.SanctionDto;
import com.example.demo.Model.Sanction;
import com.example.demo.Repository.SanctionRepository;
import com.example.demo.Service.SanctionService;

@Service
public class SanctionServiceImpl implements SanctionService {
	
	private SanctionRepository sanctionRepository;
	public SanctionServiceImpl(SanctionRepository sanctionRepository)
	{
		this.sanctionRepository=sanctionRepository;
	}

	@Override
	public SanctionDto save(SanctionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return 
				SanctionDto.fromEntity(sanctionRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<SanctionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		
		Optional<Sanction>cOptional=sanctionRepository.findById(id);
		return Optional.of(SanctionDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<SanctionDto> FindAll() {
		return
				sanctionRepository.findAll().stream()
				.map(SanctionDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		
	}

}
