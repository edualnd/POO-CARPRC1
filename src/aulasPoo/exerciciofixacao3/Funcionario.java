/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao3;

/**
 *
 * @author duda
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRg() {
        return rg;
    }
    
    
    public void recebaAumento(double aumento){
        this.salario += aumento;
    }
    public double calculaGanhoAnual(){
        return salario * 12;
    }
}
