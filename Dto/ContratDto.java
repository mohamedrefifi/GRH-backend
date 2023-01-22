package com.example.demo.Dto;

import java.util.Date;
import java.util.List;

import com.example.demo.Model.Contrat;
import com.example.demo.Model.Decision;
import com.example.demo.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ContratDto {

	
	
	private Integer id;
	
	
	private Integer numContrat;
	

	private Integer typeContrat;
	

	private Date dateDebContrat;
	

	private Date dateFinContrat;
	
	
	private Employee employee;
	

	private List<Decision>decisions;
	
	
	public static ContratDto fromEntity (Contrat contrat)
	{
		if(contrat==null)
		{
			return null;
		}
		
		return ContratDto.builder()
				.dateDebContrat(contrat.getDateDebContrat())
				.dateFinContrat(contrat.getDateFinContrat())
				.id(contrat.getId())
				.numContrat(contrat.getNumContrat())
				.typeContrat(contrat.getTypeContrat())
				.build();
	}
	
	public Contrat toEntity (ContratDto contratDto)
	{
		if (contratDto==null)
		{
			return null;
		}
		
		Contrat contrat = new Contrat();
		contrat.setDateDebContrat(contratDto.getDateDebContrat());
		contrat.setDateFinContrat(contratDto.getDateFinContrat());
		contrat.setId(contratDto.getId());
		contrat.setNumContrat(contratDto.getNumContrat());
		contrat.setTypeContrat(contratDto.getTypeContrat());
		
		
		return contrat;
	}
	
	
}
