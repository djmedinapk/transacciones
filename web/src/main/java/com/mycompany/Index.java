/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import controller.TransaccionLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author DJMEDINA
 */
@Named(value = "index")
@RequestScoped
public class Index {

    @EJB
    TransaccionLocal transaccionlocal;
    /**
     * Creates a new instance of Index
     */
    public Index() {
    }
    
    public void boton11(){
        transaccionlocal.agregarRequired();
    }
    
    public void boton12(){
        transaccionlocal.agregarRequiredNew();
    }
    
    public void boton21(){
        transaccionlocal.agregar2Required();
    }
    public void boton22(){
        transaccionlocal.agregar2RequiredNew();
    }
    
}
