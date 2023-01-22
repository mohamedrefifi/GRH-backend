package com.example.demo.Dto;

import java.util.List;
import com.example.demo.Model.Employee;
import com.example.demo.Model.Poste;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PosteDto {

	private Integer id;
	

	private String desPoste;
	
	
	private List<Employee>employees;
	
	public static PosteDto fromEntity (Poste poste)
	{
		if(poste==null)
		{
			return null;
		}
		
		return PosteDto.builder()
				.desPoste(poste.getDesPoste())
				.id(poste.getId())
				.build();
	}
	
	public Poste toEntity (PosteDto posteDto)
	{
		if(posteDto==null)
		{
			return null;
		}
		
		Poste poste = new Poste();
		poste.setDesPoste(posteDto.getDesPoste());
		poste.setId(posteDto.getId());
		return poste;
	}
	
	
}
