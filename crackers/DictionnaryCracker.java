package crackers;

import targets.Target;
import java.io.*;

public class DictionnaryCracker implements PasswordCracker {

    public void crack(Target target){
        System.out.println("Lancement d'une attaque Dictionnaire");

        // Lecture du fichier dictionnaire ligne par ligne
        try (BufferedReader br = new BufferedReader(new FileReader("dictionnaire.txt"))){
            String ligne;
            while ((ligne = br.readLine()) != null) {
                // Tentative avec chaque mot du dictionnaire 
                if (target.attempt(ligne)) {
                    System.out.println("Mot de passe trouvé : " + ligne);
                    return;
                }
            }
            System.out.println("Mot de Passe non trouvé");
        }catch (IOException exception){
            System.out.println("erreur lors de la lecture du dictionnaire");
        }
    }

}