/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.exerciciofixacao4;

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
        
        System.out.println("Qual codigo deseja testar:");
        System.out.printf("1 - Assistentes%n"
                + "2 - Agenda%n>>");
        ent = sc.nextInt();
        
        switch(ent){
            case 1 -> {
                System.out.printf("1 - Tecnico%n2 - Adiministrativo%n>>");
                ent = sc.nextInt();
        
                 switch(ent){
                     case 1 -> tecnico();
                     case 2 ->  admins();
                    default -> System.out.println("Entrada invalida");
                 }
            }
            case 2 -> agenda();
            default -> System.out.println("Entrada invalida");
        }
        
    }

    private static void agenda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void admins() {
        Scanner sc = new Scanner(System.in);
        int ent;
        Administrativo a = new Administrativo();
        System.out.println("Digite:");
        System.out.printf("Nome: ");
        a.setNome(sc.next());
        System.out.printf("Matricula: ");
        a.setMatricula(sc.next());
        System.out.printf("Salario: ");
        a.setSalario(sc.nextDouble());
        System.out.println("Turno: 1 - Diurno 2 - Noturno");
        ent = sc.nextInt();
        if(ent == 1){ a.setTurno("diurno");}
        else{a.setTurno("noturno");}
        System.out.printf("Adicional (%): ");
        a.setAdicional(sc.nextDouble());
        
        System.out.printf(a.exibeDados());
        System.out.printf("%nAdicional: %.2f", a.getAdicional());
        System.out.printf("%nSalario Anual: %.2f", a.ganhoAnual());
    }

    private static void tecnico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
