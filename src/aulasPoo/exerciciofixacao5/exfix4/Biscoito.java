package aulasPoo.exerciciofixacao5.exfix4;

public class Biscoito extends Produto{
    private int qtdComponentesCancerigenos;

    public Biscoito(String nome, double preco, int qtdComponentesCancerigenos) {
        super(nome, preco);
        this.qtdComponentesCancerigenos = qtdComponentesCancerigenos;
    }

    public int getQtdComponentesCancerigenos() {
        return qtdComponentesCancerigenos;
    }

    public void setQtdComponentesCancerigenos(int qtdComponentesCancerigenos) {
        this.qtdComponentesCancerigenos = qtdComponentesCancerigenos;
    }
    public double getCustoBeneficio(){
        return (100-qtdComponentesCancerigenos)/ super.getPreco();
    }
    @Override
    public int compareTo(Produto o) {
        Biscoito  b = (Biscoito) o;
        return Double.compare(getCustoBeneficio(), b.getCustoBeneficio());
    }
}
