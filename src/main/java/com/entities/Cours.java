package com.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intitule;

    @ManyToOne
    /* table de jointure externe */
    @JoinTable(name = "vacataire_cours",
            joinColumns = @JoinColumn(name = "cours_id"),
            inverseJoinColumns = @JoinColumn(name = "vacataire_id"))
    private Vacataire vacataire;

}
