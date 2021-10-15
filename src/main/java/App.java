import org.example.volunteers.Personne;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws IOException {
        List<String[]> lines = Files.readAllLines(Paths.get("src/main/resources/data.csv"))
            .stream().map(string -> string.split(";", -1))
            .collect(toList());

        //Instantiation des personnes
        List<Personne> personnes = new ArrayList<>();
        for (String[] line : lines) {
            personnes.add(new Personne (line));
        }

        //On formate les champs
        for (Personne per : personnes){
            per.formater();
        }

        //On boucle sur tous
        for (int i=0 ; i< personnes.size() ; i++){
            //On check les doublons et on rempli tmtc
            for (int j=0 ; j< personnes.size() ; j++){
                //On regarde si c'est un doublons
                if(personnes.get(i).isDoublon(personnes.get(j))){
                    //On complete le tt
                    personnes.get(i).complete(personnes.get(j));
                    //On le remove pour ne pas repasser dessus et donc enlever les doublons
                    personnes.remove(j);
                }
            }
        }

        System.out.println("Result goes here");
    }
}
