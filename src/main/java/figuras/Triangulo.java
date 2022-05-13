package figuras;

public class Triangulo extends FigurasGeometricas {
    public Triangulo(double base, double altura) {
        super.lados(base, altura);
    }
    
    @Override
    public double calcularArea() {
        double area = super.calcularArea();
        return (area/2);
    }
}
