package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.FormationDto;

public interface FormationService {

    FormationDto save(FormationDto dto);
	
	Optional<FormationDto> FindById (Integer id);
	
	List <FormationDto> FindAll();
	
	void Delete (Integer id);
}
