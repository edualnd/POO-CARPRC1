/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relembrandologica.exFix2;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author cg3034011
 */
public class Ex5Regex {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        String password;
        boolean valid;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Crie uma senha: ");
        password = sc.next();
        valid = verificarSenha(password);
        if(valid){
            System.out.println("Senha valida");
        } else{
            System.out.println("Senha invalida");
        }
    }

    private static boolean verificarSenha(String password) {
        
        //Numero, letra maiuscula e minuscula
        Pattern numAndChar = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+$");
        Matcher matchNumAndChar = numAndChar.matcher(password);
        boolean foundNumAndChar = matchNumAndChar.find();
        //Caracter especial
        Pattern specialChar = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
        Matcher matchSpecialChar = specialChar.matcher(password);
        boolean foundSpecialChar = matchSpecialChar.find();
        //Maior que oito
        boolean isSize = password.length()>=8;
        
        return foundNumAndChar && foundSpecialChar && isSize;
    }

    

    
    
    
    
}
