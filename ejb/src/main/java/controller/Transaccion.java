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
         * R - Agregar Tarea normal -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequired(){
            tarealocal.agregarRequired("Tarea1", 1);
        }
        
        /**
         * Transaccion Required con cliente transaccional
         * R - No agrega Usuario  F- tarea  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Required(){
            usuariolocal.agregarUsuarioRequired("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion RequiredNew con cliente no transaccional
         * R - Agregar Tarea normal -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequiredNew(){
            tarealocal.agregarRequired("Tarea2", 2);
        }
        
        /**
         * Transaccion RequiredNew con cliente transaccional
         * R - Agregar Usuario normal  F- agregar tarea  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2RequiredNew(){
            usuariolocal.agregarUsuarioRequiredNew("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion Supports con cliente transaccional
         * R - no agregar usuario F- agegar tarea -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Supports(){
            usuariolocal.agregarUsuarioSupports("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion Supports con cliente no transaccional
         * R - Agregar Usuario normal F- tarea   -f no agrego ninguno   
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarSupports(){
            usuariolocal.agregarUsuarioSupports("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        
        
        /**
         * Transaccion Mandatory con cliente no transaccional
         * R - excepcion  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarMandatory(){
            usuariolocal.agregarUsuarioMandatory("raul", "mendez", "menraul@mail.com");
        }
        
        /**
         * Transaccion Mandatory con cliente transaccional
         * R - No Agregar Usuario normal F- tarea -r
         * 
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Mandatory(){
            usuariolocal.agregarUsuarioMandatory("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        
        /**
         * Transaccion notSupported con cliente no transaccional
         * F- tarea -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarNotSupported(){
            tarealocal.agregarFailNS(null, 2);
        }
        
        /**
         * Transaccion notSupported con cliente transaccional
         * R - Agregar Usuario normal F- tarea -f no agrego usuario
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2NotSupported(){
            usuariolocal.agregarUsuarioRequired("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFailNS(null, 2);
        }
        
        /**
         * Transaccion never con cliente no transaccional
         * R - Agregar Usuario normal -f no agrego usuario -f
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public void agregarNever(){
            usuariolocal.agregarUsuarioNever("raul", "mendez", "menraul@mail.com");
        }
        
        /**
         * Transaccion never con cliente transaccional
         * R - excepcion -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Never(){
            usuariolocal.agregarUsuarioNever("raul", "mendez", "menraul@mail.com");
        }
        
        
        
    
    
}
