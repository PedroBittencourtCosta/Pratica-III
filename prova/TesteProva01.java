package prova;

public class TesteProva01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Augusto", 36, 362727, 3.440, "Matematica");
        Aluno aluno = new Aluno("Pedro", 20, 7.8,9.3);

        System.out.println("Professor: //////////////////////////////////////");
        professor.exibirDados();
        System.out.println("Aluno: //////////////////////////////////////////");
        aluno.exibirDados();
    }
}
