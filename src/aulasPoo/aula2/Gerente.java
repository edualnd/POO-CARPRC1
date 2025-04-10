/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.aula2;

/**
 *
 * @author cg3034011
 */
public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

    public Gerente(String usuario, String senha, String nome, float salario) {
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public float calcularBonificacao(){
        return super.calcularBonificacao()*6 + 100;
    }
}
