package Ejercicio5;

public class EmpleadoFijo extends Empleado {
    double bonificacion;
//Constructor con parametros
    public EmpleadoFijo(String nombre, String identificacion, double salarioBase, double bonificacion) {
        super(nombre, identificacion, salarioBase);
        this.bonificacion = bonificacion;
    }
//Sobreescritura de metodos
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public void mostrarInformacion () {
        super.mostrarInformacion();
    }
}
