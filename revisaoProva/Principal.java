package revisaoProva;
public class Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo("vermelho", 3.5);
        Quadrado quadrado = new Quadrado("verde", 4, 4);
        Retangulo retangulo = new Retangulo("Azul", 4, 6);
        Triangulo triangulo = new Triangulo("Amarelo", 3, 7);

        System.out.printf("Circulo: Raio: %.2f, Cor: %s, Area: %.2f\n", circulo.getRaio(), circulo.getCor(), circulo.getArea());
        System.out.printf("Quadrado: Lado: %.2f, Cor: %s, Area: %.2f\n", quadrado.getLado01(), quadrado.getCor(), quadrado.getArea());
        System.out.printf("Retangulo: Lado1: %.2f, Lado2: %.2f, Cor: %s, Area: %.2f\n", retangulo.getLado01(), retangulo.getLado02(), retangulo.getCor(), retangulo.getArea());
        System.out.printf("Triangulo: Base: %.2f, Altura: %.2f, Cor: %s, Area: %.2f\n", triangulo.getBase(), triangulo.getAltura(), triangulo.getCor(), triangulo.getArea());
    }
}
