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
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vehicule")
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "immatriculation")
	private String immatriculation;
	
	@Column(name = "desVehicule")
	private String desVehicule;
	
	@OneToMany(mappedBy = "vehicule")
	private List< OrdreDeMission>ordreDeMissions;
	
}
