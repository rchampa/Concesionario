/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 * Excepcion para los casos en los que el dni no es valido
 * @author Admin
 */
public class DniInvalido extends Exception {
    /**
     * Constructor que genera una excepcion del tipo DniInvalido.
     */
    public DniInvalido(){
        super("el dni introducido no es valido");
    }

}
