package rest.todo.model;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Admin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static String hashPassword(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return DatatypeConverter.printHexBinary(md.digest()).toUpperCase();
        }
        catch (NoSuchAlgorithmException exception) {
            throw new RuntimeException("Erreur lors du hash du mot de passe");
        }
    }


}
