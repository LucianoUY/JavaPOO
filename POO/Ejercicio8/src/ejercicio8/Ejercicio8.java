/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicios cs = new CadenaServicios();
        Cadena c1 = cs.crearCadena();
        cs.hacerPruebas(c1);

        
        
    }
    
}
