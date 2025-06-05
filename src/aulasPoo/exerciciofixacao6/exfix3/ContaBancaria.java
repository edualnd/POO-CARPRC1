package aulasPoo.exerciciofixacao6.exfix3;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo+= valor;
    }

    public void sacar(double valor) {
        if(valor>saldo){
            throw new SaldoException();
        }else{
            saldo-=valor;
        }
    }
}
