/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.aula5;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Exemplo_FileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre nome do arquivo: ");
        String texto = JOptionPane.showInputDialog("Digite um texto a ser escrito no arquivo " + nomeArquivo + ": ");
        try (FileWriter fw = new FileWriter(nomeArquivo, true)) {
            fw.write(texto);
            fw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, " Erro no arquivo de escrita! \n\n Detalhes do erro: " + e.getMessage());
        }
    }  
}
