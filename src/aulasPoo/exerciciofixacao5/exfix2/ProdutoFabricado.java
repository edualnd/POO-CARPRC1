package aulasPoo.exerciciofixacao5.exfix2;

public class ProdutoFabricado implements IProdutoFabricado{

    private String nome;
    private IProduto[] ingredientes;

    public ProdutoFabricado(String nome, IProduto ingrediente) {
        this.ingredientes = new IProduto[10];
        this.nome = nome;
    }

    @Override
    public int getNumeroIngredientes() {
        return ingredientes.length;
    }

    @Override
    public IProduto getIngrediente(int numero) {
        return ingredientes[numero+1];
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getCusto() {
        float custo = 0;
        for(IProduto x: ingredientes) {
            custo += x.getCusto();
        }
        return custo;
    }
}
