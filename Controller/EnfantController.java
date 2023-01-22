package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.EnfantApi;
import com.example.demo.Dto.EnfantDto;
import com.example.demo.Service.EnfantService;

@RestController
public class EnfantController implements EnfantApi {

	private EnfantService enfantService;
	@Autowired
	public EnfantController (EnfantService enfantService)
	{
		this.enfantService=enfantService;
	}
	
	@Override
	public EnfantDto save(EnfantDto dto) {
		if(dto==null)
		{
			return null;
		}
		return enfantService.save(dto);
			
	}

	@Override
	public Optional<EnfantDto> FindById(Integer id) {

		if(id==null)
		{
			return null;
		}
		return
		enfantService.FindById(id);
		
	}

	@Override
	public List<EnfantDto> FindAll() {
	return enfantService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		enfantService.Delete(id);
		
	}
	

}
