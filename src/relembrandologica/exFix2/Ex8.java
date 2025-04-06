
package relembrandologica.exFix2;



import javax.swing.JOptionPane;


/**
 *
 * @author cg3034011
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int tam = 0;
       tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da array:"));

       int vet[] = new int[tam];
       int vetOriginal[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Array[" + i + "]"));
            vetOriginal[i] = vet[i];
        }
       int maior = 0, index = 0;
       int vetSorted[] = new int[tam];
       
        for (int n = tam-1; n >= 0; n--) {
            for (int i = 0; i < tam; i++) {
                if(vet[i]>= maior){
                    maior = vet[i];
                    index = i;
                }
            }
            
                vetSorted[n] = maior;
                vet[index] = -1;
                maior = 0;
        }
 
       System.out.printf("Vetor original: ");
       for (int i = 0; i < tam; i++) {
            System.out.printf(" " + vetOriginal[i]);   
        }
        System.out.printf("\nVetor em ordem crescente: ");
        for (int i = 0; i < tam; i++) {
            System.out.printf(" " + vetSorted[i]);  
        }
        
        }
        
    }
    
 
