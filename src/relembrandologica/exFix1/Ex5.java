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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num, numInvertido;
        System.out.println("Numero de 3 digitos:");
        num = sc.nextInt();
        numInvertido = (num/100) + ((num/10)%10)*10 + (num%10 * 100) ;
        System.out.println(numInvertido);
    }
    
}
