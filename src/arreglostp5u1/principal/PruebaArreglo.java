/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglostp5u1.principal;
import arreglostp5u1.entidades.Arreglo;
/**
 *
 * @author Ezequiel Coronel
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       int numeros[] = {22,45,67,90};
       int numeros2 [][] = {{2,4}, {500,200,550}, {400,50,90}};
       String saludo = "Palabra";
       Arreglo.sumarLista(numeros);
       Arreglo.buscarMayor(numeros2);
       Arreglo.cuentaVocales(saludo);
//       Arreglo.cuentaCaracter(saludo, 'a');//El caracter existe en el string.
       Arreglo.cuentaCaracter(saludo, 'x');//El caracter no existe en el string.
    }
    
}
