package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Dto.UtilisateurDto;
@CrossOrigin("http://localhost:3000")
public interface UtilisateurApi {
	
	@PostMapping(value = "/grh/utilisateur/save")
	UtilisateurDto save(@RequestBody UtilisateurDto dto);
	
	@GetMapping(value = "/grh/utilisateur/find/{id}")
	Optional<UtilisateurDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/utilisateur/find/all")
	List <UtilisateurDto> FindAll();
	
	@DeleteMapping(value = "grh/utilisateur/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);


}
