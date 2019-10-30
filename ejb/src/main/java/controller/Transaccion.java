/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.TareaFacadeLocal;
import ejb.UsuarioFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author DJMEDINA
 */
@Stateless
public class Transaccion implements TransaccionLocal {

    @EJB
    TareaFacadeLocal tarealocal;

    @EJB
    UsuarioFacadeLocal usuariolocal;

    /**
     * Transaccion Required con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarRequired(String nombre, int duracion) {
        tarealocal.agregarRequired(nombre, duracion);
    }

    /**
     * Transaccion RequiredNew con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarRequiredNew(String nombre, int duracion) {
        tarealocal.agregarRequiredNew(nombre, duracion);
    }

    /**
     * Transaccion Supports con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarSupports(String nombre, int duracion) {
        tarealocal.agregarSupports(nombre, duracion);
    }

    /**
     * Transaccion Mandatory con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarMandatory(String nombre, int duracion) {
        tarealocal.agregarMandatory(nombre, duracion);
    }

    /**
     * Transaccion notSupported con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarNotSupported(String nombre, int duracion) {
        tarealocal.agregarNotSupported(nombre, duracion);
    }

    /**
     * Transaccion never con cliente no transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void agregarNever(String nombre, int duracion) {
        tarealocal.agregarNever(nombre, duracion);
    }

    /**
     * Transaccion Required con cliente transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2Required(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConRequired", "mendez", "menraul@mail.com");
        tarealocal.agregarRequired(nombre, duracion);
    }

    /**
     * Transaccion RequiredNew con cliente transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2RequiredNew(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConRequiredNew", "mendez", "menraul@mail.com");
        try {
            tarealocal.agregarRequiredNew(nombre, duracion);
        } catch (Exception e) {

            System.out.println("catch RequiredNew Con");
        }

    }

    /**
     * Transaccion Supports con cliente transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2Supports(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConSupports", "mendez", "menraul@mail.com");
        tarealocal.agregarSupports(nombre, duracion);
    }

    /**
     * Transaccion Mandatory con cliente transaccional
     *
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2Mandatory(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConMandatory", "mendez", "menraul@mail.com");
        tarealocal.agregarMandatory(nombre, duracion);
    }

    /**
     * Transaccion notSupported con cliente transaccional
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2NotSupported(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConNotSupported", "mendez", "menraul@mail.com");
        try {
            tarealocal.agregarNotSupported(nombre, duracion);
        } catch (Exception e) {

            System.out.println("catch Not Supported");
        }
    }

    /**
     * Transaccion never con cliente transaccional R - excepcion -r
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2Never(String nombre, int duracion) {
        usuariolocal.agregarUsuarioRequired("user1ConNever", "mendez", "menraul@mail.com");
        tarealocal.agregarNever(nombre, duracion);
    }
}
