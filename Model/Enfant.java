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
@Table(name = "Enfant")
public class Enfant {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "nomEnf")
	private String nomEnf;

	
	@Column (name = "prenomEnf")
	private String prenomEnf;
	
	
	@Column (name = "dateNsEnf")
	private Date dateNsEnf;
	
	@ManyToOne ()
	@JoinColumn(name = "idemployee")
	private Employee employee ;
}
