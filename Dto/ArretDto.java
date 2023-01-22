package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.Arret;
import com.example.demo.Model.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ArretDto {
	
	private Integer id;
	
	
	private String desg;
	

	private Integer dureeArt;
	
	
	private Date DateEtblArt;
	

	private Date DateDebArt;
	

	private Date DateFinArt;
	

	private Date DateRepArt;
	
	
	private Employee employee;
	
	public static ArretDto fromEntity(Arret arret)
	{
		if (arret==null)
		{
			return null;
		}
		
		return
				ArretDto.builder()
				.DateDebArt(arret.getDateDebArt())
				.DateEtblArt(arret.getDateEtblArt())
				.DateFinArt(arret.getDateFinArt())
				.DateRepArt(arret.getDateRepArt())
				.desg(arret.getDesg())
				.dureeArt(arret.getDureeArt())
				.id(arret.getId())
				.build();
	}
	
	public static Arret toEntity (ArretDto arretDto)
	{
		if (arretDto==null)
		{
			return null;
		}
		
		Arret arret = new Arret();
		
		arret.setDateDebArt(arretDto.getDateDebArt());
		arret.setDateEtblArt(arretDto.getDateEtblArt());
		arret.setDateFinArt(arretDto.getDateFinArt());
		arret.setDateRepArt(arretDto.getDateRepArt());
		arret.setDesg(arretDto.getDesg());
		arret.setDureeArt(arretDto.getDureeArt());
        arret.setId(arretDto.getId());		
		
		return arret;
	}

}
