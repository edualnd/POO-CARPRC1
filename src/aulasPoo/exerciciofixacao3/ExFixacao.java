/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.exerciciofixacao3;

import java.util.Scanner;

/**
 *
 * @author cg3034011aper
 * 
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
                + "2 - Funcionarios%n"
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
    
    private static void exData() {
        System.out.println("A Fazer");
    }
    
    private static void exConta() {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        
        System.out.println("Dados da conta:");
        
        System.out.printf("Numero da conta: ");
        conta.setNumConta(sc.next());
        
        System.out.printf("Conta criada, faca o primeiro deposito): ");
        conta.deposito(sc.nextFloat());
        
        int ent;
        do {            
            System.out.printf("Qual operacao deseja fazer :%n"
                + "1 - Extrato%n"
                + "2 - Saque%n"
                + "3 - Depositar%n>> ");
            ent = sc.nextInt();

            switch(ent){
                case 1 -> conta.extrato();
                case 2 -> {
                    System.out.printf("Quanto deseja retirar: ");
                    conta.saque(sc.nextFloat());
                }
                case 3 -> {
                    System.out.printf("Quanto deseja depositar: ");
                    conta.deposito(sc.nextFloat());
                }
                default -> System.out.println("Nao encontrado");
            } 
            
            System.out.println("Deseja continuar?");
            System.out.println("1- Sim 2- Nao");
            ent = sc.nextInt();
        } while (ent == 1);
    }
    
    private static void exFuncionarios() {
       Scanner sc = new Scanner(System.in);
       Funcionario funcionario = new Funcionario();
       
        System.out.println("Dados do funcionario: ");
        
        System.out.printf("Nome: ");
        funcionario.setNome(sc.next());
        
        System.out.printf("RG: ");
        funcionario.setRg(sc.next());
        
        System.out.printf("Departamento: ");
        funcionario.setDepartamento(sc.next());
        
        System.out.printf("Data de entrada (dd/mm/aaaa): ");
        funcionario.setDataEntrada(sc.next());
        
        System.out.printf("Salario: ");
        funcionario.setSalario(sc.nextDouble());
        
        int ent;
        do {            
            System.out.printf("Deseja :%n"
                + "1 - Saber o nome%n"
                + "2 - Saber o RG%n"
                + "3 - Saber o departamento%n"
                + "4 - Saber a data de entrada%n"
                + "5 - Saber o salario%n"
                + "6 - Aumentar o salario%n"
                + "7 - Saber o salario anual%n>> ");
            ent = sc.nextInt();

            switch(ent){
                case 1 -> System.out.printf("Nome: %s %n%n", funcionario.getNome());
                case 2 -> System.out.printf("RG: %s %n%n", funcionario.getRg());
                case 3 -> System.out.printf("Departamento: %s %n%n", funcionario.getDepartamento());
                case 4 -> System.out.printf("Data de entrada: %s %n%n", funcionario.getDataEntrada());
                case 5 -> System.out.printf("Salario: %.2f%n%n", funcionario.getSalario());
                case 6 -> {
                    System.out.printf("Salario atual: %.2f%n%n", funcionario.getSalario());
                    System.out.printf("Quanto deseja aumentar o salario (R$): ");
                    funcionario.recebaAumento(sc.nextDouble());
                    System.out.printf("Novo salario: %.2f%n", funcionario.getSalario());
                }
                case 7 -> System.out.printf("Salario anual: %.2f%n%n", funcionario.calculaGanhoAnual());
                default -> System.out.println("Nao encontrado");
            } 
            
            System.out.println("Deseja continuar?");
            System.out.println("1- Sim 2- Nao");
            ent = sc.nextInt();
        } while (ent == 1);
        
        
    }

    private static void exAluno() {
        Scanner sc = new Scanner(System.in);
        float p1, p2, t1;
        Aluno aluno = new Aluno();
        
        System.out.println("Informe os dados do aluno:");
        
        System.out.printf("Nome: ");
        aluno.setNome(sc.next());
        System.out.printf("Matricula: ");
        aluno.setMatricula(sc.next());
        
        System.out.println("Notas da(o)  (0 - 10):");
        do {            
            System.out.printf("Prova 1: ");
            p1 = sc.nextFloat(); 
        } while (p1>10 || p1<0);
        
        do{
            System.out.printf("Prova 2: ");
            p2 = sc.nextFloat();
        } while (p2>10 || p2<0);
        
        do{
            System.out.printf("Trabalho: ");
            t1 = sc.nextFloat();
        } while (t1>10 || t1<0);
        
        aluno.setNotaProva1(p1);
        aluno.setNotaProva2(p2);
        aluno.setNotaTrabalho(t1);
        
        int ent;
        do {            
           System.out.printf("Deseja saber:%n"
                + "1 - Media%n"
                + "2 - Recuperacao%n"
                + ">> ");
            ent = sc.nextInt();

            switch(ent){
                case 1 -> System.out.printf("Media: %.2f%n%n", aluno.media());
                case 2 -> System.out.printf("Recuperacao: %.2f%n%n", aluno.rec());
                default -> System.out.println("Nao encontrado");
            } 
            System.out.println("Deseja continuar?");
            System.out.println("1- Sim 2- Nao");
            ent = sc.nextInt();
        } while (ent == 1 );
    }
    
    }
    
