package algoritmo;

public class Imovel {
    private int numeroDaCasa;
    private double valorDoIPTU;
    private int mesesAtrazado;

    public Imovel(int numeroDaCasa, double valorDoIPTU, int mesesAtrazado) {
        this.numeroDaCasa = numeroDaCasa;
        this.valorDoIPTU = valorDoIPTU;
        this.mesesAtrazado = mesesAtrazado;
    }

    public double calcularMulta(){
        return (valorDoIPTU * 2) / 100;
    }

    public double calcularJuros(double valor) {
        double juros = valor;
        if(mesesAtrazado == 0 ){
            return 0;
        }
        for (int i = 0; i < mesesAtrazado; i++) {
            juros += (juros * 1.5) / 100;
        }
        return juros - valor;
    }

    public double getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public double getValorDoIPTU() {
        return valorDoIPTU;
    }

    public void setValorDoIPTU(int valorDoIPTU) {
        this.valorDoIPTU = valorDoIPTU;
    }

    public double getMesesAtrazado() {
        return mesesAtrazado;
    }

    public void setMesesAtrazado(int mesesAtrazado) {
        this.mesesAtrazado = mesesAtrazado;
    }

}
