package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ApprentiDto;
import com.example.demo.Dto.ArretDto;

public interface ArretService  {


    ArretDto save(ArretDto dto);
	
	Optional<ArretDto> FindById (Integer id);
	
	List <ArretDto> FindAll();
	
	void Delete (Integer id);
}
