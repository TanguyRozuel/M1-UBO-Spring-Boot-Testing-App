package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

// Nous utilisons une annotation qui s'appelle @Data
// C'est lombook, une librairie qui raccourcit l'utilisation des getters, setters, tostring, etc ...

@Entity
@Data

/* Classe Utilisateur qui récupère les données relatives à un utilisateur */

public  class Utilisateur {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String mail;

}
