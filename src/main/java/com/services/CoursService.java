package com.services;

import com.dtos.CoursDto;
import com.repositories.CoursRepository;
import com.repositories.VacataireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface CoursService {

    /**
     * crée un cours
     */
    CoursDto creerCours(CoursDto coursDto);

    /**
     * recupere un cours par son id
     */
    CoursDto RecupereCoursById(Long coursId);

    /**
     * supprime un cours par son id
     */
    boolean SupprimmeCours(Long coursId);

    /**
     * recupere tout les cours
     */
    List<CoursDto> recupereToutCours();


}

