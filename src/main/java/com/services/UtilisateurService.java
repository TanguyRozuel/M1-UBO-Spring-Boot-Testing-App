package com.services;

import com.dtos.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {

    /**
     * crée un user
     */
    UtilisateurDto creeUtilisateur(UtilisateurDto UtilisateurDto);

    /**
     * recupere un utilisateur par son id
     */
    UtilisateurDto getUserById(Long dogId);

    /**
     * supprime un utilisateur par son id
     */
    boolean deleteUser(Long dogId);

    /**
     * recupere tout les user
     */
    List<UtilisateurDto> getAllUser();


}
