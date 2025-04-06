/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relembrandologica.exFix2;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3034011
 */
public class Ex5Ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String password;
        boolean isValid;
        
        password = JOptionPane.showInputDialog("Digite uma senha");
        isValid = valida(password);
        
        if(isValid){
            JOptionPane.showMessageDialog(null, "Senha valida");
        } else{
            JOptionPane.showMessageDialog(null, "Senha invalida\nUma senha valida precisa ter:\n-Numero\n-Letra maiuscula\n-Letra minuscula\n-Caracter especial\n-Pelo menos 8 digitos");
        }
    }
    public static boolean valida(String senha){
        boolean isNumber, isUpper, isLower, isSpecialChar, isLength;
        int c;
        isNumber = false;
        isUpper = false;
        isLower = false;
        isSpecialChar = false;
        isLength= senha.length()>=8;
        
        for(int i=0; i< senha.length();i++){
           c = senha.charAt(i) - 0;
            if(c>= 48 && c<=57){ isNumber = true; }
            if(c>= 97 && c<=122){ isLower = true; }
            if(c>= 65 && c<=90){ isUpper = true; }
            
            if(!(c>= 48 && c<=57) && !(c>= 97 && c<=122) && !(c>= 65 && c<=90)){
                isSpecialChar = true;
            }
            
        }
        return isLength && isUpper && isLower && isNumber && isSpecialChar;
    }
    
}
