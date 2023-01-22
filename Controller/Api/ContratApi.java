package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.ContratDto;
@CrossOrigin("http://localhost:3000")
public interface ContratApi {
	
	@PostMapping(value = "/grh/Contrat/save")
	ContratDto save(@RequestBody ContratDto dto);
	
	@GetMapping(value = "/grh/Contrat/find/{id}")
	Optional<ContratDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Contrat/find/all")
	List <ContratDto> FindAll();
	
	@DeleteMapping(value = "grh/Contrat/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
