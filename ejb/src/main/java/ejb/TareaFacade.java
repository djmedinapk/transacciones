/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Tarea;
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
public class TareaFacade extends AbstractFacade<Tarea> implements TareaFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TareaFacade() {
        super(Tarea.class);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarRequired(String nombre, int duracion){
        Tarea tarea = new Tarea(nombre, duracion);
        em.persist(tarea);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void agregarRequiredNew(String nombre, int duracion){
        Tarea tarea = new Tarea(nombre, duracion);
        em.persist(tarea);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarFail(String nombre, int duracion){
        Tarea tarea = new Tarea(nombre, duracion);
        em.persist(tarea);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void agregarFailNS(String nombre, int duracion){
        Tarea tarea = new Tarea(nombre, duracion);
        em.persist(tarea);
    }
    
}
