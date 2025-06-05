/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulasPoo.aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Juliana
 */
public class Excecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Calc calc = new Calc();
        try{
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
            JOptionPane.showMessageDialog(null, x + " / " + y + " = " + calc.div(x,y));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, " Formato inválido! \n\n "
                    + "Detalhes do erro: " + e.getMessage());
        }
        catch (DivByZero e) {
            JOptionPane.showMessageDialog(null, " Operação Inválida! \n\n "
                    + "Detalhes do erro: " + e.toString() + e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null, "Execução concluída");
        }  
    }   
}    
        
        /*       
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
            JOptionPane.showMessageDialog(null, x + " / " + y + " = " + x/y);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, " Formato inválido! \n\n "
                    + "Detalhes do erro: " + e.getMessage());
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, " Operação Inválida! \n\n "
                    + "Detalhes do erro: " + e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null, "Execução concluída");
        }
        */    
