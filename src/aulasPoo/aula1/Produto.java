/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.aula1;

/**
 *
 * @author cg3034011
 */
public class Produto {
    String nome;
    float precoCusto;
    float precoVenda;
    float porcent = 1.3f;
    public Produto() {
        System.out.println("Construindo... ");
    }
    
    public Produto(String nome, float precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = calculoPrecoVenda(precoCusto);
    }
    public float calculoPrecoVenda(float custo){
        return custo * this.porcent;
    }
}
