package com.cesi.bankonet.controller;

import com.cesi.bankonet.entity.CompteEpargne;
import com.cesi.bankonet.repository.CompteEpargneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/compteEpargne")
public class CompteEpargneController {

    @Autowired
    private CompteEpargneRepository ceRepository;

    @PostMapping(path = "/create")
    public CompteEpargne createNewCompteEpargne(@RequestBody CompteEpargne newCe) {
        return ceRepository.save(newCe);
    }

    @GetMapping(path = "/get/{id}")
    public CompteEpargne getCompteEpargne(@PathVariable Integer id) {
        return ceRepository.findById(id).get();
    }

    @GetMapping(path="/all")
    public List<CompteEpargne> getAllComptes() {
        return ceRepository.findAll();
    }
}
