package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.ApprentiDto;
@CrossOrigin("http://localhost:3000")
public interface ApprentiApi {
	
	
	@PostMapping(value = "/grh/apprenti/save")
    ApprentiDto save(@RequestBody ApprentiDto dto);
	
	@GetMapping(value = "/grh/apprenti/find/{id}")
	Optional<ApprentiDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/apprenti/find/all")
	List <ApprentiDto> FindAll();
	
	@DeleteMapping(value = "grh/apprenti/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
