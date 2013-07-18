
package concesionario;
import java.io.Serializable;
import javax.swing.ImageIcon;
/**
 * La clase vehiculo almacena la informacion comun a todos los vehiculos del concesioanrio
 * Es la clase base para todos los vehiculos
 * @author Admin
 */
public abstract class Vehiculo implements Serializable {
    //definimos los atributos
    protected String marca,modelo,color,fecha,observaciones;
    protected int numRegistro,kilometros,intervalo_revisiones;
    protected double precio;
    protected ImageIcon foto;

    /**
     * Constructor de la clase vehiculo
     * @param numRegistro numero de registro que ocupara el vehiculo
     * @param foto la ruta donde se encuentra la imagen del vehiculo
     * @param km los kilometros que tiene el vehiculo
     * @param intrev es el intervalo entre dos revisiones
     * @param pre es el precio del vehiculo
     * @param marca  marca del vehiculo
     * @param modelo del vehiculo
     * @param color de la carroceria
     * @param fecha la fecha en la que ha sido fabricado el vehiculo
     * @param observaciones
     */
    public Vehiculo(int numreg,ImageIcon foto,int km,int intrev,double pre,String marca,String modelo,String color,String fecha, String observaciones){
        this.numRegistro=numreg;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.observaciones=observaciones;
        this.kilometros=km;
        this.intervalo_revisiones=intrev;
        this.precio=pre;
        this.foto=foto;
        this.fecha=fecha;
    }
    
    
    /**
     * Genera los datos del vehiculo devolviendo un array con todos los datos del vehiculo
     * @return array con los datos del vehiculo
     */
    public String[] generardatosVehiculo(){  
    
     String r="tipo"+String.valueOf(numRegistro);
     String [] prueba = {(" Número de registro: "+String.valueOf(numRegistro)),(" Intervalo de revisiones: "+String.valueOf(intervalo_revisiones)),(" Precio: "+String.valueOf(precio)),(" Marca: "+marca),(" Modelo: "+modelo),(" Color: "+color),(" Fecha fabricación: "+fecha),(" Kilometros: "+kilometros)};
     return prueba;
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public int getIntervalo_revisiones() {
        return intervalo_revisiones;
    }

    public void setIntervalo_revisiones(int intervalo_revisiones) {
        this.intervalo_revisiones = intervalo_revisiones;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    /**
     * Metodo que genera un string con datos del vehiculo
     * @return String con datos del vehiculo
     */
    @Override
    public String toString(){
        
        return marca+" "+ modelo+ " "+String.valueOf(precio)+" €";
    }

    /*
     * Un vehiculo esta identificado por un numero de registro,
     * de esta manera podemos diferenciar un vehiculo de otro por
     * su "numRegistro"
     */
    
    @Override
    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof Vehiculo) {
        
            Vehiculo other = (Vehiculo) obj;
            if (this.numRegistro == other.numRegistro)
                return true;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.numRegistro;
        return hash;
    }
   
    
   
}
