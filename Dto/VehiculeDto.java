package com.example.demo.Dto;

import java.util.List;
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
public class VehiculeDto {

	private Integer id;

	private String immatriculation;
	
	private String desVehicule;
	
	private List< OrdreDeMission>ordreDeMissions;
	
	public static VehiculeDto fromEntity  (Vehicule vehicule)
	{
		if(vehicule==null)
		{
			return null;
		}
		return
		VehiculeDto.builder()
		.desVehicule(vehicule.getDesVehicule())
		.id(vehicule.getId())
		.immatriculation(vehicule.getImmatriculation())
		.build();
	}
	
	public Vehicule toEntity (VehiculeDto vehiculeDto)
	{
		if(vehiculeDto==null)
		{
			return null;
		}
		
		Vehicule vehicule = new Vehicule();
		vehicule.setDesVehicule(vehiculeDto.getDesVehicule());
		vehicule.setId(vehiculeDto.getId());
		vehicule.setImmatriculation(vehiculeDto.getImmatriculation());
		return vehicule;
	}
}
