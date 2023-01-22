package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ArretDto;
import com.example.demo.Model.Arret;
import com.example.demo.Repository.ArretRepository;
import com.example.demo.Service.ArretService;
@Service
public class ArretServiceImpl implements ArretService{

	private ArretRepository arretRepository;
	
	public ArretServiceImpl (ArretRepository arretRepository)
	{
		this.arretRepository=arretRepository;
	}
	
	@Override
	public ArretDto save(ArretDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return ArretDto.fromEntity(arretRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<ArretDto> FindById(Integer id) {
    if(id==null)
    {
    	return null;
    }
    Optional<Arret> aOptional = arretRepository.findById(id);
    return Optional.of(ArretDto.fromEntity(aOptional.get()));
	}

	@Override
	public List<ArretDto> FindAll() {
		return arretRepository.findAll()
				.stream()
				.map(ArretDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		arretRepository.deleteById(id);
	}

}
