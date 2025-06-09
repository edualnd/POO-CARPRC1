package aulasPoo.exerciciofixacao5.exfix2;

public interface IProdutoFabricado extends IProduto{
    int getNumeroIngredientes();
    IProduto getIngrediente(int numero);
}
