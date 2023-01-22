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
@Table(name = "Arret")

public class Arret {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="desgArt")
	private String desg;
	
	@Column(name="dureeArt")
	private Integer dureeArt;
	
	@Column(name="DateEtblArt")
	private Date DateEtblArt;
	
	@Column(name="DateDeblArt")
	private Date DateDebArt;
	
	@Column(name="DateFinlArt")
	private Date DateFinArt;
	
	@Column(name="DateRepArt")
	private Date DateRepArt;
	
	@ManyToOne()
	@JoinColumn(name = "idemployee")
	private Employee employee;
	
	
	

}
