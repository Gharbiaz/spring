package tn.sesame.secproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.entities.Banque;
import tn.sesame.secproject.repository.IAgenceRepository;
import tn.sesame.secproject.repository.IBanqueRepository;

import java.util.List;

@Service
public class BanqueServicesImpl implements IBanqueServices {

    @Autowired
    IBanqueRepository banqueRepo;
    @Autowired
    IAgenceRepository agenceRepo;



    @Override
    public List<Banque> getAllBanque() {
        return (List<Banque>) banqueRepo.findAll();
    }

    @Override
    public Banque addBanque(Banque u) {
        return banqueRepo.save(u);
    }

    @Override
    public Banque updateBanque(Banque u) {

        return banqueRepo.save(u);
    }

    @Override
    public Banque getBanque(int idBanque) {
        return banqueRepo.findById(idBanque).orElse(null);
    }

    @Override
    public List<Banque> getBAnqueNomSiege(String nom, String siege) {
        return banqueRepo.findByNomAndSiege(nom, siege);
    }


    @Override
    public Banque affecterBanqueAgence(int idB, int idAg) {
        Banque banque = banqueRepo.findById(idB).get();
        Agence agence = agenceRepo.findById(idAg).get();
        banque.getAgences().add(agence) ;
        return banqueRepo.save(banque);
    }
}