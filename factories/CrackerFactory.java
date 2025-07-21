package factories; 

public abstract class CrackerFactory {
    public static PasswordCrackerFactory getInstance(String type, String target, String login){
        if (type.equals("brute") && target.equals("local"))
            return new LocalBruteForceFactory(login);
        else if (type.equals("brute") && target.equals("online"))
            return new OnlineBruteForceFactory(login);
        else if (type.equals("dictionnary") && target.equals("local"))
            return new LocalDictionnaryFactory(login);
        else if (type.equals("dictionnary") && target.equals("online"))
            return new OnlineDictionnaryFactory(login);
        else {
            System.out.println("Type ou cible non reconnue");
            return null;
        }
    }
}
