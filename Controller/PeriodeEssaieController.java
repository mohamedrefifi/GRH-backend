package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.PeriodeEssaieApi;
import com.example.demo.Dto.PeriodeEssaieDto;
import com.example.demo.Model.PeriodeEssaie;
import com.example.demo.Service.PeriodeEssaieService;

@RestController
public class PeriodeEssaieController implements PeriodeEssaieApi{
	
	
	private PeriodeEssaieService periodeEssaieService;
	
	@Autowired
	public PeriodeEssaieController (PeriodeEssaieService periodeEssaieService)
	{
		this.periodeEssaieService=periodeEssaieService;
	}

	@Override
	
	public PeriodeEssaieDto save(PeriodeEssaieDto dto) {
		if(dto==null)
		{
			 return null;
		}
		return periodeEssaieService.save(dto);
	}

	@Override
	public Optional<PeriodeEssaieDto> FindById(Integer id) {
		if(id==null)
		{
			 return null;
		}
		return periodeEssaieService.FindById(id);
	}

	@Override
	public List<PeriodeEssaieDto> FindAll() {
		
		
		return periodeEssaieService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			 return ;
		}
		 periodeEssaieService.Delete(id);		
	}

	
}
