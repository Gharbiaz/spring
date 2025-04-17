package tn.sesame.secproject.controller;

import tn.sesame.secproject.entities.Banque;
import tn.sesame.secproject.entities.Compte;
import tn.sesame.secproject.services.ICompteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sesame.secproject.services.ICompteServices;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteController {

    @Autowired
    ICompteServices compteServices;

    @GetMapping
    public List<Compte> getComptes() {
        return compteServices.getComptes();
    }

    @GetMapping("/{id}")
    public Compte getCompteById(@PathVariable int id) {
        return compteServices.getCompte(id);
    }

    @PostMapping("/addCompte")
    public Compte addCompte(@RequestBody Compte compte) {
        return compteServices.addCompte(compte);
    }


    @DeleteMapping("/deleteCompte/{id}")
    public void deleteCompte(@PathVariable int id) {
        compteServices.deleteCompte(id);
    }

    @GetMapping("/affectationCompteClient/{idclient}/{idcompte}")
    public Compte affectationCompteClient(@PathVariable("idcompte") int idcompte, @PathVariable("idclient") int idclient){
        return compteServices.affectationClient(idcompte,idclient);
    }
}