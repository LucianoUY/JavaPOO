/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lucho
 */
public class Cadena {
    private String frase;
    private int longitud;

     public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getters y setters
    // Setter de longitud no se crea, porque la longitud de la frase
    // se calcula automáticamente en el constructor y el setter de frase.
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
    }