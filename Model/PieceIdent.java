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
@Table(name="PieceIdent")

public class PieceIdent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "numPiece")
	private Integer numPiece;
	
	
	@Column(name = "typePiece")
	private String typePiece;
	
	@Column(name = "dateDelivPiece")
	private Date DateDelivPiece;
	
	@Column(name = "lieuDelivPiece")
	private String lieuDelivPiece;
	
	@ManyToOne
	@JoinColumn(name = "idemployee")
	private Employee employee;
}
