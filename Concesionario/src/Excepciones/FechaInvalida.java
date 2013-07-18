/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 * Excepcion para los casos en los que la fecha no es valida
 * @author Admin
 */
public class FechaInvalida extends Exception {
    /**
     * Constructor de la excepcion fecha invalida
     */
    public FechaInvalida(){
        super("fecha indroducida no valida");
    }
}
