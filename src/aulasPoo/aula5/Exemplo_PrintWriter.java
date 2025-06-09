/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/exfix5.java to edit this template
 */
package aulasPoo.aula5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Exemplo_PrintWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre nome do arquivo: ");
        File arquivo = new File(nomeArquivo); 
        String texto = JOptionPane.showInputDialog("Digite um texto a ser escrito no arquivo " + nomeArquivo + ": ");
        
        try (PrintWriter pw = new PrintWriter(arquivo)) {
            pw.write(texto);
            pw.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }   
    }   
}
