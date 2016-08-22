
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthf
 */
@ManagedBean
@SessionScoped

public class User {
    private String name;
    private String password;
    private String message;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }
    
    public String login() {
        if(name.equals("Luthfi") && password.equals("localhost")) {
            message = "Username and Password is correct!";
        } else if(name.equals("") || password.equals("")) {
            message = "Please enter Username and Password.";
        } else {
            message = "Username or Password is incorrect!";
        }
        
        return message;
    }
}
