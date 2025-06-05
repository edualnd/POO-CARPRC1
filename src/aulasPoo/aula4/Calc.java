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
public class Calc {
    
    public int div (int a, int b) throws DivByZero {
        if (b == 0)  {
            throw new DivByZero();
        }
        return a/b;
    }   
}
