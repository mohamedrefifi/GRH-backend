package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.DecisionApi;
import com.example.demo.Dto.DecisionDto;
import com.example.demo.Service.DecisionService;

@RestController

public class DecisionController  implements DecisionApi{
	
	private DecisionService decisionService;
	@Autowired
	public DecisionController (DecisionService decisionService)
	{
		this.decisionService=decisionService;
	}

	@Override
	public DecisionDto save(DecisionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return decisionService.save(dto);
	}

	@Override
	public Optional<DecisionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return decisionService.FindById(id);
	}

	@Override
	public List<DecisionDto> FindAll() {
	return decisionService.FindAll();	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		decisionService.Delete(id);
	}
	

}
