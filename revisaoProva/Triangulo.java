package revisaoProva;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
