/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 *
 * @author Admin
 */
public class MatriculaInvalida extends Exception {
    
    public MatriculaInvalida(){
    super("La matricula introducida no es valida");
    }
   
}
