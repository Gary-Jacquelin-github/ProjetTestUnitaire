import jdk.javadoc.internal.doclets.toolkit.builders.AnnotationTypeOptionalMemberBuilder;

public class Personne {
    public String nom;
    public String prenom;
    public String pseudo;
    public String adresseMail;
    public String tel;

    public Personne(String[] tableau){
        nom = tableau[0];
    }

}
