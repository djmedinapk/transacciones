/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Tarea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DJMEDINA
 */
@Local
public interface TareaFacadeLocal {

    void create(Tarea tarea);

    void edit(Tarea tarea);

    void remove(Tarea tarea);

    Tarea find(Object id);

    List<Tarea> findAll();

    List<Tarea> findRange(int[] range);

    int count();

    public void agregarRequired(String nombre, int duracion);

    public void agregarRequiredNew(String nombre, int duracion);

    public void agregarSupports(String nombre, int duracion);

    public void agregarNotSupported(String nombre, int duracion);

    public void agregarMandatory(String nombre, int duracion);

    public void agregarNever(String nombre, int duracion);

    public void agregarFail(String nombre, int duracion);

    public void agregarFailNS(String nombre, int duracion);

}
