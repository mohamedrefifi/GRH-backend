package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.EnfantDto;
import com.example.demo.Model.Enfant;
import com.example.demo.Repository.EnfantRepository;
import com.example.demo.Service.EnfantService;


@Service
public class EnfantServiceImpl implements EnfantService{
	
	private EnfantRepository enfantRepository;
	
	public EnfantServiceImpl (EnfantRepository enfantRepository)
	{
		this.enfantRepository=enfantRepository;
	}

	@Override
	public EnfantDto save(EnfantDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				EnfantDto.fromEntity(enfantRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<EnfantDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Enfant>cOptional=enfantRepository.findById(id);
		return 
				Optional.of(EnfantDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<EnfantDto> FindAll() {
		return
				enfantRepository.findAll().stream()
				.map(EnfantDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		enfantRepository.deleteById(id);
		
	}

	
}
