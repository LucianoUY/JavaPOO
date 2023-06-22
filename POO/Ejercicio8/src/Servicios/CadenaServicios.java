/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CadenaServicios {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Cadena crearCadena(){
       Cadena c1 = new Cadena();
       System.out.println("Ingrese una frase");
       c1.setFrase(leer.nextLine());
       return c1;
       
   }
   public void hacerPruebas(Cadena c1){
       System.out.println("La frase invertida es ");
       invertirFrase(c1.getFrase(), c1.getLongitud());
       
        System.out.print("Ingrese un caracter para ver si está repetido: ");
        vecesRepetido(leer.nextLine().charAt(0), c1.getFrase(), c1.getLongitud());
        
        compararLongitud(c1.getFrase(), c1.getLongitud());
        
        unirFrases(c1.getFrase());
       
        cambiarLetra(c1.getFrase(), c1.getLongitud());
      }
   public void cambiarLetra(String frase, int longitud){
       System.out.println("Ingrese el caracter que desea intercambiar por la A");
       String cambiar = leer.next();
       for (int i = 0; i < longitud; i++) {
           if (frase.charAt(i)=='A' || frase.charAt(i)=='a') {
               System.out.print(cambiar);
               
           }
           else System.out.print(frase.charAt(i));
           
       }
       System.out.println("");
       
   }
   public void invertirFrase(String frase, int longitud){
       for (int i = longitud-1; i >=0; i--) {
           System.out.print(frase.charAt(i));          
       }
       System.out.println("");
   }
   public void vecesRepetido(char letra, String frase, int longitud) {
        int repeticiones = 0;
        for (int i = 0; i < longitud; i++) {
            if (letra == frase.charAt(i)) {
                repeticiones++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + repeticiones + " veces.");
    
   }
   public void unirFrases(String frase){
       System.out.println("Ingrese una nueva frase para unir a la anterior");
       String frase3 = leer.next();
       System.out.println(frase+frase3);
   }
   public void compararLongitud(String frase, int longitud){
       System.out.println("Ingrese una frase para comparar");
       String frase2 = leer.next();
       if (frase2.length()>longitud) {
           System.out.println("La nueva frase es más larga que la guardada");
           
       }
       else if (frase2.length()==longitud) { 
           System.out.println("Las frases son del mismo tamaño");
           
       } else System.out.println("La frase guardada es más larga que la ingresada");
       
   }
   
           
   public int mostrarVocales(String frase, int longitud){
       int vocales = 0;
       for (int i = 0; i < longitud; i++) {
           if (esVocal(frase.charAt(i))) {
               vocales++;
               }
           }
       return vocales;
   }
   public static boolean esVocal(char letra){
       boolean vocal;
       vocal=letra=='a'
               || letra == 'A'
               || letra == 'e'
               || letra == 'E'
               || letra == 'i'
               || letra == 'I'
               || letra == 'o'
               || letra == 'O'
               || letra == 'u'
               || letra == 'U';
       return vocal;
   }
}
