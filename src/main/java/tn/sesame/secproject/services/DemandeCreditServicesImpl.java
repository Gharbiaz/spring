package tn.sesame.secproject.services;

import tn.sesame.secproject.entities.DemandeCredit;
import tn.sesame.secproject.repository.IDemandeCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandeCreditServicesImpl implements IDemandeCreditServices {

    @Autowired
    IDemandeCreditRepository demandecreditRepository;

    @Override
    public List<DemandeCredit> getAllDemandeCredit() {
        return (List<DemandeCredit>) demandecreditRepository.findAll();
    }

    @Override
    public DemandeCredit getDemandeCreditById(int id) {
        return demandecreditRepository.findById(id).orElse(null);
    }

    @Override
    public DemandeCredit createDemandeCredit(DemandeCredit demandecredit) {
        return demandecreditRepository.save(demandecredit);
    }

    @Override
    public DemandeCredit updateDemandeCredit(DemandeCredit demandecredit) {
        return demandecreditRepository.save(demandecredit);
    }

    @Override
    public void deleteDemandeCreditById(int id) {
        demandecreditRepository.deleteById(id);
    }
}