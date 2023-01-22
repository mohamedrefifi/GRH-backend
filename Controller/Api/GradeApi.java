package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.FormationDto;
import com.example.demo.Dto.GradeDto;
@CrossOrigin("http://localhost:3000")
public interface GradeApi {


	@PostMapping(value = "/grh/Grade/save")
	GradeDto save(@RequestBody GradeDto dto);
	
	@GetMapping(value = "/grh/Grade/find/{id}")
	Optional<GradeDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Grade/find/all")
	List <GradeDto> FindAll();
	
	@DeleteMapping(value = "grh/Grade/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
