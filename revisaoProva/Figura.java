package revisaoProva;

public abstract class Figura {

    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double getArea();
}
