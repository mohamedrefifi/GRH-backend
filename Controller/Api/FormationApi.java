package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Dto.FormationDto;
@CrossOrigin("http://localhost:3000")
public interface FormationApi {

	@PostMapping(value = "/grh/Formation/save")
	FormationDto save(@RequestBody FormationDto dto);
	
	@GetMapping(value = "/grh/Formation/find/{id}")
	Optional<FormationDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Formation/find/all")
	List <FormationDto> FindAll();
	
	@DeleteMapping(value = "grh/Formation/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
