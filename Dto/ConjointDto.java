package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.Conjoint;
import com.example.demo.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConjointDto {

	

	private Integer id;
	

	private String nomCon;
	

	private String prenomCon;
	
	
	private Date dateNsConDate;
	

	private Employee employee ;
	
	public static ConjointDto fromEntity (Conjoint conjoint)
	{
		if (conjoint==null)
		{
			return null;
		}
		
		return ConjointDto.builder()
				.dateNsConDate(conjoint.getDateNsConDate())
				.id(conjoint.getId())
				.nomCon(conjoint.getNomCon())
				.prenomCon(conjoint.getPrenomCon())
				.build();
	}
	
	public Conjoint toEntity (ConjointDto conjointDto)
	{
		if(conjointDto==null)
		{
			return null;
		}
		
		Conjoint conjoint =  new Conjoint();
		
		conjoint.setDateNsConDate(conjointDto.getDateNsConDate());
		conjoint.setId(conjointDto.getId());
		conjoint.setNomCon(conjointDto.getNomCon());
		conjoint.setPrenomCon(conjointDto.getPrenomCon());
		
		
		return conjoint;
	}
}
