package Ejercicio4;

public class Rectangulo extends Figura {
//Atributos de rectangulo
    double base;
    double altura;
//Constructor de la clase rectangulo
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//Sobreescritura de metodos
    @Override
    public double calcularArea () {
        double area = base * altura;
        System.out.println("La area del rectangulo es: " + area);
        return area;
    }

    @Override
    public double calcularPerimetro () {
        double perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }
}
