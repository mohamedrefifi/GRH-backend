package com.example.demo.Model;


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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Formation")
@EqualsAndHashCode
public class Formation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "themeFor")
	private String themeFor;
	
	@Column(name = "dateDebFor")
	private String dateDebFor;
	
	@Column(name = "dateFinFor")
	private String dateFinFor;
	
	@OneToMany(mappedBy = "formation")
   private List <Apprenti> apprentis;
	
	@OneToMany(mappedBy = "formation")
	private List<Stagaire>stagaires;
}
