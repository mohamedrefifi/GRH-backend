package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.PieceIdentDto;
import com.example.demo.Model.PieceIdent;
import com.example.demo.Repository.PieceIdentRepository;
import com.example.demo.Service.PieceIdentService;

@Service
public class PieceIdentServiceImpl implements PieceIdentService{
	
	private PieceIdentRepository pieceIdentRepository;
	
	public PieceIdentServiceImpl (PieceIdentRepository pieceIdentRepository)
	{
		this.pieceIdentRepository=pieceIdentRepository;
	}

	@Override
	public PieceIdentDto save(PieceIdentDto dto) {
		if(dto==null)
		{
			return null;
		}
		return 
				PieceIdentDto.fromEntity(pieceIdentRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<PieceIdentDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<PieceIdent>cOptional=pieceIdentRepository.findById(id);
		return
				Optional.of(PieceIdentDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<PieceIdentDto> FindAll() {
		return
				pieceIdentRepository.findAll().stream()
				.map(PieceIdentDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		pieceIdentRepository.deleteById(id);
	}

}
