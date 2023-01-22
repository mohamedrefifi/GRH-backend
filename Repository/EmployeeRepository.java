package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.CongeAnnuel;
import com.example.demo.Model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	 Optional <Employee> findByMatriculeEmp(String matriculeEmp);
	

}
