package factories;

import crackers.BruteForceCracker;
import crackers.PasswordCracker;
import targets.OnlineTarget;
import targets.Target;

public class OnlineBruteForceFactory implements PasswordCrackerFactory {
    private String login; // Identifiant de la cible

    public OnlineBruteForceFactory(String login){
        this.login = login;
    }

    // Creation d'un cracker de type Brute Force
    public PasswordCracker createCracker(){
        return new BruteForceCracker();
    }

    // Creation d'une cible de type online
    public Target createTarget(){
        return new OnlineTarget(login);
    }
    
}