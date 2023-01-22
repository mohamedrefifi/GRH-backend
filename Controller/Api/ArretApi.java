package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.ArretDto;
@CrossOrigin("http://localhost:3000")
public interface ArretApi {
	
	@PostMapping(value="grh/arret/save")
    ArretDto save(@RequestBody ArretDto dto);
	
	@GetMapping(value="grh/arret/find/{id}")
	Optional<ArretDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="grh/arret/find/all")
	List <ArretDto> FindAll();
	
	@DeleteMapping(value = "grh/arret/delete/{id}")
	void Delete (@PathVariable("id") Integer id);


}
