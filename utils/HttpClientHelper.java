package utils;

import java.net.*;
import java.io.*;

public class HttpClientHelper {

    public static boolean sendLoginRequest(String login, String motDePasse){
        try{
            URL url = new URL("http://localhost/login.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            String postData = "login=" + login + "&motDePasse" + motDePasse;
        }
    }

     
}