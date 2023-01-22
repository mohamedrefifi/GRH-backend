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
@Table(name = "CongeExceptionnel")

public class CongeExceptionnel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="natureCong")
	private String natureCong;
	
	@Column(name="dureeCong")
	private Integer dureeCong;
	
	@Column(name="DateEtablCong")
	private Date dateEtablCong;
	
	@Column(name="DateDebCong")
	private Date dateDebCong;
	
	@Column(name="DateFinCong")
	private Date dateFinCong;
	
	@Column(name="DateRepriseCong")
	private Date dateRepriseCong;
	
	@ManyToOne
	@JoinColumn(name = "idemployee")
	private Employee employee;
}

