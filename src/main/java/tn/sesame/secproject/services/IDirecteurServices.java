package tn.sesame.secproject.services;

import tn.sesame.secproject.entities.DemandeCredit;
import tn.sesame.secproject.entities.Directeur;

import java.util.List;

public interface IDirecteurServices {

    public List<Directeur> getAllDirecteurs();
    public Directeur getDirecteurById(int id);
    public Directeur createDirecteur(Directeur directeur);
    public Directeur updateDirecteur(Directeur directeur);
    Directeur getDirecteurByAgenceNom(String nom);
    public void deleteDirecteurById(int id);
}