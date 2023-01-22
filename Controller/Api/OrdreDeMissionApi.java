package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.OrdreDeMissionDto;

@CrossOrigin("http://localhost:3000")
public interface OrdreDeMissionApi {

	@PostMapping(value = "/grh/ordMiss/save")
	OrdreDeMissionDto save(@RequestBody OrdreDeMissionDto dto);
	
	@GetMapping(value = "/grh/ordMiss/find/{id}")
	Optional<OrdreDeMissionDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/ordMiss/find/all")
	List <OrdreDeMissionDto> FindAll();
	
	@DeleteMapping(value = "grh/ordMiss/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
