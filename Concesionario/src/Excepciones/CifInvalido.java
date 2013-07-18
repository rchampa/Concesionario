/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 * Esta clase se encarga de establecer un tipo de excepcion para los cif invalidos
 * @author Admin
 */
public class CifInvalido extends Exception {
/**
 * Constructor de la clase cifInvalido, simplemente genera una excepcion 
 */
    public CifInvalido(){
    super("El Cif Introducido no es valido");
    }
}
