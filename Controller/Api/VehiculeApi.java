package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Dto.VehiculeDto;
@CrossOrigin("http://localhost:3000")
public interface VehiculeApi {

	@PostMapping(value = "/grh/Vehicule/save")
	VehiculeDto save(@RequestBody VehiculeDto dto);
	
	@GetMapping(value = "/grh/Vehicule/find/{id}")
	Optional<VehiculeDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Vehicule/find/all")
	List <VehiculeDto> FindAll();
	
	@DeleteMapping(value = "grh/Vehicule/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
