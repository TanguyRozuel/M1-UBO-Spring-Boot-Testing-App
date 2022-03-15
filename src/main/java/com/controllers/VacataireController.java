package com.controllers;

import com.dtos.CoursDto;
import com.dtos.VacataireDto;
import com.services.impl.VacataireServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vacataire")
public class VacataireController {

    private final VacataireServiceImpl vacataireService;

    public VacataireController(VacataireServiceImpl vacataireService) {
        this.vacataireService = vacataireService;
    }

    /**
     * <p>Récupère tous les Vacataires du système</p>
     * @return List<VacataireDto>
     */
    @GetMapping
    public List<VacataireDto> RecupereToutVacataire() {
        return vacataireService.RecupereToutVacataire();
    }

    /**
     * Méthode qui récupyère un Vacataire basé sur son id
     */
    @GetMapping("/{id}")
    public VacataireDto RecupereUnVacataire(@PathVariable Long id){
        return vacataireService.recupereVacataireById(id);
    }

    /**
     * Création d'un nouveau vacataire dans le système
     */
    @PostMapping
    public VacataireDto CreerUnVacataire(final @RequestBody VacataireDto vacataireDto){
        System.out.println(vacataireDto);
        return vacataireService.creeVacataire(vacataireDto);
    }

    /**
     * Suppression de Vacataire grâce à son id
     */
    @DeleteMapping("/{id}")
    public Boolean SupprimmeUnVacataire(@PathVariable Long id){
        return vacataireService.SupprimmeVacataire(id);
    }

}
