/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.tp5u1.principal;
import arreglos.tp5u1.entidades.*;
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
       String saludo = "Sky";
       Arreglo.sumarLista(numeros);
       Arreglo.buscarMayor(numeros2);
       Arreglo.cuentaVocales(saludo);
       Arreglo.cuentaCaracter(saludo, 'k');
    }
    
}
