/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.tp5u1.entidades;

/**
 *
 * @author Ezequiel Coronel
 */
public class Arreglo {
    
    public static void sumarLista(int a[]){
        int suma= 0, contador = 0;
        for(int i = 0; i<a.length;i++){
            suma+= a[i];
            contador++;
        }
        //Mostrar suma
        System.out.println("La suma de los valores del array es: "+suma);
        
        //Mostrar promedio
        System.out.println("El promedio de los valores del array es: "+suma/contador);
    }
    
    public static void buscarMayor(int a[][]){
        int mayor=0;
        for(int f=0; f<a.length; f++){
            for(int c=0; c<a[f].length;c++){
                
                if(f==0 & c==0){
                    mayor= a[f][c];
                }else if(a[f][c] > mayor){
                    mayor= a[f][c];
                }
            }
        }
        
        System.out.println("El numero mas grande que se encuentra en el arreglo es: " + mayor);
    }
    
    public static void cuentaVocales(String palabra){
        int contadorVocales=0;
        char arregloChar[] = palabra.toCharArray();
        for(int i = 0; i<palabra.length();i++){
            switch (arregloChar[i]){
                case 'a':;
                case 'e':;
                case 'i':;
                case 'o':;
                case 'u':contadorVocales++;
                break;
                default:;
                break;
            }
        }
        if(contadorVocales == 0){
            System.out.println("La palabra "+palabra+" no tiene vocales");
        }else{
            System.out.println("La cantidad de vocales que tiene "+palabra+" es: "+contadorVocales);
        }
        
    }
    
    public static void cuentaCaracter(String palabra, char caracterBuscado){
        int caracterRepetido=0;
        
    }
}
