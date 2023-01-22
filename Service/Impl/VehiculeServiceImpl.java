package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.VehiculeDto;
import com.example.demo.Model.Vehicule;
import com.example.demo.Repository.VehiculeRepository;
import com.example.demo.Service.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService {

	private VehiculeRepository vehiculeRepository;
	public VehiculeServiceImpl (VehiculeRepository vehiculeRepository)
	{
		this.vehiculeRepository=vehiculeRepository;
	}
	
	@Override
	public VehiculeDto save(VehiculeDto dto) {
		if(dto==null)
		{
			return null;
		}
		return VehiculeDto.fromEntity(vehiculeRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<VehiculeDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		
		Optional<Vehicule>cOptional=vehiculeRepository.findById(id);
		return 
				Optional.of(VehiculeDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<VehiculeDto> FindAll() {
		return
		vehiculeRepository.findAll().stream()
		.map(VehiculeDto::fromEntity)
		.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		vehiculeRepository.deleteById(id);
	}

}
