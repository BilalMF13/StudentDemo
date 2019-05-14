/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int id;

    //constructor
    public StudentDemo(String givenName)
    {
        name=givenName;
    }

    public String getName() {
        return name;
    }

    
    public void setName(String givenName) {
        name = givenName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   
}
