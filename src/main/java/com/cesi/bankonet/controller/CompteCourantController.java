package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.Client;
import com.cesi.bankonet.entity.CompteCourant;
import com.cesi.bankonet.repository.CompteCourantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/compteCourant")
public class CompteCourantController {

    @Autowired
    private CompteCourantRepository ccRepository;

    @PostMapping(path = "/create")
    public CompteCourant createNewCompteCourant(@RequestBody CompteCourant newCc) {
        return ccRepository.save(newCc);
    }

    @GetMapping(path="/get/{id}")
    public CompteCourant getCompteCourant(@PathVariable Integer id) {
        return ccRepository.findById(id).get();
    }

    @GetMapping(path="/all")
    public List<CompteCourant> getAllComptes() {
        return ccRepository.findAll();
    }

}
