/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo01;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Libro {
     private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    public Libro() {  
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    

    public Scanner getLeer() {
        return leer;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
   
    public Libro crearLibro(){
        System.out.println("Ingrese el título del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();
        System.out.println("Ingrese el número de páginas");
        int numeroDePaginas = leer.nextInt();
        System.out.println("Ingrese el número ISBN");
        int ISBN = leer.nextInt();
        return new Libro(ISBN, titulo, autor, numeroDePaginas);
    }

    @Override
    public String toString() {
        return "Libro{" + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
}
