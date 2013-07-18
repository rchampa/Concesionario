/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Excepciones.FechaInvalida;
import Excepciones.FormatoInvalido;
import Excepciones.MatriculaInvalida;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;



public class Utilidades {
    
    public static final int ALTO_FOTO = 150;
    public static final int ANCHO_FOTO = 160;
    
    public static String getNombreConcesionario(){
        
        return "Concesionario LTP";
        
    }
    
    public static String getFechaHoy(){
        String fecha;
        Date hoy=new Date();        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha = formato.format(hoy);
        return fecha;
    }
    
    public static void validarFecha(String p) throws Exception{
        
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        StringTokenizer v=new StringTokenizer(p,"/");
        try{
            int dias = Integer.parseInt(v.nextToken());
            int mes = Integer.parseInt(v.nextToken());
            int año = Integer.parseInt(v.nextToken());

            // comprobamos año bisiesto
            if (año % 4==0)
                if (!(año %100==0 && año%400!=0))
                    diasMes[1]++;


            if (diasMes[mes-1]-dias <0){
                throw new FechaInvalida();
            }

        }catch(NoSuchElementException e){
            throw new FormatoInvalido();   
        }catch(NumberFormatException e){
            throw new FormatoInvalido();
        }
    }
/*----------------------------------------------------------------------------*/
    /**
     * Metodo que valida una matricula
     * @param matricula String con la matricula a validar
     * @throws Excepciones.MatriculaInvalida se genera una excepcion si la matricula introducida no es valida
     */
    public static void validarMatricula(String matricula) throws MatriculaInvalida{
    
        CharSequence [] novalidos={"1","2","3","4","5","6","7","8","9","0","A","E","I","O","U",};
        String numeros=matricula.substring(0,4);
        String letras=matricula.substring(4,7);
        letras=letras.toUpperCase();
        try{
       
            Integer.parseInt(numeros);
            
        }catch(NumberFormatException e){
           throw new MatriculaInvalida();         
        }
        // comprobamos las letras
        int i=0;
        while (i<novalidos.length){
            if (letras.contains(novalidos[i]))
                throw new MatriculaInvalida();
            
            i++;
        }
    }
    
 
}
