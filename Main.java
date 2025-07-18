import factories.*;
import crackers.PasswordCracker;
import targets.Target;

public class Main {
    public static void main(String[] args){
        if (args.length < 6) {
            System.out.println("Veuillez verifier vos arguments le type puis la cible puis le mot de passe");
            System.out.println("java Main --type brute|dictionnary --target local|online --login login");
            return;
        }

        String type = args[1];
        String target = args[3];
        String login = args[5];

        CrackerFactory factory = null;

        if (type.equals("brute") && target.equals("local"))
            factory = new LocalBruteForceFactory(login);
        else if (type.equals("brute") && target.equals("online"))
            factory = new OnlineBruteForceFactory(login);
        else if (type.equals("dictionnary") && target.equals("local"))
            factory = new LocalDictionnaryFactory(login);
        else if (type.equals("dictionnary") && target.equals("online"))
            factory = new OnlineDictionnaryFactory(login);
        else {
            System.out.println("Type ou cible non reconnue");
            return;
        }

        PasswordCracker cracker = factory.createCracker();
        Target cible = factory.createTarget();
        cracker.crack(cible);
    }
}
