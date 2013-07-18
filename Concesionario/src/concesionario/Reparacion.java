    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;
import java.io.*;
/**
 * Clase que sirve para almacenar toda la informacion necesaria para una reparacion
 * @author Admin
 */
public class Reparacion implements Serializable {
    //atributos de la clase reparacion
    public String fecha,actuacion;
    public int kilometros;
    public double precio;
    
    /**
     * Constructor de la clase reparacion que inicializa todos los valores introducido por el usuario
     * @param fecha fecha en la que se produce la reparacion
     * @param kilometros kilometros en los que se hace la reparacion
     * @param actuacion reparacion que se va a realizar
     * @param precio precio de la reparacio
     */
    public Reparacion(String fecha,int kilometros,String actuacion, double precio){
        this.actuacion=actuacion;
        this.fecha=fecha;
        this.kilometros=kilometros;
        this.precio=precio;
    }
    /**
     * Metodo que devuelve la fecha de la reparacion
     * @return devuelve la fecha de la reparacion
     */
    public String getFecha(){
        return fecha;
    }
    /**
     * devuelve los kilometros en los que se ha producido la reparacion
     * @return String con el numero de kilometros
     */
    public String getKilometros(){
        Integer aux=new Integer(kilometros);
        return aux.toString();
                
    }
    /**
     * Metodo que devuelve la actuacion realizada en la reparacion
     * @return actuacion realizada
     */
    public String getActuacion(){
        return actuacion;
        
    }
    /**
     * Metodo que devuelve el precio de la reparacion
     * @return String con el precio de la reparacion
     */
    public String getPrecio(){
        Double aux= new Double(precio);
        return aux.toString();
    }
}
