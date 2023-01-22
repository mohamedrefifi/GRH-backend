package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.PosteDto;
import com.example.demo.Model.Poste;
import com.example.demo.Repository.PosteRepository;
import com.example.demo.Service.PosteService;

@Service
public class PosteServiceImpl implements PosteService{
	
	private PosteRepository posteRepository;
	
	public PosteServiceImpl (PosteRepository posteRepository)
	{
		this.posteRepository=posteRepository;
	}

	@Override
	public PosteDto save(PosteDto dto) {
		if (dto==null)
		{
			return null;
		}
			return 
					PosteDto.fromEntity(posteRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<PosteDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		Optional<Poste>cOptional=posteRepository.findById(id);
		return
				Optional.of(PosteDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<PosteDto> FindAll() {
		return 
				posteRepository.findAll().stream()
				.map(PosteDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if (id==null)
		{
			return ;
		}
		posteRepository.deleteById(id);
		
	}

}
