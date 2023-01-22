package com.example.demo.Dto;

import com.example.demo.Model.PeriodeEssaie;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PeriodeEssaieDto {


	private Integer id;
	
	private String decision;
	
	
	public static  PeriodeEssaieDto fromEntity (PeriodeEssaie periodeEssaie)
	{
		if(periodeEssaie==null)
		{
			return null;
		}
		return 
				
				PeriodeEssaieDto.builder()
				.decision(periodeEssaie.getDecision())
				.id(periodeEssaie.getId())
				.build();
		
	}
	
	public PeriodeEssaie toEntity (PeriodeEssaieDto periodeEssaieDto)
	{
		if (periodeEssaieDto ==null)
		{
			return null;
		}
		
		PeriodeEssaie periodeEssaie = new PeriodeEssaie();
		periodeEssaie.setDecision(periodeEssaieDto.getDecision());
		periodeEssaie.setId(periodeEssaieDto.getId());
		return periodeEssaie;
	}
	
}
