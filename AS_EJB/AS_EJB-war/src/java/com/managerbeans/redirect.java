/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Ngocd
 */
@Named(value = "redirec")
@RequestScoped
public class redirect {

    /**
     * Creates a new instance of redirec
     */
    public redirect() {
    }
    public String goHome(){
    return "index";
    }
    public String goCart(){
    return "cart";
    }
    public String goAbout(){
    return "about";
    }
    public String goContact(){
    return "contact";
    }
     public String goOrder(){
    return "order";
    }
     public String goUser(){
    return "customer";
    }
     public String goLogin(){
    return "login";
    } 
     public String goSearch(){
    return "search";
    }
     public String gohHome(){
     return "../index";
     }
     
    
}
