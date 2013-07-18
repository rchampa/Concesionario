/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;

import Excepciones.LecturaTerminada;
import Excepciones.MatriculaExistente;
import Excepciones.NoTieneRevisiones;
import java.util.*;
import java.io.*;

/**
 * Esta clase contiene las estructura de datos, necesarias para gestionar el concesionario
 */
public class Concesionario implements Serializable {
    /*El atributo muneroregistro indica el numero de registro que se le asignara
     * al coche siguiente */
    private static Concesionario INSTANCE;
    private static int numeroregistro;
    private HashMap<Integer, Vehiculo> vehiculos_exposicion;
    private HashMap<String, VehiculoVendido> vehiculos_vendidos;
    private HashMap<String, ArrayList<Revision>> revisiones;
    
    
    private Concesionario() {
        numeroregistro=0;
        vehiculos_exposicion = new HashMap<Integer, Vehiculo>();
        vehiculos_vendidos = new HashMap<String, VehiculoVendido>();
        revisiones = new HashMap<String, ArrayList<Revision>>();

    }
    
    public static Concesionario getInstance() {
        if (INSTANCE==null) 
            INSTANCE = new Concesionario();
 
        return INSTANCE;
   }
    
    
    /**
    * Metodo que devuelve el numero de registro que se le va a signar al proximo vehiculo
    * @return un entero con el numero de registro
    */
    public static int getNuevoNumeroRegistro(){
        return numeroregistro;
    }
    
    /**
    * Añade un vehiculo al concesionario
    * @param vehiculo vehiculo que se va a añadir al concesionario
    */
    public void anadirVehiculoExposicion(Vehiculo vehiculo) throws MatriculaExistente{
        
        //Si el vehiculo ya esta en la exposicion se lanza la excepcion
        if(vehiculos_exposicion.containsKey(vehiculo))
            throw new MatriculaExistente();
            
        vehiculos_exposicion.put(numeroregistro, vehiculo);  
        numeroregistro++;
    }
    

    /*
    * Funcion que hace una venta de un vehiculo
    * @param numreg introduce el numero de registro que se le asigna al vehiculo
    * @param dnicif  es el dni o el cif del propietario del vehiculo
    * @param matricula matricula del vehiculo vendido
    */
    public void ventaVehiculo(DniCif dnicif, String matricula, Vehiculo vehiculo) throws MatriculaExistente{
        
        //si el vehiculo no esta en la exposicion o si ya esta vendido, se lanza la excepcion
        if(vehiculo==null || !vehiculos_exposicion.containsKey(vehiculo.getNumRegistro()) ||
           vehiculos_vendidos.containsKey(matricula))
            throw new MatriculaExistente();
        
        vehiculos_exposicion.remove(vehiculo.getNumRegistro()); //Se elimina de la exposicion
        VehiculoVendido vendido=new VehiculoVendido(vehiculo,matricula,dnicif,Utilidades.getFechaHoy());
        vehiculos_vendidos.put(matricula,vendido);
    }
    
    
    
    
    /**
    * Funcion que genera una nueva reparacion en un vehiculo
    * @param matricula del vehiculo a reparar
    * @param fecha : fecha en la que se a producido la reparacion
    * @param kilometro : numero de kilometros que tiene el coche en el momento de la reparacion 
    * @param actuacion : la repacion que ha sido ralizada
    * @param precio : precio de la reparacion
    */
    public void revisionDeMantenimiento(String matricula, String fecha,int kilometros,String actuacion, double precio){
        
        Revision revision = new Revision(fecha, kilometros, actuacion, precio);
        ArrayList<Revision> historialRevisiones = revisiones.get(matricula);
        
        if(historialRevisiones==null){
            historialRevisiones = new ArrayList<Revision>();
            historialRevisiones.add(revision);
            revisiones.put(matricula, historialRevisiones);
        }
        else{
            historialRevisiones.add(revision);
        } 
        
        //Se actualiza los kilometros del coche
        VehiculoVendido v = vehiculos_vendidos.get(matricula);
        v.actualizarKM(kilometros);
    }

    /**
    * Funcion que devuelve el historial de un vehiculo reparado
    * @param matricula : matricula del vehiculo del que se desea ver el historial
    * @return se devuelve un arrayList de objetos, con todas las reparaciones que a tenido el vehiculo
    */

    public ArrayList<Revision> getHistorialAL(String matricula) throws NoTieneRevisiones{
        
        if(!revisiones.containsKey(matricula))
            throw new NoTieneRevisiones();
        
        return revisiones.get(matricula);
        
    }
    
    
     public void imprimirHistorial(VehiculoVendido vendido) throws IOException{
        
         String ruta = vendido.getMatricula()+".txt";
         File fichero = new File(ruta);

        if(fichero!=null)//se guarda
        {														
                try{
                        PrintWriter w = new PrintWriter(new FileOutputStream(fichero, true));
                        w.println('\n');
                        w.close();
                }
                catch(FileNotFoundException error){
                        error.printStackTrace();
                }													
        }
         
         /*
         
        PrintWriter factura = new PrintWriter(new BufferedWriter(new FileWriter(vendido.get_matricula()+"_factura.txt")));

        factura.println("----------------------------- Factura Reparacion ----------------------------");
        factura.println("");
        factura.println("");
        factura.println("D/Dña "+vendido.get_propietario().get_propietario()+" con DNI/CIF "+vendido.get_propietario().get_dni_cif().toString()+" ha efectuado la reparación del vehiculo:");
        factura.println("");
        factura.println("Datos del Vehiculo:");
        factura.println("");
        factura.println("Referencia: "+vendido.get_vehiculo_vendido().get_registro());
        factura.println("Marca: "+vendido.get_vehiculo_vendido().get_marca());
        factura.println("Modelo: "+vendido.get_vehiculo_vendido().get_modelo());
        factura.println("Color: "+vendido.get_vehiculo_vendido().get_color());
        factura.println("Matricula: "+vendido.get_matricula());
        factura.println("Fecha de Fabricacion: "+vendido.get_vehiculo_vendido().get_fecha());
        factura.println("Kilometros: "+vendido.get_vehiculo_vendido().get_kilometros());
        factura.println("Revisiones: "+vendido.get_vehiculo_vendido().get_revisiones());
        factura.println("Precio: "+vendido.get_vehiculo_vendido().get_precio());
        factura.println("Observaciones: "+vendido.get_vehiculo_vendido().get_observaciones());
        factura.println("");
        factura.println("Datos De la Reparacion:");
        factura.println("");
        factura.println("Actuacion: "+reparacion.get_actuacion());
        factura.println("Kilometros: "+reparacion.get_kilometros());
        factura.println("Fecha de Reparacion: "+reparacion.get_fecha_reparacion());
        factura.println("");
        factura.println("");
        factura.println("TOTAL A PAGAR: "+reparacion.get_precio()+" euros (IVA incluido)");
        factura.println("");
        factura.println("");
        factura.println("");
        factura.println("");
        factura.println("-------------------------- Concesionario Bolonio S.A -------------------------");
        factura.close();
        */
       
    }
     
     
     /**
    * Funcion que devuelve todos los numeros registrados del concesionario
    * @return un iterador con dichos numeros de registro.
    */
    public Iterator<Integer> getNumRegistrosExposicion(){

        Set<Integer> it = vehiculos_exposicion.keySet();
        return it.iterator();
    }
    
    public Vehiculo getVehiculoExposicion(int numRegistro){
        
        if(!vehiculos_exposicion.containsKey(numRegistro))
            ;//Throw algo...
        
        return vehiculos_exposicion.get(numRegistro);
        
    }
    
    public VehiculoVendido getVehiculoVendido(String matricula){
        
        if(!vehiculos_vendidos.containsKey(matricula))
            ;//Throw algo...
        
        return vehiculos_vendidos.get(matricula);
        
    }
    
    public boolean comprobarVenta(String matricula){

        return vehiculos_vendidos.containsKey(matricula);

    }
    
    
    
    public void guardarConcesionario() throws FileNotFoundException, IOException{
          
        
        FileOutputStream fosPro;

        fosPro = new FileOutputStream("datosConcesionario.dat");
        ObjectOutputStream oosPro;
        oosPro = new ObjectOutputStream(fosPro);
        oosPro.writeObject(INSTANCE);
        oosPro.close();
        fosPro.close();
            
        
        
    }
    
    public void cargarConcesionario() throws IOException, ClassNotFoundException{
        
       
            FileInputStream fis;
            try {
                fis = new FileInputStream("datosConcesionario.dat");
                if(fis!=null){
                    ObjectInputStream lectura = new ObjectInputStream(fis);

                    Object aux = null;

                    aux = lectura.readObject();
                    if(aux!=null){
                        Concesionario concesionarioAux = (Concesionario)aux;
                        this.INSTANCE = concesionarioAux.INSTANCE;
                        this.vehiculos_exposicion = concesionarioAux.vehiculos_exposicion;
                        this.vehiculos_vendidos = concesionarioAux.vehiculos_vendidos;
                        this.revisiones = concesionarioAux.revisiones;
                        this.numeroregistro = vehiculos_exposicion.size();
                    }
                    lectura.close();
                    fis.close();
                }
            } catch (FileNotFoundException ex) {
                System.out.println("El fichero fuente no existe.");
            }
        
    }
    
    
    
    /**
    * Funcion que comprueba si la matricula pertenece a un vehiculo vendido anteriormente
    * @param matricula matricula que va a comprobar la funcion
    * @throws MatriculaExistente: Excepcion que se genera si la matricula ya existe
    */
   /* 

    /**
    *  Metodo que guarda todos los datos del concesionario
    * @throws java.io.IOException Excepcion producida si no se han podido guardar los datos
    */
    /*public void guardarDatos() throws IOException{
    //serializar datos

        Integer aux=new Integer(numeroregistro);        
        FileOutputStream fosPro = new FileOutputStream("datosConcesionario.dat");
        ObjectOutputStream oosPro = new ObjectOutputStream(fosPro);
        oosPro.writeObject(aux);
        oosPro.writeObject(vehiculos_exposicion);
        oosPro.writeObject(vehiculos_vendidos);
        fosPro.close();

    }
    /**
    * Recupera los datos previamente guardados del concesionario
    * @throws java.io.IOException
    * @throws java.lang.Exception
    */
    /*public void recuperarDatos() throws IOException,Exception{

            FileInputStream fisPro = new FileInputStream("datosConcesionario.dat");
            ObjectInputStream oisPro = new ObjectInputStream(fisPro);
            try {
                while (true) {
                    Integer aux = (Integer) oisPro.readObject();
                    numeroregistro= aux.intValue();
                    vehiculos_exposicion=(HashMap) oisPro.readObject();
                    vehiculos_vendidos = (HashMap) oisPro.readObject();

                }

            } catch (EOFException e) {
                throw new LecturaTerminada();

            } catch (ClassNotFoundException cnf) {

            }
                        fisPro.close(); 
    }
    
    */
  
 
}

            

