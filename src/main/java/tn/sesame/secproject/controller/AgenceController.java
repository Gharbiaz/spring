package tn.sesame.secproject.controller;

import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.services.IAgenceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agences")
public class AgenceController {

    @Autowired
    IAgenceServices agenceService;

    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.getAgences();
    }

    @GetMapping("/{id}")
    public  Agence getAgenceById(@PathVariable int id) {
        return agenceService.getAgence(id);
    }

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PatchMapping("/updateAgence/{id}")
    public Agence updateAgence(@PathVariable int id,@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable int id) {
        agenceService.deleteAgence(id);
    }
}