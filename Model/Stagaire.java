package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Stagaire")

public class Stagaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "civiliteStag")
	private String civiliteStag;
	
	@Column(name = "nomStag")
	private String nomStag;
	
	@Column(name = "prenomStag")
	private String prenomStag;
	
	@Column(name = "dateNsStag")
	private Date dateNsStag;
	
	@Column(name = "lieuNsStag")
	private String lieuNsStag;
	
	@Column(name = "adresseStag")
	private String adresseStag;
	
	@Column(name="dateDebStag")
	private String dateDebStag;
	
	@Column(name="dateFinStag")
	private String dateFinStag;
	
	@ManyToOne
	@JoinColumn(name = "idformation")
	private Formation formation;
	
	

}
