package crackers;

import targets.Target;

public interface PasswordCracker {

    // Interface definissant la methode crack pour lancer une attaque
    void crack(Target target);
    
}