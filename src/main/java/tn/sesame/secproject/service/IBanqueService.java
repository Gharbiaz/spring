package tn.sesame.secproject.service;

import tn.sesame.secproject.entities.Banque;
import tn.sesame.secproject.entities.Directeur;

import java.util.List;

public interface IBanqueService {
    public List<Banque> getAllBanque();
    public Banque getBanqueById(int id);
    public Banque addBanque(Banque banque);
    public Banque updateBanque(Banque banque);
    public void deleteBanque(Banque banque);

    public List<Directeur> getAllDirecteur();
    public Directeur getDirecteurById(int id);
    public Directeur addDirecteur(Directeur directeur);
    public Directeur updateDirecteur(Directeur directeur);
    public void deleteDirecteur(Directeur directeur);

}