package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.StagaireDto;
@CrossOrigin("http://localhost:3000")
public interface StagaireApi {
	@PostMapping(value = "/grh/Stagaire/save")
	StagaireDto save(@RequestBody StagaireDto dto);
	
	@GetMapping(value = "/grh/Stagaire/find/{id}")
	Optional<StagaireDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Stagaire/find/all")
	List <StagaireDto> FindAll();
	
	@DeleteMapping(value = "grh/Stagaire/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
