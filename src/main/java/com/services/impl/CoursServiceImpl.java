package com.services.impl;

import com.dtos.CoursDto;
import com.entities.Cours;
import com.entities.Vacataire;
import com.repositories.CoursRepository;
import com.repositories.VacataireRepository;
import com.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("coursService")
public class CoursServiceImpl implements CoursService {
    private final CoursRepository coursRepository;

    public CoursServiceImpl(CoursRepository coursRepository){
        this.coursRepository = coursRepository;
    }

    @Override
    public CoursDto creerCours(CoursDto coursDto) {
        //Conversion du dto pour une entité Cours
        Cours cours = coursDtoToEntity(coursDto);
        // Sauvegarde de l'entité Cours
        cours = coursRepository.save(cours);
        // Return du nouveau dto
        return coursEntityToDto(cours);
    }

    @Override
    public CoursDto RecupereCoursById(Long coursId) {
        Cours cours = coursRepository.findById(coursId).orElseThrow(() -> new EntityNotFoundException("cours not found"));
        return coursEntityToDto(cours);
    }

    @Override
    public boolean SupprimmeCours(Long coursId)
    {
        coursRepository.deleteById(coursId);
        return true;
    }

    @Override
    public List<CoursDto> recupereToutCours() {
        List<CoursDto> coursDtos = new ArrayList<>();
        List<Cours> courss = coursRepository.findAll();
        courss.forEach(cours -> {
            coursDtos.add(coursEntityToDto(cours));
        });
        return coursDtos;
    }

    public List<CoursDto> recupereToutCoursById(Long id){
        List<CoursDto> res = new ArrayList<>();
        List<CoursDto> liste = this.recupereToutCours();
        for (int i=0; i< liste.size();i++){
            if (id == liste.get(i).getId()){
                res.add(liste.get(i));
            }
        }
        return res;
    }

    /**
     * Les mappeurs permettent tout simplement de transformer les entités en dto car ce sont des objets différents.
     * Cela permet de bien séparer la couche web (Controller - Service) de la couche data ( Service - entités/daos)
     * C'est juste une maniere de faire, generalement le mappeur est a l'exterieur du service et on utilise des librairies pour automatiser =)
     */


    /**
     * Map cours dto to cours entity
     */
    private CoursDto coursEntityToDto(Cours cours){
        CoursDto coursDto = new CoursDto();
        coursDto.setIntitule(cours.getIntitule());
        coursDto.setId(cours.getId());

        return coursDto;
    }

    /**
     * Map cours entity to cours dto
     */
    private Cours coursDtoToEntity(CoursDto CoursDto){
        Cours cours = new Cours();
        cours.setIntitule(CoursDto.getIntitule());
        cours.setId(CoursDto.getId());
        return cours;
    }
}
