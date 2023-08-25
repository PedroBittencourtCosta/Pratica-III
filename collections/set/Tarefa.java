package collections.set;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private Boolean tarefaFeita;

    public Tarefa(String descricao, Boolean tarefaFeita) {
        this.descricao = descricao;
        this.tarefaFeita = tarefaFeita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaFeita=" + tarefaFeita +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getTarefaFeita() {
        return tarefaFeita;
    }

    public void setTarefaFeita(Boolean tarefaFeita) {
        this.tarefaFeita = tarefaFeita;
    }
}
