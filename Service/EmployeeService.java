package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import com.example.demo.Dto.EmployeeDto;

public interface EmployeeService {
	
    EmployeeDto save(EmployeeDto dto);
	
	Optional<EmployeeDto> FindById (Integer id);
	
	Optional<EmployeeDto> findByMatriculeEmp (String matriculeEmp);
	
	List <EmployeeDto> FindAll();
	
	void Delete (Integer id);

}
