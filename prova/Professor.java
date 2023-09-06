package prova;

public class Professor extends Funcionario{

    private String disciplina;

    public Professor(String nome, int idade, int identificar, double salario, String disciplina) {
        super(nome, idade, identificar, salario);
        this.disciplina = disciplina;
    }


    public void exibirDados(){
        System.out.printf("Nome: %s, Disciplina: %s\n", getNome(), disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
