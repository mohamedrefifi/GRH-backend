package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.CongeExceptionnelDto;
import com.example.demo.Model.CongeExceptionnel;
import com.example.demo.Repository.CongeAnnuelRepository;
import com.example.demo.Repository.CongeExceptionnelRepository;
import com.example.demo.Service.CongeExceptionnelService;
@Service

public class CongeExceptionnelServiceImpl implements CongeExceptionnelService {

	private CongeExceptionnelRepository congeExceptionnelRepository;
	
	public CongeExceptionnelServiceImpl (CongeExceptionnelRepository congeExceptionnelRepository)
	{
		this.congeExceptionnelRepository=congeExceptionnelRepository;
	}
	
	
	@Override
	public CongeExceptionnelDto save(CongeExceptionnelDto dto) {
		if(dto==null)
		{
			return null;
		}
		return 
				CongeExceptionnelDto.fromEntity(congeExceptionnelRepository.save(dto.toEntity(dto)));
		
	}

	@Override
	public Optional<CongeExceptionnelDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		
		Optional<CongeExceptionnel> cOptional = congeExceptionnelRepository.findById(id);
		return Optional.of(CongeExceptionnelDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<CongeExceptionnelDto> FindAll() {
		return
				congeExceptionnelRepository.findAll().stream()
				.map(CongeExceptionnelDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}	
		
		congeExceptionnelRepository.deleteById(id);
	}
	
	

}
