package com.example.demo.Dto;

import java.util.Date;
import com.example.demo.Model.Contrat;
import com.example.demo.Model.Decision;
import com.example.demo.Model.Promotion;
import com.example.demo.Model.Sanction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DecisionDto {

	
	private Integer id;
	

	private String natureDec;
	

	private Date dateDec;
	

	private Sanction sanction;
	
	private Promotion promotion;
	
	
	private Contrat contrat;

	
	public static DecisionDto fromEntity (Decision decision)
	{
		if(decision==null)
		{
			return null;
		}
		return DecisionDto.builder()
				.dateDec(decision.getDateDec())
				.id(decision.getId())
				.natureDec(decision.getNatureDec())
				.build();
	}
	
	public Decision toEntity (DecisionDto decisionDto)
	{
		if(decisionDto==null)
		{
			return null;
		}
		Decision decision = new Decision();
		
		decision.setDateDec(decisionDto.getDateDec());
		decision.setId(decisionDto.getId());
		decision.setNatureDec(decisionDto.getNatureDec());
		return decision;
	}
	
}
