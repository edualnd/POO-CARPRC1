package aulasPoo.aula3;

public class TesteContaTransferencia {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(500.0);
        ContaBancaria cp = new ContaPoupanca(500.0);
        ContaBancaria cd = new ContaDigital(500.0);

        System.out.println("=== Conta Corrente ===");
        cc.depositar(100);
        cc.sacar(50);
        System.out.println("Saldo final: R$" + cc.getSaldo());

        System.out.println("\n=== Conta Poupança ===");
        cp.depositar(100);
        cp.sacar(50);
        System.out.println("Saldo final: R$" + cp.getSaldo());

        System.out.println("\n=== Conta Digital ===");
        cd.depositar(100);
        cd.sacar(50);
        System.out.println("Saldo final: R$" + cd.getSaldo());

	System.out.println("\n=== Transferencia da Conta Digital para a Conta Poupança ===");
        System.out.println("Saldo inicial Conta Digital: R$" + cd.getSaldo());
        System.out.println("Saldo inicial Conta Poupança: R$" + cp.getSaldo());

        ((ContaDigital) cd).transferir(cp, 200.0);

        System.out.println("\nSaldo após transferência:");
        System.out.println("Conta Digital: R$" + cd.getSaldo());
        System.out.println("Conta Poupança: R$" + cp.getSaldo());
    }
}

