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

        PasswordCrackerFactory factory = CrackerFactory.getInstance(type, target, login);
        if(factory == null){
            System.err.println("Erreur lors de la creation de la factory.");
            System.exit(-1);
        }
        

        PasswordCracker cracker = factory.createCracker();
        Target cible = factory.createTarget();
        cracker.crack(cible);
    }
}
