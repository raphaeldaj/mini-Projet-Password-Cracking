import factories.*;
import crackers.PasswordCracker;
import targets.Target;

public class Main {
    public static void main(String[] args){
        //On procede a la verification des arguments passe en ligne de commande 
        if (args.length < 6) {
            System.out.println("Veuillez verifier vos arguments le type puis la cible puis le mot de passe");
            System.out.println("java Main --type brute|dictionnary --target local|online --login login");
            return;
        }

        // On procede a l'extraction des argument 
        // on recupere les argument 1, 3 et 5 qui represente respectivement le type le target et le login compte
        // tenu de la forme de la commande a taper
        String type = args[1];   // type (brute ou dictionnary)
        String target = args[3]; // target (local ou online)
        String login = args[5];  // l'identifiant du target

        // creation de la Factory approprie en fonction des arguments
        PasswordCrackerFactory factory = CrackerFactory.getInstance(type, target, login);
        if(factory == null){
            System.err.println("Erreur lors de la creation de la factory.");
            System.exit(-1);
        }
        

        // creation des objet cracker et cible a partir de la factory creee
        PasswordCracker cracker = factory.createCracker();
        Target cible = factory.createTarget();
        cracker.crack(cible); // lancement de l'attaque
    }
}
