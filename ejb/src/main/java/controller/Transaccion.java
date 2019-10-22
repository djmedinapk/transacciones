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
    
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequired(){
            tarealocal.agregarRequired("Tarea1", 1);
        }
        
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequiredNew(){
            tarealocal.agregarRequired("Tarea2", 2);
        }
        
        
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Required(){
            usuariolocal.agregarUsuarioRequired("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2RequiredNew(){
            usuariolocal.agregarUsuarioRequiredNew("raul", "mendez", "menraul@mail.com");
            tarealocal.agregarFail(null, 2);
        }
        
    
    
}
