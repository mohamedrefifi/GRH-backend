package com.example.demo.Dto;

import java.util.List;

import com.example.demo.Model.Message;
import com.example.demo.Model.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageDto {
	
	private Integer id;

	private String contenu ;
	
	private List<Utilisateur>utilisateurs;

	
	public static MessageDto fromEntity(Message message)
	{
		if(message==null)
		{
			return null;
		}
		return
		MessageDto.builder()
		.id(message.getId())
		.contenu(message.getContenu())
		.build();
	}
	
	public Message toEntity (MessageDto messageDto)
	{
		if(messageDto==null)
		{
			return null;
		}
		Message message = new Message();

		message.setContenu(messageDto.getContenu());
		message.setId(messageDto.getId());
		return message;
				
	}
}
