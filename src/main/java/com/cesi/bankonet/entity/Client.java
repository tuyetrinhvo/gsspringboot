package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String identifiant;

    private String nom;

    private  String prenom;

    @JsonManagedReference
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<CompteCourant> compteCourants;

    @JsonManagedReference
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<CompteEpargne> compteEpargnes;

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

    public List<CompteCourant> getCompteCourants() {
        return compteCourants;
    }

    public void setCompteCourants(List<CompteCourant> compteCourants) {
        this.compteCourants = compteCourants;
    }

    public List<CompteEpargne> getCompteEpargnes() {
        return compteEpargnes;
    }

    public void setCompteEpargnes(List<CompteEpargne> compteEpargnes) {
        this.compteEpargnes = compteEpargnes;
    }

    public Client(){}
    public Client(String i, String n, String p) {
        this.identifiant = i;
        this.nom = n;
        this.prenom = p;
    }

    @Override
    public String toString() {

        return "Client [identifiant=" + identifiant + ", Nom=" + nom + ", Prénom=" + prenom + "]";
    }

    public double calculerAvoirGlobal() {

        return 1.0;
    }

}
