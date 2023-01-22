package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.CongeExceptionnelApi;
import com.example.demo.Dto.CongeExceptionnelDto;

import com.example.demo.Service.CongeExceptionnelService;

@RestController
public class CongeExceptionnelController implements CongeExceptionnelApi {

	private CongeExceptionnelService congeExceptionnelService;
	
	@Autowired
	
	public CongeExceptionnelController (CongeExceptionnelService congeExceptionnelService)
	{
		this.congeExceptionnelService=congeExceptionnelService;
	}
	
	@Override
	public CongeExceptionnelDto save(CongeExceptionnelDto dto) {
		if(dto==null)
		{
			return null;
		}
		return congeExceptionnelService.save(dto);
	}
	

	@Override
	public Optional<CongeExceptionnelDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return congeExceptionnelService.FindById(id);
	}

	@Override
	public List<CongeExceptionnelDto> FindAll() {
		return congeExceptionnelService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		congeExceptionnelService.Delete(id);
	}

}
