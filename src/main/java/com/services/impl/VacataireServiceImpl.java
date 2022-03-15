package com.services.impl;

import com.dtos.VacataireDto;
import com.entities.Vacataire;
import com.repositories.VacataireRepository;
import com.services.VacataireService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("VacataireService")
public class VacataireServiceImpl implements VacataireService {

    private final VacataireRepository vacataireRepository;
    //private final CoursRepository coursRepository;

    public VacataireServiceImpl(VacataireRepository vacataireRepository){
        this.vacataireRepository = vacataireRepository;
    }

    @Override
    public VacataireDto creeVacataire(VacataireDto vacataireDto) {
        // Conversion du dto pour une entité Vacataire
        Vacataire vacataire = vacataireDtoToEntity(vacataireDto);
        // Sauvegarde de l'entité Vacataire
        vacataire = vacataireRepository.save(vacataire);
        // Return du nouveau dto
        return vacataireEntityToDto(vacataire);
    }

    @Override
    public VacataireDto recupereVacataireById(Long vacId) {
        Vacataire vacataire = vacataireRepository.findById(vacId).orElseThrow(() -> new EntityNotFoundException("Vacataire not found"));
        return vacataireEntityToDto(vacataire);
    }

    @Override
    public boolean SupprimmeVacataire(Long vacId) {
        vacataireRepository.deleteById(vacId);
        return true;
    }

    @Override
    public List<VacataireDto> RecupereToutVacataire() {
        List<VacataireDto> vacataireDtos = new ArrayList<>();
        List<Vacataire> dogs = vacataireRepository.findAll();
        dogs.forEach(dog -> {
            vacataireDtos.add(vacataireEntityToDto(dog));
        });
        return vacataireDtos;
    }
    /**
     * Map Vacataire dto to Vacataire entity
     */
    private VacataireDto vacataireEntityToDto(Vacataire vacataire){
        VacataireDto vacataireDto = new VacataireDto();
        vacataireDto.setId(vacataire.getId());
        vacataireDto.setNom(vacataire.getNom());
        vacataireDto.setPrenom(vacataire.getPrenom());
        vacataireDto.setMail(vacataire.getMail());
        return vacataireDto;
    }

    /**
     * Map Vacaire entity to Vacataire dto
     */
    private Vacataire vacataireDtoToEntity(VacataireDto vacataireDto){
        Vacataire vacataire = new Vacataire();
        vacataire.setNom(vacataireDto.getNom());
        vacataire.setId(vacataireDto.getId());
        vacataire.setPrenom(vacataireDto.getPrenom());
        vacataire.setMail(vacataireDto.getMail());
        return vacataire;
    }
}
