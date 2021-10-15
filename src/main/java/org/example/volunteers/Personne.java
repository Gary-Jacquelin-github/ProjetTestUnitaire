package org.example.volunteers;

import jdk.javadoc.internal.doclets.toolkit.builders.AnnotationTypeOptionalMemberBuilder;

public class Personne {
    public String nom;
    public String prenom;
    public String pseudo;
    public String adresseMail;
    public String tel;

    public Personne(){}

    public Personne(String[] tableau){
        nom = tableau[0];
        prenom = tableau[1];
        pseudo = tableau[2];
        adresseMail = tableau[3];
        tel = tableau[4];
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
