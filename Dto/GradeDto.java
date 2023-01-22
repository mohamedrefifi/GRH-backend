package com.example.demo.Dto;

import java.util.List;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Grade;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GradeDto {


	private Integer id;

	private String salairebase;


	private List<Employee> employee;
	
	public static GradeDto fromEntity (Grade grade)
	{
		if(grade ==null)
		{
			return null;
		}
		return
		GradeDto.builder()
		.id(grade.getId())
		.salairebase(grade.getSalairebase())
		.build();	
	}
	
	public Grade toEntity (GradeDto gradeDto)
	{
		if(gradeDto==null)
		{
			return null;
		}
		Grade grade =new Grade();
		
		grade.setId(gradeDto.getId());
		grade.setSalairebase(gradeDto.getSalairebase());
		
		return grade;
	}
	
}
