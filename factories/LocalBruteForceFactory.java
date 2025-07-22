package factories;

import crackers.BruteForceCracker;
import crackers.PasswordCracker;
import targets.LocalTarget;
import targets.Target;

public class LocalBruteForceFactory implements PasswordCrackerFactory{

    private String login; // identifiant de la cible

    public LocalBruteForceFactory(String login){
        this.login = login;
    }

    // cretion d'un cracker de type brute force
    public PasswordCracker createCracker(){
        return new BruteForceCracker();
    }

    // cretion d'une cible de type local
    public Target createTarget(){
        return new LocalTarget(login, "passer1234");
    }
}