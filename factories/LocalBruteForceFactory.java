package factories;

import crackers.BruteForceCracker;
import crackers.PasswordCracker;
import targets.LocalTarget;
import targets.Target;

public class LocalBruteForceFactory implements CrackerFactory{
    
    private String login;

    public LocalBruteForceFactory(String login){
        this.login = login;
    }

    public PasswordCracker createCracker(){
        return new BruteForceCracker();
    }

    public Target createTarget(){
        return new LocalTarget(login, "passer1234");
    }
     
}