package classes;

import enums.EIXO_TEMATICO;

import java.util.Objects;

public class Professor {
    private String nome;
    private EIXO_TEMATICO areaAtuacao;
    private String email;
    private float salario;

    public Professor(String nome, EIXO_TEMATICO areaAtuacao, String email, float salario) {
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EIXO_TEMATICO getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(EIXO_TEMATICO areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", areaAtuacao=" + areaAtuacao +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Float.compare(professor.salario, salario) == 0 && Objects.equals(nome, professor.nome) && areaAtuacao == professor.areaAtuacao && Objects.equals(email, professor.email);
    }
}
