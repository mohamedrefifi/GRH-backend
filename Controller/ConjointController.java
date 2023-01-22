package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.ConjointApi;
import com.example.demo.Dto.ConjointDto;
import com.example.demo.Service.ConjointService;

@RestController
public class ConjointController implements ConjointApi{

	private ConjointService conjointService;
	
	@Autowired
	public ConjointController (ConjointService conjointService)
	{
		this.conjointService=conjointService;
	}
	
	@Override
	public ConjointDto save(ConjointDto dto) {
		if(dto==null)
		{
			return null;
		}
		return 
				conjointService.save(dto);
	}

	@Override
	public Optional<ConjointDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return conjointService.FindById(id);
	}

	@Override
	public List<ConjointDto> FindAll() {
		return conjointService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		conjointService.Delete(id);
	}
	

}
