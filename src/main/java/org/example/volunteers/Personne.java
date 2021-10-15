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

}
