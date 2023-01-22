package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.PosteDto;

public interface PosteService {
	
PosteDto save(PosteDto dto);
	
	Optional<PosteDto> FindById (Integer id);
	
	List <PosteDto> FindAll();
	
	void Delete (Integer id);

}
