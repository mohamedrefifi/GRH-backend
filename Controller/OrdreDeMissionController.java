package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.OrdreDeMissionApi;
import com.example.demo.Dto.OrdreDeMissionDto;
import com.example.demo.Service.OrdreDeMissionService;

@RestController
public class OrdreDeMissionController implements OrdreDeMissionApi {
	
	private OrdreDeMissionService ordreDeMissionService;
	@Autowired
	public OrdreDeMissionController (OrdreDeMissionService ordreDeMissionService)
	{
		this.ordreDeMissionService=ordreDeMissionService;
	}

	@Override
	public OrdreDeMissionDto save(OrdreDeMissionDto dto) {
		if(dto==null)
		{
			return null;
		}
		return ordreDeMissionService.save(dto);
	}

	@Override
	public Optional<OrdreDeMissionDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return ordreDeMissionService.FindById(id);
	}

	@Override
	public List<OrdreDeMissionDto> FindAll() {
		return ordreDeMissionService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		ordreDeMissionService.Delete(id);
		
	}

}
