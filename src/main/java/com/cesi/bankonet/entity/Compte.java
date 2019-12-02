package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@MappedSuperclass
public abstract class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    protected String numero;

    protected String intitule;

    protected double solde;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "client_id")
    protected Client client;

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

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
