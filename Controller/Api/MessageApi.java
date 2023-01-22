package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.MessageDto;

@CrossOrigin("http://localhost:3000")
public interface MessageApi {

	@PostMapping(value = "/grh/Message/save")
	MessageDto save(@RequestBody MessageDto dto);
	
	@GetMapping(value = "/grh/Message/find/{id}")
	Optional<MessageDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/Message/find/all")
	List <MessageDto> FindAll();
	
	@DeleteMapping(value = "grh/Message/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
