package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.Client;
import com.cesi.bankonet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path="/get/{id}")
    public Client getClient(@PathVariable Integer id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping(path="/create")
    public Client createNewClient(@RequestBody Client newClient) {
        return clientRepository.save(newClient);
    }

    @GetMapping(path="/all")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PutMapping(path = "/update/{id}")
    public Client updateClient(@RequestBody Client newClient, @PathVariable Integer id) {
        return clientRepository.findById(id).map(
                client -> {
                    client.setIdentifiant(newClient.getIdentifiant());
                    client.setNom(newClient.getNom());
                    client.setPrenom(newClient.getPrenom());
                    return clientRepository.save(client);
                }).orElseGet(() -> {
                    newClient.setId(id);
                    return clientRepository.save(newClient);
        });
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Integer id) {
        clientRepository.deleteById(id);
    }
}
