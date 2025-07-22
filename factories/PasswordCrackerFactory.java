package factories;

import crackers.PasswordCracker;
import targets.Target;

public interface PasswordCrackerFactory {

    // Methode utilise pour creer un PasswordCracker qui sera soit brute force soit dictionnary
    PasswordCracker createCracker();
    // Methode utilise pour creer un Target qui sera soit local soit online
    Target createTarget();
}