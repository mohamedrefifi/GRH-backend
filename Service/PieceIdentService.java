package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.PieceIdentDto;

public interface PieceIdentService {
	
   PieceIdentDto save(PieceIdentDto dto);
	
	Optional<PieceIdentDto> FindById (Integer id);
	
	List <PieceIdentDto> FindAll();
	
	void Delete (Integer id);

}
