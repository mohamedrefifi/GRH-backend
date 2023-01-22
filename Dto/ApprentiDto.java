package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.Apprenti;
import com.example.demo.Model.Formation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ApprentiDto {

	
	private Integer id;
	
	
	private String civiliteApr;
	

	private String nomApr;
	
	
	private String prenomApr;
	

	private Date dateNsApr;
	

	private String lieuNsApr;
	

	private String adresseApr;
	
	
	private String organismeExtApr;
	
	
	private Date DateInstlApr;
	

	private FormationDto formationDto;
	
	public static ApprentiDto fromEntity (Apprenti apprenti)
	{
		if(apprenti==null)
			{return null;}
		
		return ApprentiDto.builder()
				.adresseApr(apprenti.getAdresseApr())
				.civiliteApr(apprenti.getCiviliteApr())
				.DateInstlApr(apprenti.getDateInstlApr())
				.id(apprenti.getId())
				.nomApr(apprenti.getNomApr())
				.prenomApr(apprenti.getPrenomApr())
				.dateNsApr(apprenti.getDateNsApr())
				.lieuNsApr(apprenti.getLieuNsApr())
				.organismeExtApr(apprenti.getOrganismeExtApr())
				.formationDto(FormationDto.fromEntity(apprenti.getFormation()))
				.build();
	}
	
	public  static Apprenti toEntity (ApprentiDto apprentiDto)
	{
		if(apprentiDto==null)
		{
			return null;
		}
		
		Apprenti apprenti = new Apprenti();
		
		apprenti.setAdresseApr(apprentiDto.getAdresseApr());
		apprenti.setCiviliteApr(apprentiDto.getCiviliteApr());
		apprenti.setDateInstlApr(apprentiDto.getDateInstlApr());
		apprenti.setDateNsApr(apprentiDto.getDateNsApr());
		apprenti.setId(apprentiDto.getId());
		apprenti.setLieuNsApr(apprentiDto.getLieuNsApr());
		apprenti.setNomApr(apprentiDto.getNomApr());
		apprenti.setOrganismeExtApr(apprentiDto.getOrganismeExtApr());
		apprenti.setPrenomApr(apprentiDto.getPrenomApr());
	
	
		
		return apprenti;
		
		
		
	}

}
