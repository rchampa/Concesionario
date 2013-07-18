/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 *
 * @author Admin
 */
public class NoFoto extends Exception{
    public NoFoto(){
        super("Debe seleccionar una fotografia");
    }
}
