/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package aulasPoo.exerciciofixacao4.agendaContatos;

/**
 *
 * @author cg3034011
 */
public class Pessoa {
    private String name;
    private String address;
    private String email;
    
    public Pessoa(String name) {
        this.name = name;
    }
    
    public Pessoa(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Nome: " + name + "%nEndereco: " + address + "%nEmail: " + email;
    }
    public int getDocument(){
        return 0;
    }
}
