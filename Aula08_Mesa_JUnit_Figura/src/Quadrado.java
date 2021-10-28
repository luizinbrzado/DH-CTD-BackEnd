public class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado*4;
    }
}
