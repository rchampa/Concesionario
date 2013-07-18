/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;

import Excepciones.UsuarioIncorrecto;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * Clase que contiene los usuarios y sus respectivas contraseñas de la aplicacion
 * y comprueba que la entrada al sistema sea la correcta
 * @author Admin
 */
public class GestorUsuarios implements Serializable {
    private static GestorUsuarios INSTANCE;
    private HashMap<String,Usuario> usuarios;
    
    /**
     * Constructor de la clase usuarios que inicializa todos los usuarios que van a usar el programa
     */
   private GestorUsuarios(){       
       //Se crea la base de datos y se añade al administrador por defecto
       ImageIcon icon=null;
       java.net.URL imgURL;
       imgURL = getClass().getResource("/imagenes/usuarios/bellamy.jpg");
       icon = new ImageIcon(imgURL, "descripcion"); 
       
       usuarios = new HashMap<String, Usuario>();
       
       usuarios.put("admin", new Administrador("admin", "admin", "matt", icon));
        
       
   }
   
   public static GestorUsuarios getInstance() {
        if (INSTANCE==null) 
            INSTANCE = new GestorUsuarios();
 
        return INSTANCE;
   }
   
   public Usuario obtenerUsuario(String codigo) throws UsuarioIncorrecto{
       
       if(!usuarios.containsKey(codigo))
                throw new UsuarioIncorrecto();
       
       return usuarios.get(codigo);
   }
   
   public void anadirUsuario(Usuario user) throws UsuarioIncorrecto{
        try{
            
            //Si el usuario ya esta registrado no se puede volver a anadir
            if(usuarios.containsKey(user.getCodigo()))
                throw new UsuarioIncorrecto();
            
            usuarios.put(user.getCodigo(), user);
            
        }catch(NullPointerException e){
            throw new UsuarioIncorrecto();
        }
   }
   
   public void elminarUsuario(Usuario user) throws UsuarioIncorrecto{
       
       try{
           
           //Si el usuario no esta registrado o si es el administrador no se puede eliminar
            if(!usuarios.containsKey(user.getCodigo()) || user.getCodigo().equals("admin"))
                throw new UsuarioIncorrecto();
            
            usuarios.remove(user.getCodigo());
                
        }catch(NullPointerException e){
            throw new UsuarioIncorrecto();
        }
   }
   
   public void cambiarContrasena(String codigo, String nuevaContrasena) throws UsuarioIncorrecto{
       try{
           
            Usuario user = usuarios.get(codigo);
            user.setContrasena(nuevaContrasena);
            
       }catch(NullPointerException e){
            throw new UsuarioIncorrecto();
       }
   }
   /**
    * Metodo que comprueba si el usuario y la contraseña son incorrectos en este
    * caso lanzara una Excepcion
    * @param contrasena : clave introducida por el usuario
    * @param codigo : codigo introducido por el usuario
    * @throws Excepciones.UsuarioIncorrecto
    */
   public boolean comprobarUsuario(String codigo, String contrasena) throws UsuarioIncorrecto{
       try{
       
            Usuario user = usuarios.get(codigo);

            if(user.getContrasena().equals(contrasena))
                return true;
            else 
                return false;
            
       }catch(NullPointerException e){
           throw new UsuarioIncorrecto();
       }
   }
   
   public Iterator<String> getIteradorClaves(){
       Set<String> it = usuarios.keySet();
       return it.iterator();
   }
   
   public void guardarGestorUsuarios() throws FileNotFoundException, IOException{
       
        FileOutputStream fosPro;
        fosPro = new FileOutputStream("datosUsuarios.dat");
        ObjectOutputStream oosPro;
        oosPro = new ObjectOutputStream(fosPro);
        oosPro.writeObject(this);
        oosPro.close();
        fosPro.close();
   }
   
   public void cargarGestorUsuarios() throws IOException, ClassNotFoundException{
        
        // Se crea un ObjectInputStream
            FileInputStream fis;
            try {
                fis = new FileInputStream("datosUsuarios.dat");

                if(fis!=null){
                    ObjectInputStream lectura = new ObjectInputStream(fis);

                    Object aux = null;

                    aux = lectura.readObject();
                    if(aux!=null){
                        GestorUsuarios gestorAux = (GestorUsuarios)aux;
                        this.INSTANCE = gestorAux.INSTANCE;
                        this.usuarios = gestorAux.usuarios;  
                    }


                    lectura.close();
                    fis.close();
                }

            } catch (FileNotFoundException ex) {
                System.out.println("El fichero fuente no existe.");
            }
        
    }
}
