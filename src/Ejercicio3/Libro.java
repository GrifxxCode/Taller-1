package Ejercicio3;

public class Libro {
//Atributos
    String titulo;
    String autor;
    String isbn;
    boolean disponible;
//Constructor con parametros
    public Libro (String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
}
