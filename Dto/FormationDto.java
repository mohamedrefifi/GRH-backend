package com.example.demo.Dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.Model.Apprenti;
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
public class FormationDto {


	private Integer id;

	private String themeFor;

	private String dateDebFor;

	private String dateFinFor;
	
   private List <ApprentiDto> apprentiDtos;

	private List<StagaireDto>stagaireDtos;
	
	public static FormationDto fromEntity(Formation formation)
	{
		if (formation==null)
		{
			return null;
		}
		
		return FormationDto.builder()
				.dateDebFor(formation.getDateDebFor())
				.dateFinFor(formation.getDateFinFor())
				.id(formation.getId())
				.themeFor(formation.getThemeFor())
				.apprentiDtos(formation.getApprentis().stream().map(ApprentiDto::fromEntity).collect(Collectors.toList()))
				.stagaireDtos(formation.getStagaires().stream().map(StagaireDto::fromEntity).collect(Collectors.toList()))
				.build();
	}
	
	public static Formation toEntity(FormationDto formationDto)
	{
		if(formationDto==null)
		{
			return null;
		}
		
		Formation formation = new Formation();
		
		formation.setDateDebFor(formationDto.getDateDebFor());
		formation.setDateFinFor(formationDto.getDateFinFor());
		formation.setId(formation.getId());
		formation.setThemeFor(formationDto.getThemeFor());
		
		return formation;
	}
	
	
	
	
}
