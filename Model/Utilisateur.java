package com.example.demo.Model;

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
@Table(name = "Utilisateur")

public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nomUser")
	private String nomUser;
	
	
	@Column(name = "prenomUser")
	private String prenomUser;	
	
	@Column(name = "RoleUser")
	private String RoleUser;
	
	@Column(name = "emailUser")
	private String emailUser;
	
	@Column(name = "mdpUser")
	private String mdpUser;
	
	@ManyToOne
	@JoinColumn(name = "idmessage")
	private Message message;

}
