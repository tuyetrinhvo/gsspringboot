package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class CompteEpargne extends Compte{

    private double tauxInteret;

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne(){}
    public CompteEpargne(String n, String i, double s, double t) {
        this.numero = n;
        this.intitule = i;
        this.solde = s;
        this.tauxInteret = t;
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

    public double calculerInterests() {

        return solde * tauxInteret;
    }

}
