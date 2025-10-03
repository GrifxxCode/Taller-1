package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----EMPLEADO COMISION-----");
        EmpleadoComision empleado = new EmpleadoComision("Carlos", "HKD-172722", 100000, 60, 0.59);
        empleado.mostrarInformacion();
        empleado.calcularSalario();

        System.out.println("-----EMPLEADO FIJO-----");
        EmpleadoFijo empleado2 = new EmpleadoFijo("Jhon", "HHG-1672272", 286228, 10000);
        empleado2.mostrarInformacion();
        empleado2.calcularSalario();

        System.out.println("-----EMPLEADO HORAS-----");
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Stiven", "AAB-72782882", 363670,12,120000);
        empleado3.mostrarInformacion();
        empleado3.calcularSalario();


    }
}