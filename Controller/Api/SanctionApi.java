package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.SanctionDto;
@CrossOrigin("http://localhost:3000")
public interface SanctionApi {
	
	@PostMapping(value = "/grh/Sanction/save")
	SanctionDto save(@RequestBody SanctionDto dto);
	
	@GetMapping(value = "/grh/Sanction/find/{id}")
	Optional<SanctionDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Sanction/find/all")
	List <SanctionDto> FindAll();
	
	@DeleteMapping(value = "grh/Sanction/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
