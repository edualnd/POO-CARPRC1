/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4.agendaContatos;

/**
 *
 * @author cg3034011
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    @Override
    public String toString(){
        return super.toString() + "%nCPF: " + cpf + "%nData de Nascimento: " + dataNascimento + "%nEstado Civil: " + estadoCivil;
    }
}
