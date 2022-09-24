package classes;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas; // MAX 56
    private Professor coordenador;
    private float cargaHoraria;

    public Curso(String nome, ArrayList<Disciplina> disciplinas, Professor coordenador, float cargaHoraria) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.coordenador = coordenador;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                ", coordenador=" + coordenador +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Float.compare(curso.cargaHoraria, cargaHoraria) == 0 && Objects.equals(nome, curso.nome) && Objects.equals(disciplinas, curso.disciplinas) && Objects.equals(coordenador, curso.coordenador);
    }
}
