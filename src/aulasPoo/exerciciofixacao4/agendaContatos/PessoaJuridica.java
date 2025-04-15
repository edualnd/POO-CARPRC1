/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4.agendaContatos;

/**
 *
 * @author cg3034011
 */
public class PessoaJuridica extends Pessoa{

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String razaoSocial, String nome, String endereco, String email) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }
    
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    @Override
    public String toString(){
        return super.toString() + "%nCNPJ: " + cnpj + "%nInscricao Estadual: " + inscricaoEstadual + "%nRazao Social: " + razaoSocial;
    }
}
