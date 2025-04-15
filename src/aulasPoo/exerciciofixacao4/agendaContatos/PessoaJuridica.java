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

    private int cnpj;
    private String registrationNumber;
    private String legalName;

    public PessoaJuridica(int cnpj, String name) {
        super(name);
        this.cnpj = cnpj;
    }
  
    
    public PessoaJuridica(String name, String address, String email, int cnpj, String registrationNumber, String legalName) {
        super(name, address, email);
        this.cnpj = cnpj;
        this.registrationNumber = registrationNumber;
        this.legalName = legalName;
    }
    


    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
    @Override
    public String toString(){
        return super.toString() + "%nCNPJ: " + cnpj + "%nInscricao Estadual: " + registrationNumber + "%nRazao Social: " + legalName;
    }
    
    @Override
    public int getDocument(){
        return cnpj;
    }
}
