package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.PromotionDto;
@CrossOrigin("http://localhost:3000")
public interface PromotionApi {
	
	@PostMapping(value = "/grh/Promotion/save")
	PromotionDto save(@RequestBody PromotionDto dto);
	
	@GetMapping(value = "/grh/Promotion/find/{id}")
	Optional<PromotionDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Promotion/find/all")
	List <PromotionDto> FindAll();
	
	@DeleteMapping(value = "grh/Promotion/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
