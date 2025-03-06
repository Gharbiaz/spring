package tn.sesame.secproject.service;

import tn.sesame.secproject.entities.Client;
import tn.sesame.secproject.entities.Compte;
import tn.sesame.secproject.entities.DemandeCredit;

import java.util.List;

public interface IClientCompteCreditService {
    public List<Client> getClients();
    public Client getClient(int id);
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public void deleteClient(int id);

    public List<Compte> getComptes();
    public Compte getCompte(int id);
    public Compte addCompte(Compte compte);
    public Compte updateCompte(Compte compte);
    public void deleteCompte(int id);

    public List<DemandeCredit> getDemandeCredits();
    public DemandeCredit getDemandeCredit(int id);
    public DemandeCredit addDemandeCredit(DemandeCredit demandeCredit);
    public DemandeCredit updateDemandeCredit(DemandeCredit demandeCredit);
    public void deleteDemandeCredit(int id);
}