package aulasPoo.exerciciofixacao5.exfix4;

public class Shampoo extends Produto{
    private int irritabilidade;

    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    public double getCustoBeneficio(){
        return (100-irritabilidade)/ super.getPreco();
    }
    @Override
    public int compareTo(Produto o) {
        Shampoo s = (Shampoo) o;
        return Double.compare(getCustoBeneficio(), s.getCustoBeneficio());
    }

}
