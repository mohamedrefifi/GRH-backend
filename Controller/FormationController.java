package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.FormationApi;
import com.example.demo.Dto.FormationDto;
import com.example.demo.Service.FormationService;

@RestController
public class FormationController implements FormationApi {

	
	private FormationService formationService;
	@Autowired
	public FormationController (FormationService  formationService)
	{
		this.formationService=formationService;
	}
	
	@Override
	public FormationDto save(FormationDto dto) {
		if (dto ==null)
		{
			return null;
		}
		return formationService.save(dto);
	}

	@Override
	public Optional<FormationDto> FindById(Integer id) {
		if (id ==null)
		{
			return null;
		}
		return formationService.FindById(id);
	}

	@Override
	public List<FormationDto> FindAll() {
		return formationService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if (id ==null)
		{
			return ;
		}
		formationService.Delete(id);
		
	}

}
