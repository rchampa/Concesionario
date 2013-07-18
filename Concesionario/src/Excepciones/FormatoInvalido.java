/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Paquete que contiene las excepciones
 */
package Excepciones;

/**
 * Excepcion para los casos en los que el formato de la fecha no es valido
 * @author Admin
 */
public class FormatoInvalido extends Exception {
    /**
     * Constructor de la excepcion FormatoInvalido
     */
    public FormatoInvalido(){
        super("El formato de la fecha no es valido tiene que ser aa/bb/cccc");
    }
}
