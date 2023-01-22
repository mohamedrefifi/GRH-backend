package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.EmployeeApi;
import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Service.EmployeeService;

@RestController

public class EmployeeController implements EmployeeApi {
	
	private EmployeeService employeeService;
	@Autowired
	public EmployeeController (EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}

	@Override
	public EmployeeDto save(EmployeeDto dto) {
	if(dto==null)
	{
		return null;
	}
	return employeeService.save(dto);
	}

	@Override
	public Optional<EmployeeDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return employeeService.FindById(id);
	}

	@Override
	public List<EmployeeDto> FindAll() {
		return employeeService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}		
		employeeService.Delete(id);
	}

	@Override
	public Optional<EmployeeDto> findByMatriculeEmp(String matriculeEmp) {
		if(matriculeEmp==null)
		{
			return null;
		}
		return employeeService.findByMatriculeEmp(matriculeEmp);
	}

}
