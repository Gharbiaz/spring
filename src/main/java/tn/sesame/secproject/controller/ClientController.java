package tn.sesame.secproject.controller;

import tn.sesame.secproject.entities.Client;
import tn.sesame.secproject.services.IClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    IClientServices clientServices;

    @GetMapping
    public List<Client> getClients() {
        return clientServices.getClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientServices.getClient(id);
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientServices.addClient(client);
    }

    @PatchMapping("/updateClient/{id}")
    public Client updateClient(@PathVariable int id, @RequestBody Client client) {
        client.setId(id);
        return clientServices.updateClient(client);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable int id) {
        clientServices.deleteClient(id);
    }
}