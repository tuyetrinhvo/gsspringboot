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

    @PutMapping(path = "/update/{id}")
    public CompteCourant updateCompte(@RequestBody CompteCourant newCompte, @PathVariable Integer id) {
        return ccRepository.findById(id).map(
                compte -> {
                    compte.setNumero(newCompte.getNumero());
                    compte.setIntitule(newCompte.getIntitule());
                    compte.setSolde(newCompte.getSolde());
                    compte.setMontantDecouvertAutorise(newCompte.getMontantDecouvertAutorise());
                    compte.setClient(newCompte.getClient());
                    return ccRepository.save(compte);
                }).orElseGet(() -> {
            newCompte.setId(id);
            return ccRepository.save(newCompte);
        });
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompte(@PathVariable Integer id) {
        ccRepository.deleteById(id);
    }

}
