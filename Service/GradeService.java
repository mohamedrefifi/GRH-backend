package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.GradeDto;

public interface GradeService {

    GradeDto save(GradeDto dto);
	
	Optional<GradeDto> FindById (Integer id);
	
	List <GradeDto> FindAll();
	
	void Delete (Integer id);
}
