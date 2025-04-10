/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relembrandologica.exFix2;

import java.util.Scanner;

/**
 *
 * @author cg3034011
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DiaSemana, mes, dia, ano, s, a, m;
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dia do mes: ");
        dia = sc.nextInt();
        
        System.out.println("Mes: ");
        mes = sc.nextInt();
        
        System.out.println("Ano: ");
        ano = sc.nextInt();
        a = ano % 100;
        s = ano /100;
        if(mes == 1 || mes ==2){
            a--;
            m = mes +10;
        } else{
            m = mes-2;
        }
        DiaSemana = resto((trunca(2.6f * m - 0.1f) + dia + a + quociente(a)+ quociente(s)-2*s));
        if(DiaSemana < 0){
            DiaSemana = DiaSemana + 7;
        }
        
        System.out.printf("Na data %d/%d/%d, era uma %s%n",dia, mes,ano, dias[DiaSemana]);
    }

    private static int trunca(float valor) {
        return (int)valor;
    }

    private static int quociente(int ano) {
        return ano / 4;
    }

    private static int resto(int val) {
        return val % 7;
    }
    
}
