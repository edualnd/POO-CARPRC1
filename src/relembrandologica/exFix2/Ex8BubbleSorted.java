package relembrandologica.exFix2;



import javax.swing.JOptionPane;


/**
 *
 * @author cg3034011
 */
public class Ex8BubbleSorted {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
       int tam = 0;
       
       tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da array:"));
       
       int vet[] = new int[tam];
       boolean isSorted;
       int count, temp;
       String vetorOriginal = "", VetorOrdenado = "";
       
       for (int i = 0; i < tam; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Array[" + i + "]"));
       }
       
       for (int i = 0; i < vet.length; i++) {
           if(i == vet.length -1){
            vetorOriginal = vetorOriginal + vet[i] + " ";
           }else{
            vetorOriginal = vetorOriginal + vet[i] + ", ";
           }
        }
       
        do {      
            count = 0;
            
            for (int i = 0; i < vet.length; i++) {
                if(i != vet.length - 1){
                    
                    if(vet[i]> vet[i+1]){
                       temp = vet[i];
                       vet[i] = vet[i+1];
                       vet[i+1] = temp;
                    }
                }
            }
            
            //Checa se esta ordenado
            for (int i = 0; i < vet.length; i++) {
                if(i != vet.length - 1){
                    if(vet[i]<= vet[i+1]){
                       count++;
                    }
                }
            }
            isSorted = count == vet.length -1;
        } while (!isSorted);
 
        for (int i = 0; i < vet.length; i++) {
           if(i == vet.length -1){
            VetorOrdenado = VetorOrdenado + vet[i] + " ";
           }else{
            VetorOrdenado = VetorOrdenado + vet[i] + ", ";
           }
        }
        JOptionPane.showMessageDialog(null, "Vetor Original: {" + vetorOriginal + "}\n" + "Vetor Ordenado: {" + VetorOrdenado + "}" ); 
        
        }
        
    }
    
 
