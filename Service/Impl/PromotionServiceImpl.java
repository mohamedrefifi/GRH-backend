package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.PromotionDto;
import com.example.demo.Model.Promotion;
import com.example.demo.Repository.PromotionRepositpry;
import com.example.demo.Service.PromotionService;

@Service
public class PromotionServiceImpl implements PromotionService {
	
	private PromotionRepositpry promotionRepositpry;
	
	public PromotionServiceImpl (PromotionRepositpry promotionRepositpry)
	{
		this.promotionRepositpry=promotionRepositpry;
	}

	@Override
	public PromotionDto save(PromotionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				PromotionDto.fromEntity(promotionRepositpry.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<PromotionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Promotion>cOptional=promotionRepositpry.findById(id);
		return
				Optional.of(PromotionDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<PromotionDto> FindAll() {
		return promotionRepositpry.findAll().stream()
				.map(PromotionDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		promotionRepositpry.deleteById(id);
	}

}
