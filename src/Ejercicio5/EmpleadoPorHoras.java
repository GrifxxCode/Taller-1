package Ejercicio5;

public class EmpleadoPorHoras extends Empleado {
//Atributos
    double horasTrabajadas;
    double valorHora;
//Constructor con parametros
    public EmpleadoPorHoras(String nombre, String identificacion, double salarioBase, double horasTrabajadas, double valorHora) {
        super(nombre, identificacion, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
//Sobreescritura de metodos
    @Override
    public double calcularSalario () {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }
}
