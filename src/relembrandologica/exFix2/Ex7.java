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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam;
        
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual vai ser o tamanho de v2"));
        
        int count = tam;
        int v1[] = new int[tam*2];
        int v2[] = new int[tam];
        boolean isOnV1 = false;
        //Valores de v1
        for (int i = 0; i < tam; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "v1["+ i+"]"));
        }
        //Valores de v2
        for (int i = 0; i < tam; i++) {
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "v2["+ i+"]"));
        }
        System.out.println("V1");
        for (int i = 0; i < tam; i++) {
            System.out.printf(v1[i] + " ");
        }
        System.out.println("V2");
        for (int i = 0; i < v2.length; i++) {
            System.out.printf(v2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if(v2[i] == v1[j]){
                    isOnV1 = true;
                }
            }
            if(!isOnV1){
               v1[count] = v2[i];
               count++;
            }
            isOnV1 = false;
        }
        
        
        for (int i = 0; i < count; i++) {
            System.out.printf(v1[i] + " ");
        }
    }

}
