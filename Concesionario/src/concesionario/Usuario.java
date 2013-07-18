/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.Serializable;
import javax.swing.ImageIcon;



public abstract class Usuario implements Serializable{
    
    protected String codigo;
    protected String contrasena;
    protected String nombre;
    protected ImageIcon foto;
    
    
    public Usuario(String codigo, String contrasena){
        this.codigo=codigo;
        this.contrasena=contrasena;
    }
    
    public Usuario(String codigo, String contrasena, String nombre, ImageIcon foto) {
        this.codigo = codigo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof Usuario){
            Usuario other = (Usuario) obj;
            if(this.codigo!=null && this.contrasena!=null && this.codigo.equals(other.codigo) && this.contrasena.equals(other.contrasena))
                return true;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.codigo != null ? this.codigo.hashCode() : 0);
        hash = 79 * hash + (this.contrasena != null ? this.contrasena.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Codigo: "+ this.codigo + " Nombre: " + nombre;
    }
    
    
}
