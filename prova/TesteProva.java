package prova;

public class TesteProva {

    public static void main(String[] args) {

        Carro carro = new Carro("Ferrari", "california", 2013, 340);
        Carro carro1 = new Carro();

        carro1.setMarca("chevrole");
        carro1.setModelo("camaro");
        carro1.setAno(2008);
        carro1.setVelocidadeMax(400);

        System.out.println(" Carros: ///////////////////////////////////////////////////");
        carro.exibirDados();
        carro1.exibirDados();

        Caminhao caminhao = new Caminhao("Mercedes benz", "Actros EURO6", 2023, 6);
        Caminhao caminhao1 = new Caminhao();

        caminhao1.setMarca("Ford");
        caminhao1.setModelo("Tractor");
        caminhao1.setAno(2015);
        caminhao1.setQtdEixos(6);

        System.out.println(" Caminhao: ///////////////////////////////////////////////////");
        caminhao.exibirDados();
        caminhao1.exibirDados();
    }
}
