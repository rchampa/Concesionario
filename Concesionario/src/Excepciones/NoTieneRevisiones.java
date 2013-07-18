/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;


public class NoTieneRevisiones extends Exception {
     
    public NoTieneRevisiones(){
        super("El vehiculo no tiene revisiones.");
    }
}
