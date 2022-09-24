package DAO;

import classes.Professor;
import enums.EIXO_TEMATICO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static components.Menus.eixoMenu;

public class ProfessorDAO {
    private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

    public static Professor createProfessor() throws IOException {
        System.out.println("");
        String nome = br.readLine();
         EIXO_TEMATICO areaAtuacao = eixoMenu();
         String email = br.readLine();
         float salario = Float.parseFloat(br.readLine());

        Professor prof = new Professor(nome,areaAtuacao,email,salario);
        return prof;
    }

    public static Professor updateProfessor(Professor professor){
        Professor prof = professor;

        return prof;
    }
}
