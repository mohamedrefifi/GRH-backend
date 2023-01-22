package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.EnfantDto;
@CrossOrigin("http://localhost:3000")
public interface EnfantApi {

	
	@PostMapping(value = "/grh/Enfant/save")
	EnfantDto save(@RequestBody EnfantDto dto);
	
	@GetMapping(value = "/grh/Enfant/find/{id}")
	Optional<EnfantDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Enfant/find/all")
	List <EnfantDto> FindAll();
	
	@DeleteMapping(value = "grh/Enfant/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
