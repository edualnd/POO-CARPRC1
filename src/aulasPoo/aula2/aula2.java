
package aulasPoo.aula2;

/**
 *
 * @author cg3034011
 */
public class aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g = new Gerente("MariaFinance",  "Maria123" ,"Maria", 1000);
        Funcionario f = new Funcionario("Joao", 1000);
        System.out.println(g.getNome() + " Bonificacao " + g.calcularBonificacao());
        System.out.println(f.getNome() + " Bonificacao " + f.calcularBonificacao());

       
    }
    
}
