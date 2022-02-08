package com.services.impl;

import com.dtos.UtilisateurDto;
import com.entities.Utilisateur;
import com.repositories.UtilsateurRepo;
import com.services.UtilisateurService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilsateurRepo utilisateurRepository;

    public UtilisateurServiceImpl(UtilsateurRepo utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UtilisateurDto creeUtilisateur(UtilisateurDto UtilisateurDto) {
        // Converts the dto to the dog entity
        Utilisateur user = userDtoToEntity(UtilisateurDto);
        // Save the dog entity
        user = utilisateurRepository.save(user);
        // Return the new dto
        return userEntityToDto(user);
    }

    @Override
    public UtilisateurDto getUserById(Long userId) {
        Utilisateur user = utilisateurRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("Dog not found"));
        return userEntityToDto(user);
    }

    @Override
    public boolean deleteUser(Long userId)
    {
        utilisateurRepository.deleteById(userId);
        return true;
    }

    @Override
    public List<UtilisateurDto> getAllUser() {
        List<UtilisateurDto> userDtos = new ArrayList<>();
        List<Utilisateur> users = utilisateurRepository.findAll();
        users.forEach(user -> userDtos.add(userEntityToDto(user)));
        return userDtos;
    }

    /**
     * Les mappeurs permettent tout simplement de transformer les entités en dto car ce sont des objets différents.
     * Cela permet de bien séparer la couche web (Controller - Service) de la couche data ( Service - entités/daos)
     * C'est juste une maniere de faire, generallement le mappeur est a l'exterieur du service et on utilise des librairies pour automatiser =)
     */


    /**
     * Map dog dto to dog entity
     */
    private UtilisateurDto userEntityToDto(Utilisateur user){
        UtilisateurDto userDto = new UtilisateurDto();
        userDto.setLogin(user.getLogin());
        userDto.setMail(user.getMail());
        userDto.setMotDePasse(user.getMotDePasse());
        userDto.setNom(user.getNom());
        userDto.setPrenom(user.getPrenom());
        return userDto;
    }

    /**
     * Map dog entity to dog dto
     */
    private Utilisateur userDtoToEntity(UtilisateurDto utilisateurDto){
        Utilisateur user = new Utilisateur();
        user.setLogin(utilisateurDto.getLogin());
        user.setMail(utilisateurDto.getMail());
        user.setMotDePasse(utilisateurDto.getMotDePasse());
        user.setNom(utilisateurDto.getNom());
        user.setPrenom(utilisateurDto.getPrenom());
        return user;
    }
}

