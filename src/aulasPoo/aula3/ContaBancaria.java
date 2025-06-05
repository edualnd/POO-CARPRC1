package aulasPoo.aula3;

public abstract class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        double tarifa = calcularTarifa();
        if (valor >= tarifa) {
            creditar(valor - tarifa);
            System.out.println("Depósito: R$" + valor + " | Tarifa: R$" + tarifa);
        } else {
            System.out.println("Valor insuficiente para cobrir a tarifa.");
        }
    }

    public void sacar(double valor) {
        double tarifa = calcularTarifa();
        double total = valor + tarifa;
        if (total <= saldo) {
            debitar(total);
            System.out.println("Saque: R$" + valor + " | Tarifa: R$" + tarifa);
        } else {
            System.out.println("Saldo insuficiente para saque com tarifa.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos protegidos para subclasses
    protected void creditar(double valor) {
        this.saldo += valor;
    }

    protected void debitar(double valor) {
        this.saldo -= valor;
    }

    protected abstract double calcularTarifa();
}
