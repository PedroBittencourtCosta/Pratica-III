package prova;

public class Caminhao extends Veiculo {

    private int qtdEixos;

    public Caminhao(String marca, String modelo, int ano, int qtdEixos) {
        super(marca, modelo, ano);
        this.qtdEixos = qtdEixos;
    }

    public Caminhao() {

    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public void exibirDados(){
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d, Quantidade de Eixos: %d\n", getMarca(), getModelo(), getAno(), qtdEixos);
    }
}
