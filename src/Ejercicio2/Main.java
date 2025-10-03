package Ejercicio2;

public class Main {
    public static void main (String [] args){
        CuentaBancaria cuenta = new CuentaBancaria("AHA-6262711", "Jhoan");
        CuentaBancaria cuenta2 = new CuentaBancaria("BBDF-527171", "Camilo");
            cuenta.depositar(100000);
            cuenta.retirar(100);
            cuenta.transferir(cuenta2, 100);
            System.out.println("Su saldo actual es: " + cuenta.consultarSaldo());
    }
}
