package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.StagaireDto;

public interface StagaireService {
	
StagaireDto save(StagaireDto dto);
	
	Optional<StagaireDto> FindById (Integer id);
	
	List <StagaireDto> FindAll();
	
	void Delete (Integer id);

}
