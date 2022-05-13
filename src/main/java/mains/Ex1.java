package mains;

import figuras.*;
import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();
        figuras.add(new Retangulo(2.0, 3.5));
        figuras.add(new Quadrado(1.5));
        figuras.add(new Triangulo(3.0, 4.0));
        figuras.add(new Circulo(3.0));
        System.out.println("Retangulo:       Quadrado:        Triangulo:       Circulo:");
        for (FigurasGeometricas figura: figuras){
            System.out.printf("%.2f             ", figura.calcularArea());
        }
    }
}
