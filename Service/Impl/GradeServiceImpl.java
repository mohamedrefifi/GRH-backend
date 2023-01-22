package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.GradeDto;
import com.example.demo.Model.Grade;
import com.example.demo.Repository.GradeRepository;
import com.example.demo.Service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {
	
	private GradeRepository gradeRepository;
	

	public GradeServiceImpl (GradeRepository gradeRepository)
	{
		this.gradeRepository=gradeRepository;
	}

	@Override
	public GradeDto save(GradeDto dto) {
	if(dto==null)
	{
		return null;
	}
	return
	GradeDto.fromEntity(gradeRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<GradeDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Grade>cOptional=gradeRepository.findById(id);
		return
				Optional.of(GradeDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<GradeDto> FindAll() {
		return 
				gradeRepository.findAll().stream()
				.map(GradeDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		gradeRepository.deleteById(id);
	}

}
