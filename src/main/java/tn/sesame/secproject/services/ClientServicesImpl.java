package tn.sesame.secproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Client;
import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.entities.Compte;
import tn.sesame.secproject.repository.IAgenceRepository;
import tn.sesame.secproject.repository.IClientRepository;
import tn.sesame.secproject.repository.ICompteRepository;

import java.util.List;


@Service
public class ClientServicesImpl implements IClientServices {

    @Autowired
    IClientRepository clientRepository;
    @Autowired
    ICompteRepository compteRepository;
    @Autowired
    IAgenceRepository agenceRepository;

    @Override
    public List<Client> getClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client getClient(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }


    @Override
    public Client affecterClientAgence(Client c, int idAgence) {
        Agence agence = agenceRepository.findById(idAgence).orElse(null);

        c.setAgence(agence);
        return clientRepository.save(c);
    }

    @Override
    public Client ajouterAffecterClientCompte(Client c) {
        if (c.getComptes() != null) {
            for (Compte compte : c.getComptes()) {
                compte.setClient(c);
                compteRepository.save(compte);
            }
        }
        return c;
    }
}
