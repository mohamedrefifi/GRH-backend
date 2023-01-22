package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.Dto.CongeAnnuelDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Employee")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "matriculeEmp")
	private String matriculeEmp;
	
	@Column(name = "civiliteEmp")
	private String civiliteEmp;
	
	@Column(name = "situationFamEmp")
	private String situationFamEmp;
	
	@Column(name = "nomEmp")
	private String nomEmp;
	
	@Column(name = "prenomEmp")
	private String prenomEmp;
	
	@Column(name = "dateNsEmp")
	private Date dateNsEmp;
	
	@Column(name = "lieuNsEmp")
	private String lieuNsEmp;
	
	@Column(name = "adresseEmp")
	private String adresseEmp;
	
	@Column(name = "numTelEmp")
	private String numTelEmp;
	
	@OneToMany(mappedBy = "employee")
	private List<Enfant> enfants;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idgrade")
	private Grade grade;
	
	@OneToOne
	@JoinColumn(name = "idconjoint")
	private Conjoint conjoint;
	
	@ManyToOne
	@JoinColumn(name = "idposte")
	private Poste poste;
	
	@OneToMany(mappedBy = "employee")
	private List<Arret> arrets;
	
	@OneToMany(mappedBy = "employee")
	private List<CongeAnnuel> congeAnnuels;
	
 
	@OneToMany(mappedBy = "employee")
	private List<CongeExceptionnel> congeExceptionnels;
	
	@OneToOne
	@JoinColumn(name = "idcontrat")
	private Contrat contrat;
	
	@OneToMany(mappedBy = "employee")
	private List<PieceIdent>pieceIdents;
}
