/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/exfix5.java to edit this template
 */
package relembrandologica.exFix1;

import java.util.Scanner;

/**
 *
 * @author duda
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float capital, taxa, prestacao, juros;
      int tempo;
        System.out.println("Digite o capital inicial, taxa de juros(5% -> 0.05), tempo(mes)");
        capital = sc.nextFloat();
        taxa = sc.nextFloat();
        tempo = sc.nextInt();
        juros = capital * taxa * tempo;
        prestacao = (capital+juros) / tempo;
        System.out.println("Valor da prestacao " + prestacao);
    }
    
}
