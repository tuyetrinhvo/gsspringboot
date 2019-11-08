package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.Client;
import com.cesi.bankonet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path="client/{id}")
    public @ResponseBody Client getClient(@PathVariable Integer id) {
        return clientRepository.findById(id).get();
    }

    @GetMapping(path="/client/all")
    public @ResponseBody Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
