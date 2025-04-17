package tn.sesame.secproject.services;

import tn.sesame.secproject.entities.DemandeCredit;

import java.util.List;

public interface IDemandeCreditServices {

    public List<DemandeCredit> getAllDemandeCredit();
    public DemandeCredit getDemandeCreditById(int id);
    public DemandeCredit createDemandeCredit(DemandeCredit demandecredit);
    public DemandeCredit updateDemandeCredit(DemandeCredit demandecredit);
    public void deleteDemandeCreditById(int id);

}
