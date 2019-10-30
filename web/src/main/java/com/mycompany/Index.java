/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import controller.TransaccionLocal;
import ejb.TareaFacadeLocal;
import ejb.UsuarioFacadeLocal;
import entities.Tarea;
import entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    private TransaccionLocal transaccionlocal;

    @EJB
    private TareaFacadeLocal tarealocal;

    @EJB
    private UsuarioFacadeLocal usuariolocal;

    private List<Tarea> tareas = new ArrayList<Tarea>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    /**
     * Creates a new instance of Index
     */
    public Index() {
    }

    public void boton11() {
        getTransaccionlocal().agregarRequired("t1Required", 1);
    }
    public void boton11f() {
        getTransaccionlocal().agregarRequired(null, 1);
    }
    
    public void boton12() {
        getTransaccionlocal().agregarRequiredNew("t1RequiredNew", 1);
    }
    public void boton12f() {
        getTransaccionlocal().agregarRequiredNew(null, 1);
    }
    
    public void boton13() {
        getTransaccionlocal().agregarSupports("t1Supports", 1);
    }
    public void boton13f() {
        getTransaccionlocal().agregarSupports(null, 1);
    }
    
    public void boton14() {
        getTransaccionlocal().agregarMandatory("t1Mandatory", 1);
    }
    public void boton14f() {
        getTransaccionlocal().agregarMandatory(null, 1);
    }
    
    
    public void boton15() {
        getTransaccionlocal().agregarNotSupported("t1NotSupportes", 1);
    }
    public void boton15f() {
        getTransaccionlocal().agregarNotSupported(null, 1);
    }
    
    
    public void boton16() {
        getTransaccionlocal().agregarNever("t1Never", 1);
    }
    public void boton16f() {
        getTransaccionlocal().agregarNever(null, 1);
    }
    
    
    
    
    
    public void boton21() {
        getTransaccionlocal().agregar2Required("t2Required", 1);
    }
    public void boton21f() {
        getTransaccionlocal().agregar2Required(null, 1);
    }
    
    public void boton22() {
        getTransaccionlocal().agregar2RequiredNew("t2RequiredNew", 1);
    }
    public void boton22f() {
        getTransaccionlocal().agregar2RequiredNew(null, 1);
    }
    
    public void boton23() {
        getTransaccionlocal().agregar2Supports("t2Supports", 1);
    }
    public void boton23f() {
        getTransaccionlocal().agregar2Supports(null, 1);
    }
    
    public void boton24() {
        getTransaccionlocal().agregar2Mandatory("t2Mandatory", 1);
    }
    public void boton24f() {
        getTransaccionlocal().agregar2Mandatory(null, 1);
    }
    
    
    public void boton25() {
        getTransaccionlocal().agregar2NotSupported("t2NotSupportes", 1);
    }
    public void boton25f() {
        getTransaccionlocal().agregar2NotSupported(null, 1);
    }
    
    
    public void boton26() {
        getTransaccionlocal().agregar2Never("t2Never", 1);
    }
    public void boton26f() {
        getTransaccionlocal().agregar2Never(null, 1);
    }
    
    
    @PostConstruct
    public void cargarDatos(){
    }
    
    public void clearData(){
        for (Tarea tarea : tareas) {
            tarealocal.remove(tarea);
        }
        for (Usuario user : usuarios) {
            usuariolocal.remove(user);
        }
    }

    /**
     * @return the transaccionlocal
     */
    public TransaccionLocal getTransaccionlocal() {
        return transaccionlocal;
    }

    /**
     * @param transaccionlocal the transaccionlocal to set
     */
    public void setTransaccionlocal(TransaccionLocal transaccionlocal) {
        this.transaccionlocal = transaccionlocal;
    }

    /**
     * @return the tarealocal
     */
    public TareaFacadeLocal getTarealocal() {
        return tarealocal;
    }

    /**
     * @param tarealocal the tarealocal to set
     */
    public void setTarealocal(TareaFacadeLocal tarealocal) {
        this.tarealocal = tarealocal;
    }

    /**
     * @return the usuariolocal
     */
    public UsuarioFacadeLocal getUsuariolocal() {
        return usuariolocal;
    }

    /**
     * @param usuariolocal the usuariolocal to set
     */
    public void setUsuariolocal(UsuarioFacadeLocal usuariolocal) {
        this.usuariolocal = usuariolocal;
    }

    /**
     * @return the tareas
     */
    public List<Tarea> getTareas() {
        setTareas(tarealocal.findAll());
        return tareas;
    }

    /**
     * @param tareas the tareas to set
     */
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        setUsuarios(usuariolocal.findAll());
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
