/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relembrandologica.exFix1;

import java.util.Scanner;

/**
 *
 * @author duda
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ano, mes, dia, total;
        System.out.println("Quantos anos, mes, dias?");
        ano = sc.nextInt();
        mes = sc.nextInt();
        dia = sc.nextInt();
        total = (365*ano)+(30*mes)+ dia;
        System.out.println("O total de dias e " + total);
        
    }
    
}
