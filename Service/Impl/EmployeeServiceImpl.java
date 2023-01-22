package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;
@Service

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository=employeeRepository;
	}

	@Override
	public EmployeeDto save(EmployeeDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				EmployeeDto.fromEntity(employeeRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<EmployeeDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Employee>cOptional=employeeRepository.findById(id);
		return
				Optional.of(EmployeeDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<EmployeeDto> FindAll() {
		return
		employeeRepository.findAll().stream()
		.map(EmployeeDto::fromEntity)
		.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}		
		employeeRepository.deleteById(id);
	}

	@Override
	public Optional<EmployeeDto> findByMatriculeEmp(String matriculeEmp) {
		if(matriculeEmp==null)
		{
			return null;
		}
		Optional<Employee>cOptional=employeeRepository.findByMatriculeEmp(matriculeEmp);
		return
				Optional.of(EmployeeDto.fromEntity(cOptional.get()));
	}

}
