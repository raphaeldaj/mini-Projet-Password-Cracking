package targets;

public class LocalTarget implements Target {

    private final String login;
    private final String motDePasseCorrect;

    public LocalTarget(String login, String motDePasseCorrect){
        this.login = login;
        this.motDePasseCorrect = motDePasseCorrect;
    }

    public boolean attempt(String motDePasse){
        return motDePasse.equals(motDePasseCorrect);
    }
}