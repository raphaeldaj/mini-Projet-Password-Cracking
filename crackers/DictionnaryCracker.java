package crackers;

import targets.Target;
import java.io.*;

public class DictionnaryCracker implements PasswordCracker {

    public void crack(Target target){
        System.out.println("Lancement d'une attaque Dictionnaire");

        try (BufferedReader br = new BufferedReader(new FileReader(Dictionnaire.txt))){
            String ligne;
            while ((ligne = br.readLine()) != null) {
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