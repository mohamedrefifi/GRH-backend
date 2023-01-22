package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.MessageDto;
import com.example.demo.Model.Message;
import com.example.demo.Repository.MessageRepository;
import com.example.demo.Service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	private MessageRepository messageRepository;
	
	private MessageServiceImpl(MessageRepository messageRepository)
	{
		this.messageRepository=messageRepository;
	}

	@Override
	public MessageDto save(MessageDto dto) {
		if(dto==null)
		{
			return null;
		}
		return
				MessageDto.fromEntity(messageRepository.save(dto.toEntity(dto)));
		
	}

	@Override
	public Optional<MessageDto> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		Optional<Message>cOptional=messageRepository.findById(id);
		return
				Optional.of(MessageDto.fromEntity(cOptional.get()));
	}

	@Override
	public List<MessageDto> FindAll() {
		return
				messageRepository.findAll().stream()
				.map(MessageDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return ;
		}
		messageRepository.deleteById(id);
		
	}

}
