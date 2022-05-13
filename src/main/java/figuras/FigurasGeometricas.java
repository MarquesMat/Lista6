package figuras;

public class FigurasGeometricas {
    protected double base;
    protected double altura;
        
    public void lados(double base, double altura) {
        this.base = base;
        this.altura = altura;   
    }
    
    public double calcularArea() {
        return this.base*this.altura;
    }
}
