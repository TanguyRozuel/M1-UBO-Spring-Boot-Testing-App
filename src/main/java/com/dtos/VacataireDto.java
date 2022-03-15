package com.dtos;

import com.entities.Cours;
import lombok.Data;

import java.util.List;

@Data
public class VacataireDto {

    private Long Id;
    private String nom;
    private String prenom;
    private String mail;
}
