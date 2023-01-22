package com.example.demo.Dto;

import java.util.Date;
import com.example.demo.Model.Employee;
import com.example.demo.Model.Enfant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EnfantDto {
	

	private Integer id;
	
	
	private String nomEnf;

	

	private String prenomEnf;
	
	
	
	private Date dateNsEnf;
	

	private Employee employee ;
	
	public static EnfantDto fromEntity (Enfant enfant)
	{
		if (enfant == null)
		{
			return null;
		}
		
		return EnfantDto.builder()
				.dateNsEnf(enfant.getDateNsEnf())
				.id(enfant.getId())
				.nomEnf(enfant.getNomEnf())
				.prenomEnf(enfant.getPrenomEnf())
				.build();
	}
	
	public static Enfant toEntity (EnfantDto enfantDto)
	{
		if(enfantDto==null)
		{
			return null;
		}
		
		Enfant enfant =new Enfant();
		enfant.setDateNsEnf(enfantDto.getDateNsEnf());
		enfant.setId(enfantDto.getId());
		enfant.setNomEnf(enfantDto.getNomEnf());
		enfant.setPrenomEnf(enfantDto.getPrenomEnf());
		
		return enfant;
	}

}
