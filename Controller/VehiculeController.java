package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.VehiculeApi;
import com.example.demo.Dto.VehiculeDto;
import com.example.demo.Service.VehiculeService;

@RestController

public class VehiculeController implements VehiculeApi{
	
	private VehiculeService vehiculeService;
	@Autowired
	public VehiculeController (VehiculeService vehiculeService)
	{
		this.vehiculeService=vehiculeService;
	}

	@Override
	public VehiculeDto save(VehiculeDto dto) {
		if (dto==null)
		{
          return null;		
		}
		return
		vehiculeService.save(dto);
	}

	@Override
	public Optional<VehiculeDto> FindById(Integer id) {
		if (id==null)
		{
          return null;		
		}
		return vehiculeService.FindById(id);
	}

	@Override
	public List<VehiculeDto> FindAll() {
		return vehiculeService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if (id==null)
		{
          return ;		
		}	
		vehiculeService.Delete(id);
	}

}
