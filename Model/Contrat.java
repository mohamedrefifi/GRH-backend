package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Contrat")


public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "numContrat")
	private Integer numContrat;
	
	@Column (name = "typeContrat")
	private Integer typeContrat;
	
	@Column (name = "dateDebContrat")
	private Date dateDebContrat;
	
	@Column (name = "dateFinContrat")
	private Date dateFinContrat;
	
	@OneToOne
	@JoinColumn(name = "idemployee")
	private Employee employee;
	
	@OneToMany (mappedBy = "contrat")
	private List<Decision>decisions;
	
	



}
