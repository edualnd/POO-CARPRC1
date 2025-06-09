/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/exfix5.java to edit this template
 */
package aulasPoo.aula5;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author julia
 */
public class Exemplo_FileReader {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre nome do arquivo para leitura: ");
        File f = new File(nomeArquivo);
        try {
            FileReader fr = new FileReader(f);
            int c = -1;
            String res = "" ;
            while ((c = fr.read()) != -1){
                res += (char) c;
            }
            JOptionPane.showMessageDialog(null, "Lendo o arquivo " + nomeArquivo +": \n\n " + res);
            fr.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }  
}
