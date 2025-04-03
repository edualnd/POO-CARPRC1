/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.aula1;

/**
 *
 * @author cg3034011
 */
public class exEncapsulamento {
    
    private String nome;
    private float precoCusto;
    private float precoVenda;
    
    
    public exEncapsulamento() {
        System.out.println("Construindo... ");
    }
    
    public exEncapsulamento(String nome, float precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = calculoPrecoVenda(precoCusto, 1.3f);
    }
    public float calculoPrecoVenda(float custo, float porcent){
        return custo * porcent;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda() {
        this.precoVenda = calculoPrecoVenda(precoCusto, 1.3f);
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }
    
    
}
