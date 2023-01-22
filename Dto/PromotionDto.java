package com.example.demo.Dto;

import java.util.Date;
import java.util.List;
import com.example.demo.Model.Decision;
import com.example.demo.Model.Promotion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PromotionDto {

	private Integer id;
	
	private String ancienPoste;
	
	private String NouveauPoste;

	private Date datePromo;

	private List<Decision>decisions;
	
	public static PromotionDto fromEntity(Promotion promotion)
	{
		if(promotion==null)
		{
			return null;
		}
		return PromotionDto.builder()
				.ancienPoste(promotion.getAncienPoste())
				.datePromo(promotion.getDatePromo())
				.id(promotion.getId())
				.NouveauPoste(promotion.getNouveauPoste())
				.build();
	}
	
	public Promotion toEntity (PromotionDto promotionDto)
	{
		if(promotionDto==null)
		{
			return null;
		}
		Promotion promotion = new Promotion();
		promotion.setAncienPoste(promotionDto.getAncienPoste());
		promotion.setDatePromo(promotionDto.getDatePromo());
		promotion.setId(promotionDto.getId());
		promotion.setNouveauPoste(promotionDto.getNouveauPoste());
		return promotion;
	}

}
