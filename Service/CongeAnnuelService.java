package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import com.example.demo.Dto.ArretDto;
import com.example.demo.Dto.CongeAnnuelDto;


public interface CongeAnnuelService {

	  CongeAnnuelDto save(CongeAnnuelDto dto);
		
		Optional<CongeAnnuelDto> FindById (Integer id);
		
		List <CongeAnnuelDto> FindAll();
		
		void Delete (Integer id);
}
