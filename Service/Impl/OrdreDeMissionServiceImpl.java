package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.OrdreDeMissionDto;
import com.example.demo.Model.OrdreDeMission;
import com.example.demo.Repository.OrdreDeMissionRepository;
import com.example.demo.Service.OrdreDeMissionService;

@Service
public class OrdreDeMissionServiceImpl  implements OrdreDeMissionService{
	
	private OrdreDeMissionRepository ordreDeMissionRepository;
	
	public OrdreDeMissionServiceImpl (OrdreDeMissionRepository ordreDeMissionRepository)
	{
		this.ordreDeMissionRepository=ordreDeMissionRepository;
	}

	@Override
	public OrdreDeMissionDto save(OrdreDeMissionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				OrdreDeMissionDto.fromEntity(ordreDeMissionRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<OrdreDeMissionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<OrdreDeMission> cOptional=ordreDeMissionRepository.findById(id);
		return
				Optional.of(OrdreDeMissionDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<OrdreDeMissionDto> FindAll() {
		return
				ordreDeMissionRepository.findAll().stream()
				.map(OrdreDeMissionDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		ordreDeMissionRepository.deleteById(id);
		
	}

}
