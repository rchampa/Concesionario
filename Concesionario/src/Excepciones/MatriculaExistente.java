/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 *
 * @author Admin
 */
public class MatriculaExistente extends Exception {
    public MatriculaExistente(){
        super("la matricula indroduccida ya existe");
    }
}
