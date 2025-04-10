/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4;

/**
 *
 * @author cg3034011
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonificacao(){
        return salario * 0.1f;
    }
    public void addAumento (double valor){
        salario += valor;
    }
    public double ganhoAnual(){
        return salario*12;
    }
    public String exibeDados(){
        return "Nome: " + nome + "%nSalario: " + salario;
        
    }
}
