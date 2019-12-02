package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.CompteCourant;
import com.cesi.bankonet.repository.CompteCourantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/client")
public class CompteCourantController {

    @Autowired
    private CompteCourantRepository repository;

    @PostMapping(path = "/compteCourant")
    public CompteCourant createNewCompteCourant(@RequestBody CompteCourant newCc) {
        return repository.save(newCc);
    }

    @GetMapping(path="/compteCourant/{id}")
    public CompteCourant getCompteCourant(@PathVariable Integer id) {
        return repository.findById(id).get();
    }
}
