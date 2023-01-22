package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.GradeApi;
import com.example.demo.Dto.GradeDto;
import com.example.demo.Service.GradeService;

import net.bytebuddy.utility.GraalImageCode;

@RestController
public class GradeController implements GradeApi {
	
	
	private GradeService gradeService;
	@Autowired
	public GradeController (GradeService gradeService)
	{
		this.gradeService=gradeService;
	}
	@Override
	public GradeDto save(GradeDto dto) {
		if(dto==null)
		{
			return null;
		}
		return gradeService.save(dto);
	}

	@Override
	public Optional<GradeDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return gradeService.FindById(id);
	}

	@Override
	public List<GradeDto> FindAll() {
	return gradeService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}	
		gradeService.Delete(id);
	}
	

}
