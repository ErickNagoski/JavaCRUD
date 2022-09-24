import classes.Aluno;
import classes.Curso;
import classes.Disciplina;
import classes.Professor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static DAO.ProfessorDAO.createProfessor;
import static components.Menus.eixoMenu;

public class Main {
    private static BufferedReader BR  = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<Curso> CURSOS = new ArrayList<>();
    private static ArrayList<Professor> PROFESSORES = new ArrayList<>();
    private static ArrayList<Disciplina> DISCIPLINAS = new ArrayList<>();
    private static ArrayList<Aluno> ALUNOS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Professor prof = createProfessor();
        PROFESSORES.add(prof);
        System.out.println("eixo: "+prof.toString());
    }


}