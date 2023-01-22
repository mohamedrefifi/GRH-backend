package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.PeriodeEssaieDto;
import com.example.demo.Model.PeriodeEssaie;
@CrossOrigin("http://localhost:3000")
public interface PeriodeEssaieApi {
	
	@PostMapping(value = "grh/pessaie/save")
	PeriodeEssaieDto save(@RequestBody PeriodeEssaieDto dto);
	
	@GetMapping(value = "grh/pessaie/find/{id}")
	Optional<PeriodeEssaieDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "grh/pessaie/find/all")
	List <PeriodeEssaieDto> FindAll();
	
	@DeleteMapping(value = "grh/pessaie/delete/{id}")
	void Delete (@PathVariable("id") Integer id);

}
