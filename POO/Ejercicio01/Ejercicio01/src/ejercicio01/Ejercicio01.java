/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import entidad.Persona;

/**
 *
 * @author lucho
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona primeraPersona = new Persona();
        
        primeraPersona.setCiudad("Tacuarembo");
        primeraPersona.setEdad(31);
        primeraPersona.setNombre("Luciano");
        
        System.out.println(primeraPersona.ciudad+" "+primeraPersona.nombre+" "+primeraPersona.edad);
    }

    
    
}
