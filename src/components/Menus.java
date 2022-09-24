package components;

import enums.EIXO_TEMATICO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menus {
    private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

    public static int mainMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("0");
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");

        while (true){
            System.out.println("SISTEMA ESCOLA");
            System.out.println("1 - Criar Disciplina");
            System.out.println("2 - Ver disciplinas");
            System.out.println("3 - Editar Disciplina");
            System.out.println("4 - Remover Displina");
            System.out.println("0 - Voltar");
            System.out.print("Informe uma opção: ");

            try{
                String  opInput = br.readLine();

                if(validOptions.contains(opInput)){
                    return Integer.parseInt(opInput);
                }else{
                    System.out.println("Opção inválida!\n");
                }

            } catch (IOException e) {
                System.out.println("Valor inválido, informe um valor entre 0 e 1!");
            }
        }
    }

    public static int disciplinaMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("0");
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");

        while (true){
            System.out.println("SISTEMA ESCOLA");
            System.out.println("1 - Criar Disciplina");
            System.out.println("2 - Ver disciplinas");
            System.out.println("3 - Editar Disciplina");
            System.out.println("4 - Remover Displina");
            System.out.println("0 - Voltar");
            System.out.print("Informe uma opção: ");

            try{
                String  opInput = br.readLine();

                if(validOptions.contains(opInput)){
                    return Integer.parseInt(opInput);
                }else{
                    System.out.println("Opção inválida!\n");
                }

            } catch (IOException e) {
                System.out.println("Valor inválido, informe um valor entre 0 e 1!");
            }
        }
    }

    public static int alunoMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("0");
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");

        while (true){
            System.out.println("SISTEMA ESCOLA");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Ver alunos");
            System.out.println("3 - Editar dados do aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Voltar");
            System.out.print("Informe uma opção: ");

            try{
                String  opInput = br.readLine();

                if(validOptions.contains(opInput)){
                    return Integer.parseInt(opInput);
                }else{
                    System.out.println("Opção inválida!\n");
                }

            } catch (IOException e) {
                System.out.println("Valor inválido, informe um valor entre 0 e 1!");
            }
        }
    }

    public static int professorMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("0");
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");

        while (true){
            System.out.println("SISTEMA ESCOLA");
            System.out.println("1 - Criar professor");
            System.out.println("2 - Ver professores");
            System.out.println("3 - Editar dados do professor");
            System.out.println("4 - Remover professor");
            System.out.println("0 - Voltar");
            System.out.print("Informe uma opção: ");

            try{
                String  opInput = br.readLine();

                if(validOptions.contains(opInput)){
                    return Integer.parseInt(opInput);
                }else{
                    System.out.println("Opção inválida!\n");
                }

            } catch (IOException e) {
                System.out.println("Valor inválido, informe um valor entre 0 e 1!");
            }
        }
    }

    public static int cursoMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("0");
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");

        while (true){
            System.out.println("SISTEMA ESCOLA");
            System.out.println("1 - Criar curso");
            System.out.println("2 - Ver cursos");
            System.out.println("3 - Editar dados do curso");
            System.out.println("4 - Remover curso");
            System.out.println("0 - Voltar");
            System.out.print("Informe uma opção: ");

            try{
                String  opInput = br.readLine();

                if(validOptions.contains(opInput)){
                    return Integer.parseInt(opInput);
                }else{
                    System.out.println("Opção inválida!\n");
                }

            } catch (IOException e) {
                System.out.println("Valor inválido, informe um valor entre 0 e 1!");
            }
        }
    }

    public static EIXO_TEMATICO eixoMenu(){
        ArrayList<String> validOptions = new ArrayList<>();
        validOptions.add("1");
        validOptions.add("2");
        validOptions.add("3");
        validOptions.add("4");
        validOptions.add("5");
        validOptions.add("6");

      while (true){
          List<EIXO_TEMATICO> eixosTematicos = Arrays.asList(EIXO_TEMATICO.class.getEnumConstants());
          for (int i = 0; i < eixosTematicos.size(); i++) {
              System.out.println(i+1+" - "+eixosTematicos.get(i));
          }
          System.out.print("Selecione uma opção: ");

          try{
              String  opInput = br.readLine();

              if(validOptions.contains(opInput)){
                  switch (Integer.parseInt(opInput)){
                      case 1:
                          return EIXO_TEMATICO.NATUREZA;
                      case 2:
                          return EIXO_TEMATICO.CONTABEIS;
                      case 3:
                          return EIXO_TEMATICO.LINGUAGENS;
                      case 4:
                          return EIXO_TEMATICO.HUMANAS;
                      case 5:
                          return EIXO_TEMATICO.EXATAS;
                      case 6:
                          return EIXO_TEMATICO.INFORMATICA;
                  }
              }else{
                  System.out.println("Opção inválida!\n");
              }

          } catch (IOException e) {
              System.out.println("Valor inválido, informe um valor entre 0 e 1!");
          }
      }
    }
}