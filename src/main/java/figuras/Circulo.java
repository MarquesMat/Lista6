package figuras;

public class Circulo extends FigurasGeometricas{
    public Circulo(double raio) {
        super.lados(Math.PI, (raio*raio));
    }
}
