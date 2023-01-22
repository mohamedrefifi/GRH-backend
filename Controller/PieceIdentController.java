package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.PieceIdentApi;
import com.example.demo.Dto.PieceIdentDto;
import com.example.demo.Service.PieceIdentService;

@RestController
public class PieceIdentController implements PieceIdentApi {
	private PieceIdentService pieceIdentService;
	@Autowired
	public PieceIdentController (PieceIdentService pieceIdentService)
	{
		this.pieceIdentService=pieceIdentService;
	}

	@Override
	public PieceIdentDto save(PieceIdentDto dto) {
		if(dto==null)
		{
			return null;
		}
		return pieceIdentService.save(dto);
	}

	@Override
	public Optional<PieceIdentDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return pieceIdentService.FindById(id);
	}

	@Override
	public List<PieceIdentDto> FindAll() {
		return pieceIdentService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		pieceIdentService.Delete(id);
	}
	

}
