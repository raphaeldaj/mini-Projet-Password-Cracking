package crackers;

import targets.Target;

public class BruteForceCracker implements PasswordCracker {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
    private final int LongueurMax = 4;

    public void crack(Target target){
        System.out.println("Debut de l'attaque Brute Force");
        generateAndTest("",target);
    }

    private void generateAndTest(String current,Target target){

        if (current.length() > LongueurMax) {
            System.out.println("la longuer maximal a été depassée");
            return;
        }

        if (target.attempt(current)) {
            System.out.println("Mot de passe trouvé : " + current);
            return;
        }

        for(char c : alphabet.toCharArray()){
            generateAndTest(current + c , target);
        }

    }
    
}