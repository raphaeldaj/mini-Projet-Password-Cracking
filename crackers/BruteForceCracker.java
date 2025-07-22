package crackers;

import targets.Target;

public class BruteForceCracker implements PasswordCracker {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789"; // Caractere utilise pour generer les combinaisons
    private final int LongueurMax = 10; // longueur maximale des mot de passe a tester
    private  boolean found = false; // variable permetteant d'arreter la recherche lorsque le mot de passe est trouve
    
    public void crack(Target target){
        System.out.println("Debut de l'attaque Brute Force");
        // test avec toutes les longueur comprise entre 1 et la longueurMax 
        for(int longuer=1;longuer <= LongueurMax; longuer++){
            generateAndTest("",target,longuer);
        }
    }

    // Methode recursive pour generer et tester toutes les combinaisons possibles
    private void generateAndTest(String current,Target target,int max){

        if (found) {
            return;  // on arrete si le mot de passe a ete trouve
        }

        if (current.length() == max) { // On verifie la longueur de la combinaison actuelle
            if (target.attempt(current)) {
                System.out.println("Mot de passe trouvé : " + current);
                found = true;
                return;
            }
            return;
        }

        // Generation des combinaisons 
        for(char c : alphabet.toCharArray()){
            generateAndTest(current + c , target, max);
            if (found) {
                return; // on arrete si le mot de passe a ete trouve
            }

        }

    }
    
}