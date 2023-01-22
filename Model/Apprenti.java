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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Apprenti")
@EqualsAndHashCode
public class Apprenti {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "civiliteApr")
	private String civiliteApr;
	
	@Column(name = "nomApr")
	private String nomApr;
	
	@Column(name = "prenomApr")
	private String prenomApr;
	
	@Column(name = "dateNsApr")
	private Date dateNsApr;
	
	@Column(name = "lieuNsApr")
	private String lieuNsApr;
	
	@Column(name = "adresseApr")
	private String adresseApr;
	
	@Column(name = "organismeExtApr")
	private String organismeExtApr;
	
	@Column(name = "DateInstlApr")
	private Date DateInstlApr;
	
	@ManyToOne
	@JoinColumn(name = "idformation")
	private Formation formation;

}
