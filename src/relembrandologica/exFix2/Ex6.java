/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/exfix5.java to edit this template
 */
package relembrandologica.exFix2;


import javax.swing.JOptionPane;

/**
 *
 * @author cg3034011
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[6];
        for(int i =0; i < v1.length; i++){
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite para a posicao " + i));
        }
        for(int i =0; i < v2.length; i++){
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite para a posicao " + i));
        }
       
        for(int i = v1.length; i > 0; i--){
            v3[i] = v1[i-1] + v2[i-1] + v3[i];
            if(v3[i]>=10){
            v3[i-1] = v3[i] / 10;
            v3[i] = v3[i] - 10;
            }
        }
        System.out.printf("V[1] = ");
        for (int i = 0; i < v1.length; i++) {
            
            if(i == v1.length - 1){
                System.out.printf(" " + v1[i] + "\n");
            } else{
                System.out.printf(" " + v1[i]);
            }
        }
        
        System.out.printf("V[2] = ");
        for (int i = 0; i < v2.length; i++) {
            
            if(i == v2.length - 1){
                System.out.printf(" " + v2[i] + "\n");
            } else{
                System.out.printf(" " + v2[i]);
            }
        }
        System.out.println("--------------------");
        System.out.printf("V[3] =");
        for (int i = 0; i < v3.length; i++) {
            
            if(i == v3.length - 1){
                System.out.printf(" " + v3[i] + "\n");
            } else{
                System.out.printf(" " + v3[i]);
            }
        }
    }
    
    
}
/*
9
9
18

*/