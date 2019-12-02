package com.cesi.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
public class CompteCourant extends Compte{

    @Column(name ="montant_decouvert_autorise")
    private double montantDecouvertAutorise;

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
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
