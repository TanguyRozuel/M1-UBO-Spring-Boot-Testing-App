package com.entities;

import javax.persistence.*;

@Entity
public class Responsable extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Composante composante;


}
