package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.ArretApi;
import com.example.demo.Dto.ArretDto;
import com.example.demo.Service.ArretService;

@RestController
public class ArretController implements ArretApi {

	private ArretService arretService;
	
	@Autowired
	public ArretController (ArretService arretService)
	{
		this.arretService=arretService;
	}
	
	@Override
	public ArretDto save(ArretDto dto) {
	 
		if(dto==null)
		{
			return null;
		}
		
		return arretService.save(dto);
			
	}

	@Override
	public Optional<ArretDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return
		arretService.FindById(id);
	}

	@Override
	public List<ArretDto> FindAll() {
		return  arretService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		arretService.Delete(id);
		
	}


}
