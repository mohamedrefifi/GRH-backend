package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.Model.OrdreDeMission;
import com.example.demo.Model.Vehicule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OrdreDeMissionDto {
	
	private Integer id;
	
	private String objMiS;
	
	private String destinatinMiS;
	
	private Date dateDepMiS;
	
	private Date dateRtrMiS;
	
	private Date HeurDepMiS;
	
	private Date HeurRtrMiS;
	
    private Vehicule vehicule;
    
    public static OrdreDeMissionDto fromEntity (OrdreDeMission ordreDeMission)
    {
    	if(ordreDeMission==null)
    	{
    		return null;
    	}
    	
    	return OrdreDeMissionDto.builder()
    			.dateDepMiS(ordreDeMission.getDateDepMiS())
    			.dateRtrMiS(ordreDeMission.getDateRtrMiS())
    			.destinatinMiS(ordreDeMission.getDestinatinMiS())
    			.HeurDepMiS(ordreDeMission.getHeurDepMiS())
    			.HeurRtrMiS(ordreDeMission.getHeurRtrMiS())
    			.id(ordreDeMission.getId())
    			.objMiS(ordreDeMission.getObjMiS())
    			.build();
    }

    public OrdreDeMission toEntity (OrdreDeMissionDto ordreDeMissionDto)
    {
    	if(ordreDeMissionDto==null)
    	{
    		return null;
    	}
    	
    	OrdreDeMission ordreDeMission = new OrdreDeMission();
    	
    	ordreDeMission.setDateDepMiS(ordreDeMissionDto.getDateDepMiS());
    	ordreDeMission.setDateRtrMiS(ordreDeMissionDto.getDateRtrMiS());
    	ordreDeMission.setDestinatinMiS(ordreDeMissionDto.getDestinatinMiS());
    	ordreDeMission.setHeurDepMiS(ordreDeMissionDto.getHeurDepMiS());
    	ordreDeMission.setHeurRtrMiS(ordreDeMissionDto.getHeurRtrMiS());
    	ordreDeMission.setId(ordreDeMissionDto.getId());
    	ordreDeMission.setObjMiS(ordreDeMissionDto.getObjMiS());
    	
    	return ordreDeMission;
    }
    
}
