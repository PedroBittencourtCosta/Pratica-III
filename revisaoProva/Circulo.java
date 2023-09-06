package revisaoProva;

public class Circulo extends Figura{

    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
