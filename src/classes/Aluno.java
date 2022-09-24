package classes;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private String telefone;
    private String cidadeNatal;


    public Aluno(String nome, String matricula, String telefone, String cidadeNatal) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.cidadeNatal = cidadeNatal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cidadeNatal='" + cidadeNatal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(matricula, aluno.matricula) && Objects.equals(telefone, aluno.telefone) && Objects.equals(cidadeNatal, aluno.cidadeNatal);
    }

}
