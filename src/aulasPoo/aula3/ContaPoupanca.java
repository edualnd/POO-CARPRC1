package aulasPoo.aula3;
public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    protected double calcularTarifa() {
        return 0.0;
    }
}

