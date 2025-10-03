package Ejercicio5;

public class Empleado {
//Atributos
    String nombre;
    String identificacion;
    double salarioBase;
//Constructor con parametros
    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }
//Metodos
    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion () {
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su numero de identificacion es: " + identificacion);
        System.out.println("Su salario base es: " + salarioBase);
        System.out.println("Su salario final es: " + calcularSalario());
    }
}
