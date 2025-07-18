package crackers;

import targets.Target;

public class BruteForceCracker implements PasswordCracker {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
    private final int LongueurMax = 4;
    private boolean found = false;

    public void crack(Target target){
        System.out.println("Debut de l'attaque Brute Force");
        for(int longuer=1;longuer <= LongueurMax; longuer++){
            generateAndTest("",target,longuer);
        }
    }

    private void generateAndTest(String current,Target target,int max){

        if (found) {
            return;
        }

        if (current.length() == max) {
            if (target.attempt(current)) {
                System.out.println("Mot de passe trouvé : " + current);
                found = true;
            }
            return;
        }

        for(char c : alphabet.toCharArray()){
            generateAndTest(current + c , target, max);
            if (found) {
                return;
            }
        }

    }
    
}