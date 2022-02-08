package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filiere_langue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int codeFilierLangue;
    private String nomFiliereLangue;

}
