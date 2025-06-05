package aulasPoo.aula3;
public class ContaDigital extends ContaBancaria implements Transferencia {

    public ContaDigital(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    protected double calcularTarifa() {
        return 1.00;
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        double tarifa = calcularTarifa();
        double total = valor + tarifa;
        if (getSaldo() >= total) {
            debitar(total);
            destino.depositar(valor);
            System.out.println("Transferência: R$" + valor + " | Tarifa: R$" + tarifa);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}

