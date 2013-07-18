/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Esta clase contiene toda la informacion necesaria de un camion
 * @author Admin
 */
public class Camion extends Vehiculo {

    //Atributos
    private int numRuedas;
    private double tara,cargaMaxima;
    
    
    //Métodos 
    /**
     * Constructor de la clase que genera un nuevo camion con la informacion de un camion
     * @param numreg
     * @param foto
     * @param km
     * @param intrev
     * @param prec
     * @param marca
     * @param modelo
     * @param color
     * @param fecha
     * @param obs
     * @param tara   expresada en kilogramos
     * @param carmax expresada en kilogramos
     * @param numRuedas
     */
    public Camion(int num, ImageIcon foto,int km,int intrev,double pre,String marca,String modelo,String color,String fecha, String obs,double tara,double carmax,int ruedas){
        super(num,foto,km,intrev,pre,marca,modelo,color,fecha,obs);
        this.tara=tara;
        this.cargaMaxima=carmax;
        this.numRuedas=ruedas;
    
}

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public double getTara() {
        return tara;
    }
    
 
}
    