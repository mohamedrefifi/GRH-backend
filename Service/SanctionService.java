package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.SanctionDto;

public interface SanctionService {

SanctionDto save(SanctionDto dto);
	
	Optional<SanctionDto> FindById (Integer id);
	
	List <SanctionDto> FindAll();
	
	void Delete (Integer id);
}
