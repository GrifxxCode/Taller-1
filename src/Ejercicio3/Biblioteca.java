package Ejercicio3;

import java.util.ArrayList;

public class Biblioteca {
    String nombre;
    ArrayList<Libro> libros;
//Constructor de la biblioteca
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
//Metodos Agregar, prestar, devolver, buscar y listar
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.titulo);

    }

    public void prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.isbn.equals(isbn)) {
                if (libro.disponible) {
                    libro.disponible = false;
                    System.out.println("Prestado: " + libro.titulo);
                } else {
                    System.out.println("Ya estaba prestado");
                }
                return;
            }
            System.out.println("No se encontro el libro");
        }
    }

    public void devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.isbn.equals(isbn)) {
                libro.disponible = true;

                System.out.println("Devuelto: " + libro.titulo);
            }else {
                System.out.println("No se encontro el libro");
            }
            return;
        }
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.disponible) {

                System.out.println(libro.titulo + " - " + libro.autor);
            }
        }
    }

}
