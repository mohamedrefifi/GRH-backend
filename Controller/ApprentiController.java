package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.ApprentiApi;
import com.example.demo.Dto.ApprentiDto;
import com.example.demo.Service.ApprentiService;

@RestController
public class ApprentiController implements ApprentiApi {

	private ApprentiService apprentiService;
	
	@Autowired
	public ApprentiController (ApprentiService apprentiService)
	{
		this.apprentiService=apprentiService;
	}
	
	
	
	@Override
	public ApprentiDto save(ApprentiDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
		apprentiService.save(dto);
	}

	@Override
	public Optional<ApprentiDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return 
				apprentiService.FindById(id);
	}

	@Override
	public List<ApprentiDto> FindAll() {
		
		return 
			apprentiService.FindAll()
				;
	}

	@Override
	public void Delete(Integer id) {
    if(id==null)
    {
    	return;
    }
    apprentiService.Delete(id);
	}

	
	
}
