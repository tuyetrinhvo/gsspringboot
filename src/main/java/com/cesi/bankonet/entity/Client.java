package com.cesi.bankonet.entity;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String identifiant;

    private String nom;

    private  String prenom;

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
    private Client(String i, String n, String p, CompteCourant compteCourants) {
        this.identifiant = i;
        this.nom = n;
        this.prenom = p;
        this.compteCourants = Stream.of(compteCourants).collect(Collectors.toSet());
        this.compteCourants.forEach(x -> x.setClient(this));
    }

    @Override
    public String toString() {

        return "Client [identifiant=" + identifiant + ", Nom=" + nom + ", Prénom=" + prenom + "]";
    }

    public double calculerAvoirGlobal() {

        return 1.0;
    }

}
