package com.example.demo.Dto;
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
public class UtilisateurDto {

	private Integer id;
	
	private String nomUser;
	
	private String prenomUser;	
	
	private String RoleUser;

	private String emailUser;
	
	private String mdpUser;
	
	private Message message;
	
	public static UtilisateurDto fromEntity (Utilisateur utilisateur)
	{
		if(utilisateur==null)
		{
			return null;
		}
		return UtilisateurDto.builder()
				.emailUser(utilisateur.getEmailUser())
				.id(utilisateur.getId())
				.mdpUser(utilisateur.getMdpUser())
				.nomUser(utilisateur.getNomUser())
				.prenomUser(utilisateur.getPrenomUser())
				.RoleUser(utilisateur.getRoleUser())
				.build();
	}
	
	public Utilisateur toEntity (UtilisateurDto utilisateurDto)
	{
		if(utilisateurDto==null)
		{
			return null;
		}
		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setEmailUser(utilisateurDto.getEmailUser());
		utilisateur.setId(utilisateurDto.getId());
		utilisateur.setMdpUser(utilisateurDto.getMdpUser());
		utilisateur.setNomUser(utilisateurDto.getNomUser());
		utilisateur.setPrenomUser(utilisateurDto.getPrenomUser());
		utilisateur.setRoleUser(utilisateurDto.getRoleUser());
		return utilisateur;
	}
}
