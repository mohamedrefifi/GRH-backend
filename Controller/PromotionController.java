package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.PromotionApi;
import com.example.demo.Dto.PromotionDto;
import com.example.demo.Service.PromotionService;

@RestController
public class PromotionController implements PromotionApi{

	
	private PromotionService promotionService;
	@Autowired
	public PromotionController (PromotionService promotionService)
	{
		this.promotionService=promotionService;
	}
	@Override
	public PromotionDto save(PromotionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return promotionService.save(dto);
	}

	@Override
	public Optional<PromotionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return promotionService.FindById(id);
	}

	@Override
	public List<PromotionDto> FindAll() {
		return promotionService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}	
		promotionService.Delete(id);
	}

}
