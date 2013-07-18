/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;
import java.io.Serializable;


public class Revision implements Serializable {
    
    private String fecha;
    private int kilometros;
    private String actuacion;
    private double precio;

    public Revision(String fecha, int kilometros, String actuacion, double precio)  {
        this.fecha = fecha;
        this.kilometros = kilometros;
        this.actuacion = actuacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "La revision:" + "fecha=" + fecha + ", kilometros=" + kilometros + ", actuacion=" + actuacion + ", precio=" + precio + '}';
    }

    public String getActuacion() {
        return actuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public int getKilometros() {
        return kilometros;
    }

    public double getPrecio() {
        return precio;
    }
    
    

   
    
    
}
