package com.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

/* Classe Vacataire qui récupère les données relatives à un vacataire (issues de Utilisateur) */

public class Vacataire{
    @Id
    @Column(name = "vacataire_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String mail;
}
