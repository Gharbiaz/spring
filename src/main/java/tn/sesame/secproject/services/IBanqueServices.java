package tn.sesame.secproject.services;


import tn.sesame.secproject.entities.Banque;

import java.util.List;

public interface IBanqueServices {

    List<Banque> getAllBanque ();
    Banque  addBanque ( Banque  u);
    Banque  updateBanque  ( Banque  u);
    Banque  getBanque (int idBanque  );
    public List<Banque>  getBAnqueNomSiege (String nom, String siege );

    public Banque affecterBanqueAgence(int idB , int idAg );
}