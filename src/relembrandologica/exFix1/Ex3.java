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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float premio;
        System.out.println("Qual foi o valor premiado?");
        premio = sc.nextFloat();
        System.out.println("Sena ganhara R$" + String.format("%.2f", premio * 0.6f));
        System.out.println("Quina ganhara R$" + String.format("%.2f",premio * 0.3f));
        System.out.println("Quadra ganhara R$" + String.format("%.2f",premio * 0.1f));
        
    }
    
}
