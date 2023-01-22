package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.SanctionApi;
import com.example.demo.Dto.SanctionDto;
import com.example.demo.Service.SanctionService;

@RestController
public class SanctionController implements SanctionApi {
	
	private SanctionService sanctionService;
	
	@Autowired
	public SanctionController (SanctionService sanctionService)
	{
		this.sanctionService=sanctionService;
	}

	@Override
	public SanctionDto save(SanctionDto dto) {
	if (dto==null)
	{
		return null;
	}
	return sanctionService.save(dto);
	}

	@Override
	public Optional<SanctionDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		return sanctionService.FindById(id);
	}

	@Override
	public List<SanctionDto> FindAll() {
	return sanctionService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if (id==null)
		{
			return ;
		}
		sanctionService.Delete(id);
	}

}
