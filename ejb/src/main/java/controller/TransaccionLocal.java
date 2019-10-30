/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Local;

/**
 *
 * @author DJMEDINA
 */
@Local
public interface TransaccionLocal {

    public void agregarRequired(String nombre, int duracion);

    public void agregarRequiredNew(String nombre, int duracion);

    public void agregarSupports(String nombre, int duracion);

    public void agregarMandatory(String nombre, int duracion);

    public void agregarNotSupported(String nombre, int duracion);

    public void agregarNever(String nombre, int duracion);

    public void agregar2Required(String nombre, int duracion);

    public void agregar2RequiredNew(String nombre, int duracion);

    public void agregar2Supports(String nombre, int duracion);

    public void agregar2Mandatory(String nombre, int duracion);

    public void agregar2NotSupported(String nombre, int duracion);

    public void agregar2Never(String nombre, int duracion);

}
