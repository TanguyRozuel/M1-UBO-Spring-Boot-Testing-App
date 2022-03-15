package com.services;

import com.dtos.CoursDto;
import com.dtos.VacataireDto;

import java.util.List;

public interface VacataireService {
    /**
     * crée un Vacataire
     */
    VacataireDto creeVacataire(VacataireDto vacataireDtoDto);

    /**
     * recupere un vacataire par son id
     */
    VacataireDto recupereVacataireById(Long vacId);

    /**
     * supprime un vacatire par son id
     */
    boolean SupprimmeVacataire(Long vacId);

    /**
     * recupere tout les vacataires
     */
    List<VacataireDto> RecupereToutVacataire();

}
