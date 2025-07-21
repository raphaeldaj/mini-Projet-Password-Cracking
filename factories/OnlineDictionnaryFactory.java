package factories;

import crackers.DictionnaryCracker;
import crackers.PasswordCracker;
import targets.OnlineTarget;
import targets.Target;

public class OnlineDictionnaryFactory implements PasswordCrackerFactory {
    private String login;

    public OnlineDictionnaryFactory(String login){
        this.login = login;
    }

    public PasswordCracker createCracker(){
        return new DictionnaryCracker();
    }

    public Target createTarget(){
        return new OnlineTarget(login);
    }
    
}