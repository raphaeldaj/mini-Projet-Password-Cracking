package factories;

import crackers.DictionnaryCracker;
import crackers.PasswordCracker;
import targets.LocalTarget;
import targets.Target;

public class LocalDictionnaryFactory implements PasswordCrackerFactory{

    private String login; // identifiant de la cible

    public LocalDictionnaryFactory(String login){
        this.login = login;
    }

    // cretion d'un cracker de type Dictionnary
    public PasswordCracker createCracker(){
        return new DictionnaryCracker();
    }

    // Creation d'un Target local avec un mot de passe predefini
    public Target createTarget(){
        return new LocalTarget(login, "passer1234");
    }
}