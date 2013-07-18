/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Contiene toda la informacion referente a un vehiculo de la clase autobus
 * @author Admin
 */
public class Autobus extends Vehiculo {
    //definimos los atributos
    private int numPasajeros,numRuedas;
    private boolean videoDisponible;
      
    /**
     * Constructor de autobuses, que inicializan todos los valores introducidos por el usuario
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
     * @param numPasajeros
     * @param numRuedas
     * @param videoDisponible Indica si dispone o no de un video para entretener a los pasajeros
     */
    public Autobus(int numreg, ImageIcon foto,int km,int intrev,double prec,String marca,String modelo,String color,String fecha, String obs,int pasaje,int ruedas,boolean video){
        super(numreg,foto,km,intrev,prec,marca,modelo,color,fecha,obs);
        this.numPasajeros= pasaje;
        this.numRuedas=ruedas;
        this.videoDisponible= video;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isVideoDisponible() {
        return videoDisponible;
    }
    
   

}