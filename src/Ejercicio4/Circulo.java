package Ejercicio4;

public class Circulo extends Figura {
//Atributos de circulo
    double radio;
//Constructor de la clase circulo
    public Circulo(double radio) {
        this.radio = radio;
    }
//Sobreescritura de metodos
    @Override
    public double calcularArea () {
        double area = 3.14 * radio * radio;
        System.out.println("El area del circulo es: " + area);
        return area;
    }
    @Override
    public double calcularPerimetro () {
        double perimetro = 2 * 3.14 * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
        return perimetro;
    }
}
