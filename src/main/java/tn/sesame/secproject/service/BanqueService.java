package tn.sesame.secproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Banque;
import tn.sesame.secproject.entities.Directeur;
import tn.sesame.secproject.repository.IBanqueRepository;
import tn.sesame.secproject.repository.IDirecteurRepository;

import java.util.List;

@Service
public class BanqueService implements IBanqueService{
    @Autowired
    private IBanqueRepository banqueRepo;
    @Autowired
    private IDirecteurRepository directeurRepo;

    @Override
    public List<Banque> getAllBanque() {
        return (List<Banque>) banqueRepo.findAll();
    }

    @Override
    public Banque getBanqueById(int id) {
        return banqueRepo.findById(id).orElse(null);
    }

    @Override
    public Banque addBanque(Banque banque) {
        return banqueRepo.save(banque);
    }

    @Override
    public Banque updateBanque(Banque banque) {
        return banqueRepo.save(banque);
    }

    @Override
    public void deleteBanque(Banque banque) {
        banqueRepo.delete(banque);
    }


    //***************************Directeur****************************//
    @Override
    public List<Directeur> getAllDirecteur() {
        return (List<Directeur>) directeurRepo.findAll();
    }

    @Override
    public Directeur getDirecteurById(int id) {
        return directeurRepo.findById(id).orElse(null);
    }

    @Override
    public Directeur addDirecteur(Directeur directeur) {
        return directeurRepo.save(directeur);
    }

    @Override
    public Directeur updateDirecteur(Directeur directeur) {
        return directeurRepo.save(directeur);
    }

    @Override
    public void deleteDirecteur(Directeur directeur) {
        directeurRepo.delete(directeur);
    }


}