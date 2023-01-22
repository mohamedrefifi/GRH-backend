package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.Api.MessageApi;
import com.example.demo.Dto.MessageDto;
import com.example.demo.Model.Message;
import com.example.demo.Service.MessageService;

@RestController

public class MessageController implements MessageApi {
	
	private MessageService messageService;
	
	@Autowired
	public MessageController (MessageService messageService)
	{
		this.messageService=messageService;
	}

	@Override
	public MessageDto save(MessageDto dto) {
		if(dto==null)
		{
			return null;
		}
		return messageService.save(null);
	}

	@Override
	public Optional<MessageDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return messageService.FindById(id);
	}

	@Override
	public List<MessageDto> FindAll() {
	return messageService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		messageService.Delete(id);
	}

}
