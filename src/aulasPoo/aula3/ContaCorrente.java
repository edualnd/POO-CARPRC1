package aulasPoo.aula3;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    protected double calcularTarifa() {
        return 2.50;
    }
}
