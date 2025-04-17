package tn.sesame.secproject.services;


import tn.sesame.secproject.entities.Agence;

import java.util.List;

public interface IAgenceServices {
    public List<Agence> getAgences();

    public Agence getAgence(int id);

    public Agence addAgence(Agence agence);

    public Agence updateAgence(Agence agence);

    public void deleteAgence(int id);


}
