package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.EnfantDto;

public interface EnfantService {
	
    EnfantDto save(EnfantDto dto);
	
	Optional<EnfantDto> FindById (Integer id);
	
	List <EnfantDto> FindAll();
	
	void Delete (Integer id);

}
