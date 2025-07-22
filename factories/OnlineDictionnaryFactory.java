package factories;

import crackers.DictionnaryCracker;
import crackers.PasswordCracker;
import targets.OnlineTarget;
import targets.Target;

public class OnlineDictionnaryFactory implements PasswordCrackerFactory {
    private String login; // identifiant de la cible 

    public OnlineDictionnaryFactory(String login){
        this.login = login;
    }

    // Creation d'un cracker de type dictionnary
    public PasswordCracker createCracker(){
        return new DictionnaryCracker();
    }

    // creation d'une cible de type online
    public Target createTarget(){
        return new OnlineTarget(login);
    }
    
}