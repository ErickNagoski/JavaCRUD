package classes;

import enums.EIXO_TEMATICO;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private EIXO_TEMATICO EIXOTEMATICO;
    private float cargaHoraria;
    private Professor professor;
    private ArrayList<Aluno> listaAlunos; // MAX 25
}
