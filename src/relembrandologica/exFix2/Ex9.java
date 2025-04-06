
package relembrandologica.exFix2;



import javax.swing.JOptionPane;


/**
 *
 * @author cg3034011
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int lin=5, col=5;
        lin = Integer.parseInt(JOptionPane.showInputDialog("Numero de linhas "));
         col = Integer.parseInt(JOptionPane.showInputDialog("Numero de colunas "));
    

    int matriz[][] = new int[lin][col];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz["+ i+"]["+j+"]"));
            }
        }
        int min, max = 0,lMax = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]> max){
                    max = matriz[i][j];
                    lMax = i;
                }
            }
        }
        min = matriz[lMax][0];
        for(int j = 0; j < matriz[lMax].length; j++) {
            if(matriz[lMax][j] < min){
                min = matriz[lMax][j];
            }
        }
        
        
        
        
        //Imprimir
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.printf(matriz1[j] + " ");
            }
            System.out.println("");
        }
        JOptionPane.showMessageDialog(null, "MINIMAX = "+ min);
    }
}
    
 
