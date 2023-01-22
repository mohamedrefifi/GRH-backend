package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.ContratApi;
import com.example.demo.Dto.ContratDto;
import com.example.demo.Service.ContratService;

@RestController
public class ContratController implements ContratApi {
 
	private ContratService contratService;
	
	@Autowired
	private ContratController (ContratService contratService)
	{
		this.contratService=contratService;
	}
	
	 
	@Override
	public ContratDto save(ContratDto dto) {
		if (dto==null)
		{
			return null;
		}
		return contratService.save(dto);
	}

	@Override
	public Optional<ContratDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		return contratService.FindById(id);
		
	}

	@Override
	public List<ContratDto> FindAll() {
		return contratService.FindAll();	}

	@Override
	public void Delete(Integer id) {
		if (id==null)
		{
			return ;
		}
		
	}

}
