package factories;

import crackers.DictionnaryCracker;
import crackers.PasswordCracker;
import targets.LocalTarget;
import targets.Target;

public class LocalDictionnaryFactory implements PasswordCrackerFactory{

    private String login;

    public LocalDictionnaryFactory(String login){
        this.login = login;
    }

    public PasswordCracker createCracker(){
        return new DictionnaryCracker();
    }

    public Target createTarget(){
        return new LocalTarget(login, "passer1234");
    }
}