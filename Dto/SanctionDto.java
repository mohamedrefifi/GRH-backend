package com.example.demo.Dto;

import java.util.List;
import com.example.demo.Model.Decision;
import com.example.demo.Model.Sanction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SanctionDto {

	private Integer id;
	
    private String natureSanc;

	private List<Decision>decisions;
	
	public static SanctionDto fromEntity (Sanction sanction)
	{
		if(sanction==null)
		{
			return null;
		}
		return SanctionDto.builder()
				.id(sanction.getId())
				.natureSanc(sanction.getNatureSanc())
				.build();
	}
	
	public Sanction toEntity (SanctionDto sanctionDto)
	{
		if(sanctionDto==null)
		{
			return null;
		}
		
		Sanction sanction = new Sanction();
		sanction.setId(sanctionDto.getId());
		sanction.setNatureSanc(sanctionDto.getNatureSanc());
		return sanction;
	}
}
