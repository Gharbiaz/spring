package tn.sesame.secproject.services;

import tn.sesame.secproject.entities.Compte;
import tn.sesame.secproject.entities.Client;
import java.util.List;

public interface ICompteServices {

    public List<Compte> getComptes();
    public Compte getCompte(int id);
    public Compte addCompte(Compte compte);
    public Compte updateCompte(Compte compte);
    public void deleteCompte(int id);

    public Compte affectationClient(int idcompte, int idclient);

    Compte affecterClientCompte(Client c, int idCompte);
}
