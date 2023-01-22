package com.example.demo.Dto;

import java.util.Date;
import com.example.demo.Model.Formation;
import com.example.demo.Model.Stagaire;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StagaireDto {
	
	private Integer id;
	
	private String civiliteStag;
	
	private String nomStag;
	
	private String prenomStag;
	
	private Date dateNsStag;
	
	private String lieuNsStag;
	
	private String adresseStag;
	
	private String dateDebStag;
	
	private String dateFinStag;

	private FormationDto formationdtiDto;
	
	public static StagaireDto fromEntity (Stagaire stagaire)
	{
		if(stagaire==null)
		{
			return null;
		}
		return
		StagaireDto.builder()
		.adresseStag(stagaire.getAdresseStag())
		.civiliteStag(stagaire.getCiviliteStag())
		.dateDebStag(stagaire.getDateDebStag())
		.dateFinStag(stagaire.getDateFinStag())
		.dateNsStag(stagaire.getDateNsStag())
		.id(stagaire.getId())
		.lieuNsStag(stagaire.getLieuNsStag())
		.nomStag(stagaire.getNomStag())
		.prenomStag(stagaire.getPrenomStag())
		.build();
	}
	
	public Stagaire toEntity (StagaireDto stagaireDto)
	{
		if(stagaireDto==null)
		{
			return null;
		}
		
		Stagaire stagaire = new Stagaire();
		stagaire.setAdresseStag(stagaireDto.getAdresseStag());
		stagaire.setCiviliteStag(stagaireDto.getCiviliteStag());
		stagaire.setDateDebStag(stagaireDto.getDateDebStag());
		stagaire.setDateFinStag(stagaireDto.getDateFinStag());
		stagaire.setDateNsStag(stagaireDto.getDateNsStag());
		stagaire.setId(stagaireDto.getId());
		stagaire.setLieuNsStag(stagaireDto.getLieuNsStag());
		stagaire.setNomStag(stagaireDto.getNomStag());
		stagaire.setPrenomStag(stagaireDto.getPrenomStag());
		return stagaire;
	}
}
