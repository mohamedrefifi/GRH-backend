package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.DecisionDto;
@CrossOrigin("http://localhost:3000")
public interface DecisionApi {
	@PostMapping(value = "/grh/Decision/save")
	DecisionDto save(@RequestBody DecisionDto dto);
	
	@GetMapping(value = "/grh/Decision/find/{id}")
	Optional<DecisionDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Decision/find/all")
	List <DecisionDto> FindAll();
	
	@DeleteMapping(value = "grh/Decision/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
