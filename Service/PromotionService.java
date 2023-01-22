package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.PromotionDto;

public interface PromotionService {

PromotionDto save(PromotionDto dto);
	
	Optional<PromotionDto> FindById (Integer id);
	
	List <PromotionDto> FindAll();
	
	void Delete (Integer id);
}
