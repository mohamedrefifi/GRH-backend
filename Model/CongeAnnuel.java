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
@Table(name = "CongeAnnuel")


public class CongeAnnuel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "anneeCong")
	private Integer anneeCong;
	
	@Column(name = "soldeCong")
	private Integer soldeCong;
	
	@Column(name = "dureeCong")
	private Integer dureeCong;
	
	@Column(name = "dateDebCong")
	private Date dateDebCong;
	
	@Column(name = "dateFinCong")
	private Date dateFinCong;	
	
	@Column(name = "dateRepCong")
	private Date dateRepCong;
	
	
	@ManyToOne
	@JoinColumn(name = "idemployee")
	private Employee employee;



}
