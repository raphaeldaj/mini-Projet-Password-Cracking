package factories;

import crackers.PasswordCracker;
import targets.Target;

public interface CrackerFactory {

    PasswordCracker createCracker();
    Target createTarget();
}