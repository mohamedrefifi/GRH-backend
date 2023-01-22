package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.CongeAnnuelDto;
import com.example.demo.Model.CongeAnnuel;
import com.example.demo.Repository.CongeAnnuelRepository;
import com.example.demo.Service.CongeAnnuelService;

@Service
public class CongeAnnuelServiceImpl implements CongeAnnuelService {
	
	private CongeAnnuelRepository congeAnnuelRepository;
	
	public CongeAnnuelServiceImpl (CongeAnnuelRepository congeAnnuelRepository)
	{
		this.congeAnnuelRepository=congeAnnuelRepository;
	}

	@Override
	public CongeAnnuelDto save(CongeAnnuelDto dto) {
	 if(dto==null)
	 {
		 return null;
	 }
	 
	 return CongeAnnuelDto.fromEntity(congeAnnuelRepository.save(dto.toEntity(dto)));
	
	}

	@Override
	public Optional<CongeAnnuelDto> FindById(Integer id) {
     if(id==null)
     {
    	 return null;
     }
     
     Optional<CongeAnnuel> cOptional = congeAnnuelRepository.findById(id);
     return Optional.of(CongeAnnuelDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<CongeAnnuelDto> FindAll() {
		return congeAnnuelRepository.findAll().stream()
				.map(CongeAnnuelDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		congeAnnuelRepository.deleteById(id);
	}

}
