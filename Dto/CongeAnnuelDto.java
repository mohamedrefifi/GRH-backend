package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.CongeAnnuel;
import com.example.demo.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CongeAnnuelDto {

	
	
	private Integer id;
	

	private Integer anneeCong;
	

	private Integer soldeCong;
	

	private Integer dureeCong;
	

	private Date dateDebCong;
	
	
	private Date dateFinCong;	
	

	private Date dateRepCong;
	
	
	private EmployeeDto employee;
	
	public static CongeAnnuelDto fromEntity (CongeAnnuel congeAnnuel)
	{
		if(congeAnnuel==null)
		{
			return null;
		}
		return CongeAnnuelDto.builder()
				.anneeCong(congeAnnuel.getAnneeCong())
				.dateDebCong(congeAnnuel.getDateDebCong())
				.dateFinCong(congeAnnuel.getDateFinCong())
				.dateRepCong(congeAnnuel.getDateRepCong())
				.dureeCong(congeAnnuel.getDureeCong())
				.id(congeAnnuel.getId())
				.soldeCong(congeAnnuel.getSoldeCong())
				
				.build();			
	}
	
	public static CongeAnnuel toEntity (CongeAnnuelDto congeAnnuelDto)
	{
		if(congeAnnuelDto==null)
		{
			return null;
		}
		
		CongeAnnuel congeAnnuel = new CongeAnnuel();
		congeAnnuel.setAnneeCong(congeAnnuelDto.getAnneeCong());
		congeAnnuel.setDateDebCong(congeAnnuelDto.getDateDebCong());
		congeAnnuel.setDateFinCong(congeAnnuelDto.getDateFinCong());
		congeAnnuel.setDateRepCong(congeAnnuelDto.getDateRepCong());
		congeAnnuel.setId(congeAnnuelDto.getId());
		congeAnnuel.setDureeCong(congeAnnuelDto.getDureeCong());
		congeAnnuel.setSoldeCong(congeAnnuelDto.getSoldeCong());
		congeAnnuel.setEmployee(EmployeeDto.toEntity(congeAnnuelDto.getEmployee()));
		return congeAnnuel;
	}
}
