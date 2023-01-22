package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ArretDto;
import com.example.demo.Dto.PeriodeEssaieDto;
import com.example.demo.Model.PeriodeEssaie;

public interface PeriodeEssaieService {

	PeriodeEssaieDto save(PeriodeEssaieDto dto);
		
		Optional<PeriodeEssaieDto> FindById (Integer id);
		
		List <PeriodeEssaieDto> FindAll();
		
		void Delete (Integer id);
}
