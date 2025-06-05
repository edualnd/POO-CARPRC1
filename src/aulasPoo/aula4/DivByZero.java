/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulasPoo.aula4;

/**
 *
 * @author Juliana
 */
public class DivByZero extends ArithmeticException{
    
    public DivByZero(){
        super("Tentativa de divisão por zero!");
    }
    
    public DivByZero(String msg){
        super(msg);
    }
    
    @Override
    public String toString(){
        
        return "Divisão por zero: ";
    }
}
