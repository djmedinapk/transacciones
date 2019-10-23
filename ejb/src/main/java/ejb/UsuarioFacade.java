/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Usuario;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DJMEDINA
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarUsuarioRequired(String nombre, String apellido, String correo) {
        Usuario user = new Usuario(nombre, apellido, correo);
        em.persist(user);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void agregarUsuarioRequiredNew(String nombre, String apellido, String correo) {
        Usuario user = new Usuario(nombre, apellido, correo);
        em.persist(user);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void agregarUsuarioSupports(String nombre, String apellido, String correo) {
        Usuario user = new Usuario(nombre, apellido, correo);
        em.persist(user);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void agregarUsuarioMandatory(String nombre, String apellido, String correo) {
        Usuario user = new Usuario(nombre, apellido, correo);
        em.persist(user);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void agregarUsuarionotSupported(String nombre, String apellido, String correo) {
        Usuario user = new Usuario(nombre, apellido, correo);
        em.persist(user);
    }
    
    /**
     *  solo define el estado de transacción requerido que debe existir
     * cuando se invoca el método anotado (en este caso, una transacción
     * no debe existir).
     * @param nombre
     * @param apellido
     * @param correo 
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    
    public void agregarUsuarioNever(String nombre, String apellido, String correo) {
        int a = 0;
        int b = 5;
        int c = a+b;
    }
    
}
