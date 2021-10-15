package org.example.volunteers;

import jdk.javadoc.internal.doclets.toolkit.builders.AnnotationTypeOptionalMemberBuilder;

public class Personne {
    public String nom;
    public String prenom;
    public String pseudo;
    public String adresseMail;
    public String tel;

    public Personne(){}

    /**
     * Constructeur de base
     * @param tableau les champs remplis
     */
    public Personne(String[] tableau){
        nom = tableau[0];
        prenom = tableau[1];
        pseudo = tableau[2];
        adresseMail = tableau[3];
        tel = tableau[4];
    }
    /**
     * Regarde si pour un objet donné, l'objet en parametre est un doublon
     * @param personne personne qui est un doublon
     * @return si c'est un doublon
     */
    public boolean isDoublon(Personne personne){
        return this.tel.equals(personne.tel) || this.adresseMail.equals(personne.adresseMail) || this.pseudo.equals(personne.pseudo);
    }

    /**
     * Complete l'objet personne en fonction du supposé doublon en parametre
     * @param personne doublon qui doit completer l'objet
     */
    public void complete(Personne personne){
        if( this.nom.equals("")){
            this.nom = personne.nom;
        }
        if( this.prenom.equals("")){
            this.prenom = personne.prenom;
        }
        if( this.pseudo.equals("")){
            this.prenom = personne.prenom;
        }
        if( this.adresseMail.equals("")){
            this.adresseMail = personne.adresseMail;
        }
        if( this.tel.equals("")){
            this.tel = personne.tel;
        }
    }
}
