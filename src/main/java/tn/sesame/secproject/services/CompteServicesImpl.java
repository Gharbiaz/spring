package tn.sesame.secproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Client;
import tn.sesame.secproject.repository.IClientRepository;
import tn.sesame.secproject.repository.ICompteRepository;
import tn.sesame.secproject.entities.Compte;

import java.util.List;

@Service
public class CompteServicesImpl implements ICompteServices {

    @Autowired
    ICompteRepository compteRepository;
    @Autowired
    IClientRepository clientRepository;

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
    public Compte affectationClient(int idcompte, int idclient){
        Compte compte = compteRepository.findById(idcompte).orElse(null);
        Client client = clientRepository.findById(idclient).orElse(null);

        if(compte != null && client != null){
            compte.setClient(client);
            return compteRepository.save(compte);
        }

        return null;
    }


    @Override
    public Compte affecterClientCompte(Client c, int idCompte) {
        Compte compte = compteRepository.findById(idCompte).orElse(null);
        Client client = clientRepository.findById(c.getId())
                .orElse(null);

        compte.setClient(client);
        return compteRepository.save(compte);
    }

}
