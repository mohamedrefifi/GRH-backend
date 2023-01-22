package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.StagaireApi;
import com.example.demo.Dto.StagaireDto;
import com.example.demo.Service.StagaireService;

@RestController
public class StagaireController implements StagaireApi{
	
	private StagaireService stagaireService;
	@Autowired
	public StagaireController (StagaireService stagaireService)
	{
		this.stagaireService=stagaireService;
	}

	@Override
	public StagaireDto save(StagaireDto dto) {
		if(dto==null)
		{
			return null;
		}
		return stagaireService.save(dto);
	}

	@Override
	public Optional<StagaireDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return
		stagaireService.FindById(id);
	}

	@Override
	public List<StagaireDto> FindAll() {
	return stagaireService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		stagaireService.Delete(id);
		
	}

}
