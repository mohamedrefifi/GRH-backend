package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.CongeExceptionnel;
import com.example.demo.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CongeExceptionnelDto {

	private Integer id;
	
	
	private String natureCong;
	
	
	private Integer dureeCong;
	
	
	private Date dateEtablCong;
	
	
	private Date dateDebCong;
	

	private Date dateFinCong;
	

	private Date dateRepriseCong;
	

	private Employee employee;
	
	public static CongeExceptionnelDto fromEntity(CongeExceptionnel congeExceptionnel)
	{
		if (congeExceptionnel==null)
		{
			return null;
		}
		
		return CongeExceptionnelDto.builder()
				.dateDebCong(congeExceptionnel.getDateDebCong())
				.dateEtablCong(congeExceptionnel.getDateEtablCong())
				.dateFinCong(congeExceptionnel.getDateFinCong())
				.dateRepriseCong(congeExceptionnel.getDateRepriseCong())
				.dureeCong(congeExceptionnel.getDureeCong())
				.id(congeExceptionnel.getId())
				.natureCong(congeExceptionnel.getNatureCong())
				.build();
	}
	
	public CongeExceptionnel toEntity (CongeExceptionnelDto congeExceptionnelDto)
	{
		if(congeExceptionnelDto==null)
		{
			return null;
		}
		CongeExceptionnel congeExceptionnel = new CongeExceptionnel();
		
		congeExceptionnel.setDateDebCong(congeExceptionnelDto.getDateDebCong());
		congeExceptionnel.setDateEtablCong(congeExceptionnelDto.getDateEtablCong());
		congeExceptionnel.setDateFinCong(congeExceptionnelDto.getDateFinCong());
		congeExceptionnel.setDateRepriseCong(congeExceptionnelDto.getDateRepriseCong());
		congeExceptionnel.setDureeCong(congeExceptionnelDto.getDureeCong());
		congeExceptionnel.setId(congeExceptionnelDto.getId());
		congeExceptionnel.setNatureCong(congeExceptionnelDto.getNatureCong());
		
		
		return congeExceptionnel;
	}
	
	
	
}
