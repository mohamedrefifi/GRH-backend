package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.CongeExceptionnelDto;

public interface CongeExceptionnelService {

	 CongeExceptionnelDto save(CongeExceptionnelDto dto);
		
		Optional<CongeExceptionnelDto> FindById (Integer id);
		
		List <CongeExceptionnelDto> FindAll();
		
		void Delete (Integer id);
}
