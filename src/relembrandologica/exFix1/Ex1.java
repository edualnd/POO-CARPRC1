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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius, f;
        System.out.println("Digite os graus em Fahrenheit:");
        f = sc.nextFloat();
        celsius =  (5f / 9) * (f - 32);
        System.out.println("A temperatura em Celsius e " + String.format("%.2f", celsius));
    }

}
