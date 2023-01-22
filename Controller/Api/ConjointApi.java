package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.Dto.ConjointDto;
@CrossOrigin("http://localhost:3000")
public interface ConjointApi {

	@PostMapping(value = "/grh/Conjoint/save")
	ConjointDto save(@RequestBody ConjointDto dto);
	
	@GetMapping(value = "/grh/Conjoint/find/{id}")
	Optional<ConjointDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Conjoint/find/all")
	List <ConjointDto> FindAll();
	
	@DeleteMapping(value = "grh/Conjoint/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
