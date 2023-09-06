package revisaoProva;

public class Retangulo extends Figura{

    private double lado01;
    private double lado02;

    public Retangulo(String cor, double lado01, double lado02) {
        super(cor);
        this.lado01 = lado01;
        this.lado02 = lado02;
    }

    @Override
    public double getArea() {
        return lado01 * lado02;
    }

    public double getLado01() {
        return lado01;
    }

    public void setLado01(double lado01) {
        this.lado01 = lado01;
    }

    public double getLado02() {
        return lado02;
    }

    public void setLado02(double lado02) {
        this.lado02 = lado02;
    }
}
