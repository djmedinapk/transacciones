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

    public void agregarRequired();

    public void agregar2Required();

    public void agregarRequiredNew();

    public void agregar2RequiredNew();

    public void agregar2Supports();

    public void agregarSupports();

    public void agregarMandatory();

    public void agregar2Mandatory();

    public void agregarNotSupported();

    public void agregar2NotSupported();

    public void agregarNever();

    public void agregar2Never();

}
