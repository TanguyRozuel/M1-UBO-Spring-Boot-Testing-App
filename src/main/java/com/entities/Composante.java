package com.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Composante {

    @OneToMany(mappedBy = "composante")
    private List<Responsable> responsable;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom_composante;

    public Composante() {
    }
}
