/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DJMEDINA
 */
@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
    public void agregarUsuarioRequired(String nombre, String apellido, String correo);
    public void agregarUsuarioRequiredNew(String nombre, String apellido, String correo);
    public void agregarUsuarioSupports(String nombre, String apellido, String correo);
    public void agregarUsuarioMandatory(String nombre, String apellido, String correo);
    public void agregarUsuarionotSupported(String nombre, String apellido, String correo);
    public void agregarUsuarioNever(String nombre, String apellido, String correo);
    
}
