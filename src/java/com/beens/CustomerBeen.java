/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beens;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Shawn
 */
@ManagedBean
@RequestScoped
public class CustomerBeen {

    /**
     * Creates a new instance of CustomerBeen
     */
    public CustomerBeen() {
    }
    
    private String firstname;
    private String middleName;
    private String lastName;
    private int birthDate;

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
