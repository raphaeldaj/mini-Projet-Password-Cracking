package targets;

import utils.HttpClientHelper;

public class OnlineTarget implements Target {

    private final String login;

    public OnlineTarget(String login){
        this.login = login;
    }

    public boolean attempt(String motDePasse){
        return HttpClientHelper.sendLoginRequest(login,motDePasse);
    }  
}