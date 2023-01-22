package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.UtilisateurDto;
import com.example.demo.Model.Utilisateur;
import com.example.demo.Repository.UtilisateurRepository;
import com.example.demo.Service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	
	private UtilisateurRepository utilisateurRepository;
	
	public UtilisateurServiceImpl (UtilisateurRepository utilisateurRepository)
	{
		this.utilisateurRepository=utilisateurRepository;
	}

	@Override
	public UtilisateurDto save(UtilisateurDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return 
				UtilisateurDto.fromEntity(utilisateurRepository.save(dto.toEntity(dto)));
	}

	@Override
	public Optional<UtilisateurDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Utilisateur>cOptional=utilisateurRepository.findById(id);
		return
				Optional.of(UtilisateurDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<UtilisateurDto> FindAll() {
		return utilisateurRepository.findAll().stream()
				.map(UtilisateurDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}		
		utilisateurRepository.deleteById(id);
	}

}
