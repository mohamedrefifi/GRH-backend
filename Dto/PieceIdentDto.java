package com.example.demo.Dto;

import java.util.Date;



import com.example.demo.Model.Employee;
import com.example.demo.Model.PieceIdent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PieceIdentDto {

	private Integer id;
	

	private Integer numPiece;
	
	
	private String typePiece;
	

	private Date DateDelivPiece;
	

	private String lieuDelivPiece;
	
	private Employee employee;

	public static PieceIdentDto fromEntity (PieceIdent pieceIdent)
	{
		if (pieceIdent==null)
		{
			return null;
		}
		
		return PieceIdentDto.builder()
				.DateDelivPiece(pieceIdent.getDateDelivPiece())
				.id(pieceIdent.getId())
				.lieuDelivPiece(pieceIdent.getLieuDelivPiece())
				.numPiece(pieceIdent.getNumPiece())
				.typePiece(pieceIdent.getTypePiece())
				.build();
	}
	
	public PieceIdent toEntity (PieceIdentDto pieceIdentDto)
	{
		if(pieceIdentDto==null)
		{
			return null;
		}
		
		PieceIdent pieceIdent = new PieceIdent();
		
		pieceIdent.setDateDelivPiece(pieceIdentDto.getDateDelivPiece());
		pieceIdent.setId(pieceIdentDto.getId());
		pieceIdent.setLieuDelivPiece(pieceIdentDto.getLieuDelivPiece());
		pieceIdent.setNumPiece(pieceIdentDto.getNumPiece());
		pieceIdent.setTypePiece(pieceIdentDto.getTypePiece());
		return pieceIdent;
	}

}
