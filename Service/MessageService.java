package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.MessageDto;

public interface MessageService {
    MessageDto save(MessageDto dto);
	
	Optional<MessageDto> FindById (Integer id);
	
	List <MessageDto> FindAll();
	
	void Delete (Integer id);

}
