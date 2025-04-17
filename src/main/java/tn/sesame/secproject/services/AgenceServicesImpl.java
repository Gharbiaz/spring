package tn.sesame.secproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Admin;
import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.repository.IAgenceRepository;

import java.util.List;

@Service
public class AgenceServicesImpl implements IAgenceServices {

    @Autowired
    IAgenceRepository agenceRepository;

    @Override
    public List<Agence> getAgences() {
        return (List<Agence>) agenceRepository.findAll();
    }

    @Override
    public Agence getAgence(int id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }
}