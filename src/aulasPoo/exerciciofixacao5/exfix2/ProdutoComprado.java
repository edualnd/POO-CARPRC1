package aulasPoo.exerciciofixacao5.exfix2;

public class ProdutoComprado implements IProduto{

    private String nome;
    private float custo;

    public ProdutoComprado(float custo, String nome) {
        this.custo = custo;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getCusto() {
        return custo;
    }
}
