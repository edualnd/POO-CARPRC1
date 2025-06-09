package aulasPoo.exerciciofixacao5.exfix3;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public void sacar(double valor){
        if(valor>saldo){
            System.out.println("Saldo invalido");

        }else{
            saldo-=valor;
        System.out.println("Saque feito com sucesso");
        }
    }
    public void depositar(double valor){
            saldo+=valor;
            System.out.println("Deposito feito com sucesso");
    }
    public double obterSaldo(){
        return saldo;
    }
}
