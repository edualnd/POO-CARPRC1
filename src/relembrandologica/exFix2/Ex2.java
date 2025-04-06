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
public class Ex2 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int dia, mes, ano;
        boolean validData;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com uma data (dia mes ano): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();      
        
        validData = diasMeses(dia, mes, ano) && ano > 0 && dia > 0;

        if(validData){
        System.out.printf("Data valida:%n%d/%d/%d%n", dia, mes, ano);
        } else{
        System.out.printf("Data Invalida!!%n");
        }
        
    }
    
    private static boolean diasMeses(int dia, int mes, int ano) {
        int[] meses = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(ano%4 == 0 && ano%100 !=0 || ano%400 == 0){
            meses[2] = 29;
        }
        if(mes < 1 || mes > 12){mes = 0;}
        
        return meses[mes] >= dia;
    }
    
}
