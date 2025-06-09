package aulasPoo.exerciciofixacao5.exfix4;

public class Leite extends Produto{
    private int validade;

    public Leite(String nome, double preco, int validade) {
        super(nome, preco);
        this.validade = validade;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
    public double getCustoBeneficio(){
        return  validade/ super.getPreco();
    }
    @Override
    public int compareTo(Produto o) {
        Leite l = (Leite) o;
        return Double.compare(getCustoBeneficio(), l.getCustoBeneficio());
    }
}
