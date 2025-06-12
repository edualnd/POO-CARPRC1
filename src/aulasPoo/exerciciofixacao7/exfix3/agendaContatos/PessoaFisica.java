/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package aulasPoo.exerciciofixacao7.exfix3.agendaContatos;

/**
 *
 * @author cg3034011
 */
public class PessoaFisica extends Pessoa {
    private int cpf;
    private String birthdate;
    private String maritalStatus;

    public PessoaFisica(int cpf, String name) {
        super(name);
        this.cpf = cpf;
    }

    public PessoaFisica(String name, String address, String email, int cpf, String birthdate, String maritalStatus) {
        super(name, address, email);
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.maritalStatus = maritalStatus;
    }
    
    
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    public String getBirthdate() {
        return birthdate;
    }
    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    @Override
    public String toString(){
        return super.toString() + "%nCPF: " + cpf + "%nData de Nascimento: " + birthdate + "%nEstado Civil: " + maritalStatus;
    }
    
    @Override
    public int getDocument(){
        return cpf;
    }
}
