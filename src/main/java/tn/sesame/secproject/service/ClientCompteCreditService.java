package tn.sesame.secproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Client;
import tn.sesame.secproject.entities.Compte;
import tn.sesame.secproject.entities.DemandeCredit;
import tn.sesame.secproject.repository.IClientRepository;
import tn.sesame.secproject.repository.ICompteRepository;
import tn.sesame.secproject.repository.IDemandecreditRepository;

import java.util.List;

@Service
public class ClientCompteCreditService implements IClientCompteCreditService {
    @Autowired
    private IClientRepository clientRepository;
    @Autowired
    private ICompteRepository compteRepository;
    @Autowired
    private IDemandecreditRepository demandecreditRepository;

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
    public List<Compte> getComptes() {
        return (List<Compte>) compteRepository.findAll();
    }

    @Override
    public Compte getCompte(int id) {
        return compteRepository.findById(id).orElse(null);
    }

    @Override
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public void deleteCompte(int id) {
        compteRepository.deleteById(id);
    }

    @Override
    public List<DemandeCredit> getDemandeCredits() {
        return (List<DemandeCredit>) demandecreditRepository.findAll();
    }

    @Override
    public DemandeCredit getDemandeCredit(int id) {
        return demandecreditRepository.findById(id).orElse(null);
    }

    @Override
    public DemandeCredit addDemandeCredit(DemandeCredit demandeCredit) {
        return demandecreditRepository.save(demandeCredit);
    }

    @Override
    public DemandeCredit updateDemandeCredit(DemandeCredit demandeCredit) {
        return demandecreditRepository.save(demandeCredit);
    }

    @Override
    public void deleteDemandeCredit(int id) {
        demandecreditRepository.deleteById(id);
    }
}