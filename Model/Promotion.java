package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Promotion")
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "ancienPoste")
	private String ancienPoste;
	
	@Column(name = "NouveauPoste")
	private String NouveauPoste;
	
	@Column(name = "datePromo")
	private Date datePromo;
	
	@OneToMany (mappedBy = "promotion")
	private List<Decision>decisions;
}
