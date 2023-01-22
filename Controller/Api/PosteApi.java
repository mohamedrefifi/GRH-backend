package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.PosteDto;
@CrossOrigin("http://localhost:3000")
public interface PosteApi {
	@PostMapping(value = "/grh/Poste/save")
	PosteDto save(@RequestBody PosteDto dto);
	
	@GetMapping(value = "/grh/Poste/find/{id}")
	Optional<PosteDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Poste/find/all")
	List <PosteDto> FindAll();
	
	@DeleteMapping(value = "grh/Poste/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
