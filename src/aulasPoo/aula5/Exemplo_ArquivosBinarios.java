
package aulasPoo.aula5;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Exemplo_ArquivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre nome do arquivo binário: ");
        String texto = JOptionPane.showInputDialog("Digite um texto a ser escrito no arquivo " + nomeArquivo + ": ");
        try {
            FileOutputStream fos = new FileOutputStream(nomeArquivo, true);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeChars(texto);
            dos.flush();
            dos.close();
        }
        catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Falha na criação do arquivo");
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null,"Falha na escrita ou fechamento");
        }
        
        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            DataInputStream dis = new DataInputStream(fis);
            String res = "";
            int c = -1;
            while((c = dis.read())!= -1) {
                res += (char) c;
            }
            JOptionPane.showMessageDialog(null, res);
            System.out.println(res);
            dis.close();
        }
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo inexistente");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura ou fechamento");
        }
        
    }  
}
