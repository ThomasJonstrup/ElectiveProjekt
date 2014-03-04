/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Thomas
 */
public class Person implements Serializable{
    
    private String fName;
    private String lName;
    private int cpr;
    private String email;
    private String password;
    
    public Person(String fName, String lName, int cpr, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.cpr = cpr;
        this.email = email;
        this.password = password;
    }
    
    
    
}
