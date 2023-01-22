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
@Table(name = "OrdreDeMission")

public class OrdreDeMission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "objMis")
	private String objMiS;
	
	@Column(name = "destinationMis")
	private String destinatinMiS;
	
	@Column(name = "dateDepMis")
	private Date dateDepMiS;
	
	@Column(name = "dateRtrMis")
	private Date dateRtrMiS;
	
	@Column(name = "HeurDepMis")
	private Date HeurDepMiS;
	
	@Column(name = "HeurRtrMis")
	private Date HeurRtrMiS;
	
   @ManyToOne
   @JoinColumn(name = "idvehicule")
    private Vehicule vehicule;
	

}
