package com.dtos;

import lombok.Data;

@Data
public class UtilisateurDto {

    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String mail;
}
