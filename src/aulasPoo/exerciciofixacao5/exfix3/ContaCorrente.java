package aulasPoo.exerciciofixacao5.exfix3;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calcularTributos() {
        return super.obterSaldo() *0.1;
    }
}
