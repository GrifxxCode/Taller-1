package Ejercicio5;

public class EmpleadoComision extends Empleado {
//Atributos
    double ventasRealizadas;
    double porcentajeComision;
//Contructor con parametros
    public EmpleadoComision(String nombre, String identificacion, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, identificacion, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }
//Sobreescritura de Metodos
    @Override
    public double calcularSalario () {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public void mostrarInformacion () {
        super.mostrarInformacion();
    }
}
