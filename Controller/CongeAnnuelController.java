package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.CongeAnnuelApi;
import com.example.demo.Dto.CongeAnnuelDto;
import com.example.demo.Service.CongeAnnuelService;


@RestController
public class CongeAnnuelController implements CongeAnnuelApi{

	private CongeAnnuelService congeAnnuelService;
	@Autowired
	public CongeAnnuelController(CongeAnnuelService congeAnnuelService)
	{
		this.congeAnnuelService=congeAnnuelService;
	}
	
	@Override
	public CongeAnnuelDto save(CongeAnnuelDto dto) {
		if(dto==null)
		{
			return null;
		}
		return congeAnnuelService.save(dto);
	}

	@Override
	public Optional<CongeAnnuelDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return congeAnnuelService.FindById(id);
	}

	@Override
	public List<CongeAnnuelDto> FindAll() {
		return congeAnnuelService.FindAll() ;
	}

	@Override
	public void Delete(Integer id) {
 if (id==null)
 {
	 return;
 }
 congeAnnuelService.Delete(id);
	}

}
