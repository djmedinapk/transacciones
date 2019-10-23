/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import controller.TransaccionLocal;
import ejb.TareaFacadeLocal;
import ejb.UsuarioFacadeLocal;
import entities.Usuario;
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

    @EJB
    TareaFacadeLocal tarealocal;

    @EJB
    UsuarioFacadeLocal usuariolocal;

    /**
     * Creates a new instance of Index
     */
    public Index() {
    }

    public void boton11() {
        tarealocal.agregarRequired("Tarea1", 1);
    }

    public void boton12() {
        transaccionlocal.agregar2Required();
    }

    public void boton21() {
        transaccionlocal.agregarRequiredNew();
    }

    public void boton22() {
        transaccionlocal.agregar2RequiredNew();
    }

    public void boton31() {
        usuariolocal.agregarUsuarioSupports("raul", "mendez", "menraul@mail.com");
        tarealocal.agregarFail(null, 2);
    }

    public void boton32() {
        transaccionlocal.agregar2Supports();
    }

    public void boton41() {
        usuariolocal.agregarUsuarioMandatory("raul", "mendez", "menraul@mail.com");
    }

    public void boton42() {
        transaccionlocal.agregar2Mandatory();
    }

    public void boton51() {
        tarealocal.agregarFailNS(null, 2);
    }

    public void boton52() {
        transaccionlocal.agregar2NotSupported();
    }

    public void boton61() {
        usuariolocal.agregarUsuarioNever("raul", "mendez", "menraul@mail.com");
    }

    public void boton62() {
        transaccionlocal.agregar2Never();
    }

}
