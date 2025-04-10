/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.exerciciofixacao4;

/**
 *
 * @author cg3034011
 */
public class ExFixacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assistente f = new Assistente("asasas", "Maria", 1000);
        System.out.println(f.ganhoAnual());
        f.addAumento(100);
        System.out.printf(f.exibeDados());
        
    }
    
}
