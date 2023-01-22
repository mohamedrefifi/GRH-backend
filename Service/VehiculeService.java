package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.VehiculeDto;

public interface VehiculeService {

VehiculeDto save(VehiculeDto dto);
	
	Optional<VehiculeDto> FindById (Integer id);
	
	List <VehiculeDto> FindAll();
	
	void Delete (Integer id);
}
