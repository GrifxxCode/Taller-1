package Ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {

        System.out.println("-------CIRCULO-------");

        Circulo circulo = new Circulo (9);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("-------TRIANGULO-------");

        Triangulo triangulo = new Triangulo (6,9,4,5,7);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        System.out.println("-------RECTANGULO-------");

        Rectangulo rectangulo = new Rectangulo (7,8);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(rectangulo);

        double areaTotal = 0;

        for (Figura figura: figuras) {
            areaTotal = areaTotal + figura.calcularArea();
            System.out.println("Area total de todas las figuras: " + areaTotal);
        }
    }
}
