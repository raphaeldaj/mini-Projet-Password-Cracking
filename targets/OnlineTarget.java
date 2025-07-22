package targets;

import utils.HttpClientHelper;

public class OnlineTarget implements Target {

    private final String login; // il s'agit la de l'identifiant de la cible

    public OnlineTarget(String login){
        this.login = login;
    }

    // Methode pour tenter une connexion avec un mot de passe donne
    public boolean attempt(String motDePasse){
        // on utilise HttpClientHelper pour envoyer une requete de connexion
        return HttpClientHelper.sendLoginRequest(login,motDePasse);
    }  
}