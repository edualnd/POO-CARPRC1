
package aulasPoo.exerciciofixacao3;

/**
 *
 * @author duda
 */
public class ContaBancaria {
    private String numConta;
    private float saldo = 0;

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNumConta() {
        return numConta;
    }
    public void extrato(){
        System.out.printf("Num. Conta %s%nSaldo bancario: %.2f%n", getNumConta(), saldo);
    }
    
    public void saque(float retirada){
        if(retirada > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= retirada;
        }
        extrato();
    }
    
    public void deposito(float depositar){
        saldo += depositar;
        extrato();
    }
}
