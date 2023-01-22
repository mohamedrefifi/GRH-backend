package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Dto.PieceIdentDto;
@CrossOrigin("http://localhost:3000")
public interface PieceIdentApi {

	@PostMapping(value = "/grh/PiecIdent/save")
	PieceIdentDto save(@RequestBody PieceIdentDto dto);
	
	@GetMapping(value = "/grh/PiecIdent/find/{id}")
	Optional<PieceIdentDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value="/grh/PiecIdent/find/all")
	List <PieceIdentDto> FindAll();
	
	@DeleteMapping(value = "grh/PiecIdent/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);
}
