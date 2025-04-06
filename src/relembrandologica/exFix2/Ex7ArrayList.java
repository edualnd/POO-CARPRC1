
package relembrandologica.exFix2;


import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author cg3034011
 */
public class Ex7ArrayList {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        int num;
        do {            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros da array v1, caso queira ir para a v2 digite 0"));
            if(num != 0){
                v1.add(num);
            }
        } while (num != 0);
        
        
       do {            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros da array v2, caso terminar digite 0"));
            if(num != 0){
                v2.add(num);
            }
        } while (num != 0);
       
       
        for (int i = 0 ; i < v2.size(); i++) {
            if(!v1.contains(v2.get(i))){
                v1.add(v2.get(i));
            }
        }
       
        JOptionPane.showMessageDialog(null, v1);
        
        }
        
    }
    
 
