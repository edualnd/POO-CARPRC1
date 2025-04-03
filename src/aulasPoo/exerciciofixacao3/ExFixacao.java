/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.exerciciofixacao3;

import java.util.Scanner;

/**
 *
 * @author cg3034011
 */
public class ExFixacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ent;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual exercicio deseja testar: ");
        System.out.printf("1 - Alunos%n"
                + "2 - funcionarios%n"
                + "3 - Conta Bancaria%n"
                + "4 - Data%n");
        System.out.printf(">> ");
        ent = sc.nextInt();
        
        switch(ent){
            case 1 -> exAluno();
            case 2 -> exFuncionarios();
            case 3 -> exConta();
            case 4 -> exData();
            default -> System.out.println("Não encontrado");
        }
        }

    private static void exAluno() {
        Aluno Eduarda = new Aluno("asas", "asas", 5, 5, 5);
        System.out.println(Eduarda.media());
    }

    private static void exFuncionarios() {
        System.out.println("Fazer");
    }

    private static void exConta() {
        System.out.println("Fazer");
    }

    private static void exData() {
        System.out.println("Fazer");
    }
    }
    
