package aulasPoo.exerciciofixacao5.exfix3;

public class TestaTributavel {
    public static void main(String[] args) {
        SeguroDeVida sg = new SeguroDeVida();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(500);
        cp.depositar(200);

        System.out.println(cc.obterSaldo());
        System.out.println(cp.obterSaldo());

        System.out.println(cc.calcularTributos());
        System.out.println(sg.calcularTributos());

        cc.sacar(500);
        System.out.println(cc.calcularTributos());
    }
}
