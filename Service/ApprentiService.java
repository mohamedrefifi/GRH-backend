package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ApprentiDto;


public interface ApprentiService {
	
    ApprentiDto save(ApprentiDto dto);
	
	Optional<ApprentiDto> FindById (Integer id);
	
	List <ApprentiDto> FindAll();
	
	void Delete (Integer id);

}
