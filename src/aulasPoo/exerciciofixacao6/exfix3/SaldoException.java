package aulasPoo.exerciciofixacao6.exfix3;

public class SaldoException extends RuntimeException {
    public SaldoException() {
        super("Saldo insuficiente");
    }
}
