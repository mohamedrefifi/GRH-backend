package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ContratDto;

public interface ContratService {

	ContratDto save(ContratDto dto);
	
	Optional<ContratDto> FindById (Integer id);
	
	List <ContratDto> FindAll();
	
	void Delete (Integer id);
}
