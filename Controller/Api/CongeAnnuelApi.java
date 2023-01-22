package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.CongeAnnuelDto;
@CrossOrigin("http://localhost:3000")
public interface CongeAnnuelApi {
	
	
	@PostMapping(value = "/grh/congeannuel/save")
	CongeAnnuelDto save(@RequestBody CongeAnnuelDto dto);
	
    @GetMapping(value = "/grh/congeannuel/find/{id}")
	Optional<CongeAnnuelDto> FindById (@PathVariable("id") Integer id);
	
    @GetMapping(value = "/grh/congeannuel/find/all")
    List <CongeAnnuelDto> FindAll();
	
    @DeleteMapping(value = "/grh/congeannuel/delete/{id}")
	void Delete (@PathVariable("id") Integer id);

}
