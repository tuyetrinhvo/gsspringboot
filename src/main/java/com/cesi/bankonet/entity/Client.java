package com.cesi.bankonet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String identifiant;

    private String nom;

    private  String prenom;

    private CompteCourant compteCourant;

    private CompteEpargne compteEpargne;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    public Client(String i, String n, String p, CompteCourant cc, CompteEpargne ce) {
        this.identifiant = i;
        this.nom = n;
        this.prenom = p;
        this.compteCourant = cc;
        this.compteEpargne = ce;
    }

    public String toString() {
        return "test";
    }

    public double calculerAvoirGlobal() {
        return this.compteCourant.getSolde() + this.compteEpargne.getSolde();
    }

}
