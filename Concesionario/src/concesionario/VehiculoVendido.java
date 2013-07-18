/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.Serializable;


public class VehiculoVendido implements Serializable{
    
    private Vehiculo vehiculo;
    private String matricula;
    private DniCif dnicif;
    private String fecha;
    
    
    public VehiculoVendido(Vehiculo vehiculo, String matricula, DniCif dnicif, String fecha){
        
        this.vehiculo = vehiculo;
        this.matricula = matricula;
        this.dnicif = dnicif;
        this.fecha = fecha;
        
    }
    
    public void actualizarKM(int nuevoKM){
        vehiculo.setKilometros(nuevoKM);
    }

    public DniCif getDnicif() {
        return dnicif;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj!=null && obj instanceof VehiculoVendido){
            final VehiculoVendido other = (VehiculoVendido) obj;
            if(this.matricula!=null && this.matricula.equals(other.matricula))
                return true;
        }
        
        return false;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.matricula != null ? this.matricula.hashCode() : 0);
        return hash;
    }
    
    
}
