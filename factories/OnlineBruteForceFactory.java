package factories;

import crackers.BruteForceCracker;
import crackers.PasswordCracker;
import targets.OnlineTarget;
import targets.Target;

public class OnlineBruteForceFactory implements PasswordCrackerFactory {
    private String login;

    public OnlineBruteForceFactory(String login){
        this.login = login;
    }

    public PasswordCracker createCracker(){
        return new BruteForceCracker();
    }

    public Target createTarget(){
        return new OnlineTarget(login);
    }
    
}