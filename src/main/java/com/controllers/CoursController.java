package com.controllers;

import com.dtos.CoursDto;
import org.springframework.web.bind.annotation.*;

import com.services.impl.CoursServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {

    private final CoursServiceImpl coursService;

    public CoursController(CoursServiceImpl coursService) {
        this.coursService = coursService;
    }

    /**
     * <p>Recupère tout les cours du système</p>
     * @return List<CoursDto>
     */
    @GetMapping
    public List<CoursDto> RecupereToutCours() {
        return coursService.recupereToutCours();
    }

    /**
     * Méthode qui récupère un cours basé sur son id
     */
    @GetMapping("/{id}")
    public CoursDto RecupereUnCours(@PathVariable Long id){
        return coursService.RecupereCoursById(id);
    }

    /**
     * Création d'un nouveau Cours dans le système
     */
    @PostMapping
    public CoursDto creationCours(final @RequestBody CoursDto coursDto){
        System.out.println(coursDto);
        return coursService.creerCours(coursDto);
    }

    /**
     * Suppression de Cours grâce à son id
     */
    @DeleteMapping("/{id}")
    public Boolean SuppressionCours(@PathVariable Long id){
        return coursService.SupprimmeCours(id);
    }

}
