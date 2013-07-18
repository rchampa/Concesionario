/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;

import java.awt.Image;
import javax.swing.ImageIcon;



public class Furgoneta extends Vehiculo {
    //definimos los atributos
    private double volumenCarga,longitudCarga;
    /**
     * 
     * @param numreg
     * @param foto
     * @param km
     * @param intrev
     * @param pre
     * @param marca
     * @param modelo
     * @param color
     * @param fecha
     * @param obs
     * @param volumenCarga
     * @param longitudCarga
     */
    public Furgoneta(int numreg, ImageIcon foto,int km,int intrev,double pre,String marca,String modelo,String color,String fecha, String obs,double volcarga,double loncarga){
        super(numreg,foto,km,intrev,pre,marca,modelo,color,fecha,obs);
        volumenCarga=volcarga;
        longitudCarga=loncarga;
    
    }

    public double getLongitudCarga() {
        return longitudCarga;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }
    
    

}
