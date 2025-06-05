/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.aula5;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Exemplo_Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomeArquivo = JOptionPane.showInputDialog("Entre com o nome do arquivo ou diretório: ");
        File file = new File(nomeArquivo);
        System.out.println(file.getPath());
        if (file.isDirectory()){
            System.out.println("É um diretório");
            String arquivos[] = file.list();
            //for(int i = 0 ; i < arquivos.length ; i++){
            for (String arquivo : arquivos) {
                System.out.println(arquivo);
            }
        }
        else {
            System.out.println("É um arquivo");
            System.out.println("Tamanho: " + file.length());
        }
    }   
}
