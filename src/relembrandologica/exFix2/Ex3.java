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
public class Ex3 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int user, computer;
        String winner;
        String[] options = {"Pedra", "Papel", "Tesoura"};
        
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("Entre com a sua jogada:");
        System.out.println("0-Pedra  1-Papel 2-Tesoura");
        
        user = sc.nextInt();
        if(user < 0 || user > 2){
            System.out.println("Entrada Invalida!!");
        }else{
            computer = generator.nextInt(2);
            System.out.println("Voce: "+ options[user]);
            System.out.println("Computer: " + options[computer]);
            winner = game(user, computer);
            System.out.println("VENCEDOR: " + winner);
        }
    }

    private static String game(int user, int computer) {
       
       String[] winner = {"Empate", "Voce", "Computer"};
       int i = 0;
       if(user == computer){
           i = 0;
       } else if(user == 0 && computer == 2){
           i = 1;
       }else if(user == 1 && computer == 0){
           i = 1;
       }else if(user == 2 && computer == 1){
           i = 1;
       }else{
           i = 2;
       }
       return winner[i];
    }

    
    
    
    
}
