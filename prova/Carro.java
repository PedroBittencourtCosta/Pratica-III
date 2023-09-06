package prova;

public class Carro extends Veiculo{

    private int velocidadeMax;

    public Carro(String marca, String modelo, int ano, int velocidadeMax) {
        super(marca, modelo, ano);
        this.velocidadeMax = velocidadeMax;
    }

    public Carro() {

    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void exibirDados(){
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d, Velocidade Maxima: %d\n", getMarca(), getModelo(), getAno(), velocidadeMax);
    }
}
