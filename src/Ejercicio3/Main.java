package Ejercicio3;

public class Main {
    public static void main (String [] args) {
        Biblioteca biblioteca = new Biblioteca ("Biblioteca Central");

        Libro libros2 = new Libro ("En agosto nos vemos", "Gabriel Garcia Marquez", "523-188292");

        biblioteca.listarLibrosDisponibles();

        biblioteca.agregarLibro(libros2);
        biblioteca.prestarLibro("523-188292");
        biblioteca.buscarLibro("En agosto nos vemos");
        biblioteca.devolverLibro("523-188292");
    }
}
