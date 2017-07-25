/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Yuan-Hsiang
 */
@ManagedBean
@RequestScoped
public class customerController {

    /**
     * Creates a new instance of customerController
     */
    public customerController() {
    }
    
    public String saveCustomer(){
    
     return "confirmation";
    }
}
