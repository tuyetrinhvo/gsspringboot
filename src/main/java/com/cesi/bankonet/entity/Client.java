package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

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
    private Set<CompteCourant> compteCourants;

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

    public Client(){}
    public Client(String i, String n, String p) {
        this.identifiant = i;
        this.nom = n;
        this.prenom = p;
    }

    public Set<CompteCourant> getCompteCourants() {
        return compteCourants;
    }

    public void setCompteCourants(Set<CompteCourant> compteCourants) {
        this.compteCourants = compteCourants;
    }

    @Override
    public String toString() {

        return "Client [identifiant=" + identifiant + ", Nom=" + nom + ", Prénom=" + prenom + "]";
    }

    public double calculerAvoirGlobal() {

        return 1.0;
    }

}
