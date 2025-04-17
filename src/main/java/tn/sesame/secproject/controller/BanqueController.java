package tn.sesame.secproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sesame.secproject.entities.Banque;
import tn.sesame.secproject.services.IBanqueServices;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class BanqueController {
    @Autowired
    IBanqueServices banqueServices;

    @GetMapping("/getAll")
    public List<Banque> getaBanques(){
        return banqueServices.getAllBanque();
    }

    @PostMapping("/addBanque")
    public Banque createBanque(@RequestBody Banque banque){
        return banqueServices.addBanque(banque);
    }

    @GetMapping("/getById/{id}")
    public Banque getBanqueById(@PathVariable("id") int id){
        return banqueServices.getBanque(id);
    }

    @GetMapping("/getnomSiege/{nom}/{siege}")
    public List<Banque> getBanqueNomSiege(@PathVariable("nom") String nom, @PathVariable("siege") String siege){
        return banqueServices.getBAnqueNomSiege(nom,siege);
    }


    @PutMapping("/{idBanque}/agences/{idAgence}")
    public Banque affecterBanqueAgence(@PathVariable int idBanque, @PathVariable int idAgence) {
        return  banqueServices.affecterBanqueAgence(idBanque, idAgence);
    }
}