package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Dto.CongeExceptionnelDto;
@CrossOrigin("http://localhost:3000")
public interface CongeExceptionnelApi {

	@PostMapping(value = "/grh/CoExcep/save")
	CongeExceptionnelDto save(@RequestBody CongeExceptionnelDto dto);
	
	@GetMapping(value = "/grh/CoExcep/find/{id}")
	Optional<CongeExceptionnelDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/CoExcep/find/all")
	List <CongeExceptionnelDto> FindAll();
	
	@DeleteMapping(value = "grh/CoExcep/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
