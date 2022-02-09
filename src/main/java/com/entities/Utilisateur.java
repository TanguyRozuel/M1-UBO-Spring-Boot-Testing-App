package com.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

// Sur dog entity j'ai utilisé une annotation qui s'appelle @Data
// C'est lombook, une librairie qui raccourci l'utilisation des getter, setters , tostring etc ..
// Donc, utiliser https://projectlombok.org/features/Data afin d'avboir accès au getter est la solution #1
// Sinon tu peux utiliser les getters de base comme ca

@Data
public abstract class Utilisateur {

    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String mail;

}
