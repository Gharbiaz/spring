package tn.sesame.secproject.services;
import tn.sesame.secproject.entities.Directeur;
import tn.sesame.secproject.repository.IDirecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirecteurServicesImpl implements IDirecteurServices {

    @Autowired
    IDirecteurRepository directeurRepository;

    @Override
    public List<Directeur> getAllDirecteurs() {
        return (List<Directeur>) directeurRepository.findAll();
    }

    @Override
    public Directeur getDirecteurById(int id) {
        return directeurRepository.findById(id).orElse(null);
    }

    @Override
    public Directeur createDirecteur(Directeur directeur) {
        return directeurRepository.save(directeur);
    }

    @Override
    public Directeur updateDirecteur(Directeur directeur) {
        return directeurRepository.save(directeur);
    }

    @Override
    public void deleteDirecteurById(int id) {
        directeurRepository.deleteById(id);
    }

    @Override
    public Directeur getDirecteurByAgenceNom(String nom) {
        return directeurRepository.findByAgenceNom(nom);
    }
}