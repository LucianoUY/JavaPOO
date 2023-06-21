/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo02;

/**
 *
 * @author lucho
 */
public class EjercicioPOO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Circunferencia c1 = new Circunferencia();
     c1.setRadio(10);
     System.out.println("El radio es: "+c1.radio+". El área es "+c1.calcularArea()+". El perímetro es "+c1.calcularPerimetro());
    }
    
}
