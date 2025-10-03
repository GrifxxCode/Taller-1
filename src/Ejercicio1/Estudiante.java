package Ejercicio1;

public class Estudiante {
    //Atributos
        private String nombre;
        private int edad;
        private String carrera;
        private double promedio;
    //Constructor con parametros
        public Estudiante (String nombre, int edad, String carrera, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = promedio;
        }
    //Getters y Setters para cada atributo
        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre) {
            this.nombre = nombre;
        }

        public int getEdad () {
            return edad;
        }

        public void setEdad (int edad) {
            this.edad = edad;
        }

        public String getCarrera () {
            return carrera;
        }

        public void setCarrera (String carrera) {
            this.carrera = carrera;
        }

        public double getPromedio () {
            return promedio;
        }

        public void setPromedio (double promedio) {
            this.promedio = promedio;
        }
    //Metodos
        public void mostrarInformacion () {
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad);
            System.out.println("Su carrera es: " + carrera);
            System.out.println("Su promedio es: " + promedio);
            System.out.println("Aprobado: " + esAprobado());
        }

        public boolean esAprobado () {
            return promedio >= 3.0;

        }
    }