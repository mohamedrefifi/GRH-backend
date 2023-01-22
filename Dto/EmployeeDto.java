package com.example.demo.Dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.Model.Arret;
import com.example.demo.Model.CongeAnnuel;
import com.example.demo.Model.CongeExceptionnel;
import com.example.demo.Model.Conjoint;
import com.example.demo.Model.Contrat;
import com.example.demo.Model.Employee;
import com.example.demo.Model.Enfant;
import com.example.demo.Model.Grade;
import com.example.demo.Model.PieceIdent;
import com.example.demo.Model.Poste;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeDto {


	private Integer id;
	
	private String matriculeEmp;
	
	private String civiliteEmp;
	
	private String situationFamEmp;
	
	private String nomEmp;
	
	private String prenomEmp;
	
	private Date dateNsEmp;
	
	private String lieuNsEmp;
	
	private String adresseEmp;

	private String numTelEmp;

   @JsonIgnore
	private List<EnfantDto> enfantDtos;

	private GradeDto gradeDto;
	
	private ConjointDto conjointDto;
	
	private PosteDto posteDto;
	  @JsonIgnore
	private List<ArretDto> arretDtos;
	  @JsonIgnore
	private List<CongeAnnuelDto> congeAnnuelDtos;
	  @JsonIgnore
	private List<CongeExceptionnelDto> congeExceptionnelDtos;
	
	private ContratDto contratDto;
	  @JsonIgnore
	private List<PieceIdentDto>pieceIdents;
	
	public static EmployeeDto fromEntity (Employee employee)
	{
		if(employee==null)
		{
			return null;
		}
		return 
				EmployeeDto.builder()
				.adresseEmp(employee.getAdresseEmp())
				.civiliteEmp(employee.getCiviliteEmp())
				.dateNsEmp(employee.getDateNsEmp())
				.id(employee.getId())
				.lieuNsEmp(employee.getLieuNsEmp())
				.matriculeEmp(employee.getMatriculeEmp())
				.nomEmp(employee.getNomEmp())
				.numTelEmp(employee.getNumTelEmp())
				.prenomEmp(employee.getPrenomEmp())
				.situationFamEmp(employee.getSituationFamEmp())
				.congeAnnuelDtos(employee.getCongeAnnuels()
						.stream().map(CongeAnnuelDto::fromEntity)
						.collect(Collectors.toList()))
						.build();
	}
	
  public static Employee toEntity (EmployeeDto employeeDto)
  {
	  if(employeeDto==null)
	  {
		  return null;
	  }
	  
	  Employee employee = new Employee();
	  
	  employee.setAdresseEmp(employeeDto.getAdresseEmp());
	  employee.setCiviliteEmp(employeeDto.getCiviliteEmp());
	  employee.setDateNsEmp(employeeDto.getDateNsEmp());
	  employee.setId(employeeDto.getId());
	  employee.setLieuNsEmp(employeeDto.getLieuNsEmp());
	  employee.setMatriculeEmp(employeeDto.getMatriculeEmp());
	  employee.setNomEmp(employeeDto.getNomEmp());
	  employee.setNumTelEmp(employeeDto.getNumTelEmp());
	  employee.setPrenomEmp(employeeDto.getPrenomEmp());
	  employee.setSituationFamEmp(employeeDto.getSituationFamEmp());
	 employee.setCongeAnnuels(employeeDto.getCongeAnnuelDtos()
			 .stream().map(CongeAnnuelDto::toEntity)
			 .collect(Collectors.toList()));
			 
              	 
	 
	  return employee;

  }
	
}
