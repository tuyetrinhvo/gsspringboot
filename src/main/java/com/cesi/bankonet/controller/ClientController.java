package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.Client;
import com.cesi.bankonet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
