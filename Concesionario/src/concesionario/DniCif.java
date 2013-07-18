/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionario;
import java.io.*;
import Excepciones.*;
/**
 * Clase que contiene el dni o el cif del propietario que compra el vehiculo,
 * dicho documento sera validado por la clase, permitiendo solo documentos validos
 * @author Admin
 */
public class DniCif implements Serializable {
    private String dnicif;
/**
 * Constructo de la clase DniCif, recibe un dnicif, y en caso de ser un documento
 * no valido lanzara una excepcion 
 * @param dnicif dni o cif que introduce el usuario
 * @throws java.lang.Exception Se produce en caso de que el documento no sea valido
 */
    public DniCif(String dnicif) throws Exception{
        
        if (esCif(dnicif.charAt(0))){
            validarCif(Integer.parseInt(dnicif.substring(1,9)),dnicif.charAt(0));
        }
        else
            validarDni(Integer.parseInt(dnicif.substring(0,8)),dnicif.charAt(8));
        
        this.dnicif=dnicif;
    }
    
    /**
     * Metodo que valida el Dni introducido por el usuario
     * @param numero numero de 8 digitos del dni
     * @param letra letra del dni
     * @throws Excepciones.DniInvalido: Excepcion producida si el dni no es valido
     */
    public void validarDni(int numero,char letra) throws DniInvalido{
    char[] letrasDni={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E',};    
    
        if (letrasDni[numero%23]!=letra){
            throw new DniInvalido();
        }
    }
    private int algoritmoCif(String numeros){
        int pares,impares;
        pares=Character.getNumericValue(numeros.charAt(1))+Character.getNumericValue(numeros.charAt(3))+Character.getNumericValue(numeros.charAt(5));

        //sacamos los impares
        int i=0;
        impares=0;
        while (i<=6){
            int unidades,decenas;
            unidades=Character.getNumericValue(numeros.charAt(i))*2 %10;
            decenas=Character.getNumericValue(numeros.charAt(i))*2 /10;
            impares +=unidades+decenas;
            i +=2;
        }
        return 10-((pares+impares)%10);
            
    }
    
    /**
     * Metodo que valida el cif introducido por el usuario
     * @param numero numero de 8 digitos del cif
     * @param letra letra del cif
     * @throws Excepciones.CifInvalido
     */
    public void validarCif(int numero,char letra) throws CifInvalido{
    String letrasCif="ABCDEFGHPQS";
    //comprobamos si la letra es correcta
    int i=0;
    while (i<letrasCif.length()){
        if (letrasCif.charAt(i)==letra)
            break;
        i++;
    }
    if (i==letrasCif.length())
        throw new CifInvalido();
    
    //comprobamos que el septimo digito es correcto,para extraer mejor los dijitos
    //vamos a convertir el numero en una cadena.
    String numeros=String.valueOf(numero);
    int numeroC=algoritmoCif(numeros);
    if (numeroC!=Character.getNumericValue(numeros.charAt(7))){
        throw new CifInvalido();
    }    
    }
    public boolean esCif(char caracter){
        return Character.isLetter(caracter);
    }
    
    @Override
    public String toString(){
        return dnicif;   
    }
    
}
