package tn.sesame.secproject.controller;

import tn.sesame.secproject.entities.DemandeCredit;
import tn.sesame.secproject.services.IDemandeCreditServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandes-credit")
public class DemandeCreditController {

    @Autowired
    IDemandeCreditServices demandeCreditServices;

    @GetMapping
    public List<DemandeCredit> getAllDemandeCredit() {
        return demandeCreditServices.getAllDemandeCredit();
    }

    @GetMapping("/{id}")
    public DemandeCredit getDemandeCreditById(@PathVariable int id) {
        return demandeCreditServices.getDemandeCreditById(id);
    }

    @PostMapping("/addDemandeCredit")
    public DemandeCredit addDemandeCredit(@RequestBody DemandeCredit demandeCredit) {
        return demandeCreditServices.createDemandeCredit(demandeCredit);
    }

    @PatchMapping("/updateDemandeCredit/{id}")
    public DemandeCredit updateDemandeCredit(@PathVariable int id, @RequestBody DemandeCredit demandeCredit) {
        demandeCredit.setId(id);
        return demandeCreditServices.updateDemandeCredit(demandeCredit);
    }

    @DeleteMapping("/deleteDemandeCredit/{id}")
    public void deleteDemandeCredit(@PathVariable int id) {
        demandeCreditServices.deleteDemandeCreditById(id);
    }
}