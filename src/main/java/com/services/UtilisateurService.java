package com.services;

import com.dtos.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {

    /**
     * crée un user
     */
    UtilisateurDto creeUtilisateur(UtilisateurDto utilisateurDto);

    /**
     * recupere un utilisateur par son id
     */
    UtilisateurDto getUserById(Long userId);

    /**
     * supprime un utilisateur par son id
     */
    boolean deleteUser(Long userId);

    /**
     * recupere tout les user
     */
    List<UtilisateurDto> getAllUser();


}
