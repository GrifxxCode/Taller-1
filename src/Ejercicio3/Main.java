package Ejercicio3;

public class Main {
    public static void main (String [] args) {
        Biblioteca biblioteca = new Biblioteca ("Biblioteca Central");
        Libro libros = new Libro ("Cien años de soldedad", "Gabriel Gracia Marquez", "978-26271");
        Libro libros2 = new Libro ("En agosto nos vemos", "Gabriel Garcia Marquez", "523-188292");

        biblioteca.agregarLibro(libros2);
        biblioteca.listarLibrosDisponibles();
        biblioteca.prestarLibro("978-26271");
        biblioteca.devolverLibro("523-188292");
    }
}
