package targets;

public class LocalTarget implements Target {

    private final String login; // Identifiant de la cible
    private final String motDePasseCorrect; // Mot de passe correct predefini

    public LocalTarget(String login, String motDePasseCorrect){
        this.login = login;
        this.motDePasseCorrect = motDePasseCorrect;
    }

    // Methode pour verifier si le mot de passe fourni est le bon
    public boolean attempt(String motDePasse){
        return motDePasse.equals(motDePasseCorrect);
    }
}