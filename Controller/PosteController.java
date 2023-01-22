package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.PosteApi;
import com.example.demo.Dto.PosteDto;
import com.example.demo.Service.PosteService;

@RestController
public class PosteController implements PosteApi{
	
	private PosteService posteService;
	@Autowired
	public PosteController (PosteService posteService)
	{
		this.posteService=posteService;
	}

	@Override
	public PosteDto save(PosteDto dto) {
		if(dto==null)
		{
			return null;
		}
		return posteService.save(dto);
	}

	@Override
	public Optional<PosteDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return posteService.FindById(id);
	}

	@Override
	public List<PosteDto> FindAll() {
		return posteService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}		
		posteService.Delete(id);
	}

}
