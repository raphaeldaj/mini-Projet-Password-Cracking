package factories;

import crackers.PasswordCracker;
import targets.Target;

public interface PasswordCrackerFactory {

    PasswordCracker createCracker();
    Target createTarget();
}