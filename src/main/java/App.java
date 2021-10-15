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
            .stream().map(string -> string.split(";"))
            .collect(toList());

        List<Personne> personnes = new ArrayList<>();
        for (String[] line : lines) {
            personnes.add(new Personne (line));
        }

        // Apply dark magic here...

        System.out.println("Result goes here");
    }
}
