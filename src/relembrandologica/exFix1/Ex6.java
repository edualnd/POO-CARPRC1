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
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int valor1, valor2;
        System.out.println("Digite o valor 1 e o valor 2:");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        System.out.println(valor1 + " + " + valor2 + " = " + adicao(valor1, valor2));
        System.out.println(valor1 + " - " + valor2 + " = " + subtracao(valor1, valor2));
        System.out.println(valor1 + " * " + valor2 + " = " + multiplicacao(valor1, valor2));
        System.out.println(valor1 + " / " + valor2 + " = " + String.format("%.1f",divisao(valor1, valor2)));
    }
    public static int adicao(int v1, int v2){
        return v1 + v2;
    }
    public static int subtracao(int v1, int v2){
        return v1 - v2;
    }
    public static int multiplicacao(int v1, int v2){
        return v1 * v2;
    }
    public static float divisao(int v1, int v2){
        return (float)v1 / v2;
    }
   
    
}
