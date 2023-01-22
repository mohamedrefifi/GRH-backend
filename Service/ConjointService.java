package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ConjointDto;

public interface ConjointService {

	

	 ConjointDto save(ConjointDto dto);
		
		Optional<ConjointDto> FindById (Integer id);
		
		List <ConjointDto> FindAll();
		
		void Delete (Integer id);
}
