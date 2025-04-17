package tn.sesame.secproject.services;

import tn.sesame.secproject.entities.Client;



import java.util.List;

public interface IClientServices {

    public List<Client> getClients();
    public Client getClient(int id);
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public void deleteClient(int id);

    Client affecterClientAgence(Client c, int idAgence);


        Client ajouterAffecterClientCompte(Client c);



}
