package revisaoProva;

public class Quadrado extends Retangulo{

    private double lado01;

    public Quadrado(String cor, double lado01, double lado02) {
        super(cor, lado01, lado02);
        this.lado01 = lado01;
    }

    @Override
    public double getArea() {
        return lado01 * lado01;
    }

    public double getLado01() {
        return lado01;
    }

    public void setLado01(double lado01) {
        this.lado01 = lado01;
    }
}
