package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ContratDto;
import com.example.demo.Model.Contrat;
import com.example.demo.Repository.ContratRepository;
import com.example.demo.Service.ContratService;

@Service
public class ContratServiceImpl implements ContratService{
	
	private ContratRepository contratRepository;
	
	public ContratServiceImpl (ContratRepository contratRepository)
	{
		this.contratRepository=contratRepository;
	}

	@Override
	public ContratDto save(ContratDto dto) {
     if(dto==null)
     {
    	 return null;
     }
     return
    		 ContratDto.fromEntity(contratRepository.save(dto.toEntity(dto)));
     
	}

	@Override
	public Optional<ContratDto> FindById(Integer id) {
		if(id==null)
	     {
	    	 return null;
	     }
		Optional<Contrat>cOptional=contratRepository.findById(id);
		return
				Optional.of(ContratDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<ContratDto> FindAll() {
		return
				contratRepository.findAll().stream()
				.map(ContratDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
	     {
	    	 return ;
	     }	
		contratRepository.deleteById(id);
	}

}
