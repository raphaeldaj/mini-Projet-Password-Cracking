package utils;

import java.net.*;
import java.io.*;

public class HttpClientHelper {

    // Methode qui se charge de l'envoie d'une requete de connexion a un server
    public static boolean sendLoginRequest(String login, String motDePasse){
        try{

            // D'abord on configure la connexion http
            URL url = new URL("http://localhost/login.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            // Ensuite on prepare les donnees a envoyer par la methode POST
            String postData = "login=" + login + "&motDePasse=" + motDePasse;

            // Envoie des donnees
            try(OutputStream os = conn.getOutputStream()){
                os.write(postData.getBytes());
            }

            // on tente de lire la reponse 
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String reponse = in.readLine();

            // Verification et Retour de la Reponse
            return reponse.contains("Connexion réussie");

        }catch(IOException exception){
            return false;
        }
    }

}