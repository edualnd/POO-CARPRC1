/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relembrandologica.exFix2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cg3034011
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int num = 0, sorted = 0, chutes = 0;
        Random generate = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero de 1 a 99: ");
        num = sc.nextInt();
        if(num < 1 || num > 99){
            System.out.println("Entrada invalida");
        } else {
            do {
                sorted = generate.nextInt(1, 100);
                chutes++;
                
            } while (sorted != num);
            System.out.println("Tentativas: " + chutes);
        }
    }

    

    
    
    
    
}
