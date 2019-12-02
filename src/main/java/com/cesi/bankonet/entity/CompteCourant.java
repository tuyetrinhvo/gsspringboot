package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
public class CompteCourant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String numero;

    private String intitule;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private double solde;

    private double montantDecouvertAutorise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CompteCourant(){}
    public CompteCourant(String n, String i, double s, double m) {
        this.numero = n;
        this.intitule = i;
        this.solde = s;
        this.montantDecouvertAutorise = m;
    }

    public String toString() {
        return "test";
    }

    public void debiter(double montant) {
        solde -= montant;
    }

    public void crediter(double montant) {
        solde += montant;
    }
}
