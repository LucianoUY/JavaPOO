/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo02;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    public double radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }
public Circunferencia(){
    
}

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crearCir(double radio){
        this.radio=radio;
    }
    public double calcularArea() {
        double area;
        area=Math.PI*radio*radio;
        return area;
}
    public double calcularPerimetro() {
        double perimetro;
        perimetro=Math.PI*radio*2;
        return perimetro;
}
    
}
