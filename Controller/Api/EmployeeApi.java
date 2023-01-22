package com.example.demo.Controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.EmployeeDto;
@CrossOrigin("http://localhost:3000")
public interface EmployeeApi {
	
	@PostMapping(value = "/grh/Employee/save")
	EmployeeDto save(@RequestBody EmployeeDto dto);
	
	@GetMapping(value = "/grh/Employee/find/{id}")
	Optional<EmployeeDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/grh/Employee/find/mat/{matriculeEmp}")
	Optional<EmployeeDto> findByMatriculeEmp (@PathVariable("matriculeEmp") String matriculeEmp);
	
	@GetMapping(value="/grh/Employee/find/all")
	List <EmployeeDto> FindAll();
	
	@DeleteMapping(value = "grh/Employee/delete/{id}")
	void Delete ( @PathVariable("id") Integer id);

}
