package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.OrdreDeMissionDto;

public interface OrdreDeMissionService {

    OrdreDeMissionDto save(OrdreDeMissionDto dto);
	
	Optional<OrdreDeMissionDto> FindById (Integer id);
	
	List <OrdreDeMissionDto> FindAll();
	
	void Delete (Integer id);
}
