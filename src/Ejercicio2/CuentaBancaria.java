package Ejercicio2;

public class CuentaBancaria {
//Atributos
    String numeroCuenta;
    String titular;
    double saldo;
//Constructor con parametros
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this. saldo = 0.0;
    }
//Metodos
    public void depositar (double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito realizado: " + saldo);
        }
        else {
            System.out.println("El monto debe de ser positivo");
        }
    }

    public void retirar (double monto) {
        if (saldo > 0 && saldo > monto) {
            saldo = saldo - monto;
            System.out.println("Su saldo despues de retirar es: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente...");
        }
    }

    public double consultarSaldo () {
       return saldo;
    }

    public void transferir (CuentaBancaria destino, double monto) {
        if (saldo > 0 && saldo > monto) {
            saldo = saldo - monto;
            System.out.println("Transferencia exitosa de " + monto + " a " + destino.titular);
        }
        else {
            System.out.println("Saldo insuficiente para transferir...");
        }
    }
}
