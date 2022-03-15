package com.controllers;

import com.dtos.UtilisateurDto;
import org.springframework.web.bind.annotation.*;

import com.services.impl.UtilisateurServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UtilisateurControllers {

    private final UtilisateurServiceImpl userService;

    public UtilisateurControllers(UtilisateurServiceImpl userService){
        this.userService = userService;
    }

    /**
     * <p>Récupère tous les utilisateurs dans le système</p>
     * @return List<UserDto>
     */
    @GetMapping
    public List<UtilisateurDto> RecupereToutUtilisateur() {
        return userService.getAllUser();
    }

    /**
     * Méthode qui récupère un utilisateur grâce à son id
     */
    @GetMapping("/{id}")
    public UtilisateurDto RecupereUnCours(@PathVariable Long id){
        return userService.getUserById(id);
    }

    /**
     * Création d'un nouveau Utilisateur dans le système
     */
    @PostMapping
    public UtilisateurDto CreerUtilisateur(final @RequestBody UtilisateurDto userDto){
        System.out.println(userDto);
        return userService.creeUtilisateur(userDto);
    }

    /**
     * Supprime un utilisateur grâce à son id
     */
    @DeleteMapping("/{id}")
    public Boolean SupprimmeUnUtilisateur(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
