package Ejercicio4;

public class Triangulo extends Figura {
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;
//Constructor de la clase Triangulo
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
//Sobreescritura de metodos
    @Override
    public double calcularArea () {
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        return area;
    }

    @Override
    public double calcularPerimetro () {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es: " + perimetro);
        return perimetro;
    }
}
