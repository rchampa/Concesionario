/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 *
 * @author Admin
 */
public class UsuarioIncorrecto extends Exception {

    public UsuarioIncorrecto(){
        super("El usuario o la contraseña no son validos, vuelva a intentarlo");
    }
}
