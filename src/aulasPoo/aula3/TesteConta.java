package aulasPoo.aula3;
public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(500.0);
        ContaBancaria cp = new ContaPoupanca(500.0);

        System.out.println("=== Conta Corrente ===");
        cc.depositar(100);
        cc.sacar(50);
        System.out.println("Saldo final: R$" + cc.getSaldo());

        System.out.println("\n=== Conta Poupança ===");
        cp.depositar(100);
        cp.sacar(50);
        System.out.println("Saldo final: R$" + cp.getSaldo());


    }
}


