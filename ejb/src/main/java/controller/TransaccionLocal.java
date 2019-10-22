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
    
   public void agregarRequiredNew();
   
   public void agregar2Required();
   
   public void agregar2RequiredNew();
   
   
}
