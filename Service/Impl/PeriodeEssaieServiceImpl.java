package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.CongeAnnuelDto;
import com.example.demo.Dto.OrdreDeMissionDto;
import com.example.demo.Dto.PeriodeEssaieDto;
import com.example.demo.Model.CongeAnnuel;
import com.example.demo.Model.PeriodeEssaie;
import com.example.demo.Repository.CongeAnnuelRepository;
import com.example.demo.Repository.PeriodeEssaieRepository;
import com.example.demo.Service.PeriodeEssaieService;
@Service
public class PeriodeEssaieServiceImpl implements PeriodeEssaieService{
private PeriodeEssaieRepository periodeEssaieRepository;
	
	public PeriodeEssaieServiceImpl (PeriodeEssaieRepository periodeEssaieRepository)
	{
		this.periodeEssaieRepository=periodeEssaieRepository;
	}

	@Override
	public PeriodeEssaieDto save(PeriodeEssaieDto dto) {
	 if(dto==null)
	 {
		 return null;
	 }
	 
	 return PeriodeEssaieDto.fromEntity(periodeEssaieRepository.save(dto.toEntity(dto)));
	
	}

	@Override
	public Optional<PeriodeEssaieDto> FindById(Integer id) {
     if(id==null)
     {
    	 return null;
     }
     
     Optional<PeriodeEssaie> cOptional = periodeEssaieRepository.findById(id);
     return Optional.of(PeriodeEssaieDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<PeriodeEssaieDto> FindAll() {
		return periodeEssaieRepository.findAll().stream()
				.map(PeriodeEssaieDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		periodeEssaieRepository.deleteById(id);
	}

}


