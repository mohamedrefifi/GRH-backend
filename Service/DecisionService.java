package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.DecisionDto;

public interface DecisionService {
	
	DecisionDto save(DecisionDto dto);
	
	Optional<DecisionDto> FindById (Integer id);
	
	List <DecisionDto> FindAll();
	
	void Delete (Integer id);
}
