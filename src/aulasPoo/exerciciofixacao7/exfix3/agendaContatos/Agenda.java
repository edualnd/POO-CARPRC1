/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package aulasPoo.exerciciofixacao7.exfix3.agendaContatos;


/**
 *
 * @author cg3034011
 */
public class Agenda {
    private Pessoa[] agenda;
    private int size;
    
    public Agenda() {
        this.agenda = new Pessoa[5];
        this.size = 0;
    }
    
    public Pessoa[] getAgenda() {
        Pessoa[] items = new Pessoa[size];
        for(int i = 0; i < size; i++){
            items[i] = agenda[i];
        }
        return items;
    }
    
    public void add(Pessoa n){
        if(size == agenda.length){
            increaseSize();
        }
        agenda[size] = n;
        size++;
    }
    
    public void removeByIdentity(int document){
        if(size != 0){
            int i = 0;
            for(Pessoa a : getAgenda()){
                if( a.getDocument() != document ){
                    agenda[i] = a;
                   i++;
                }  
            }
            size--;
        }
    }
    private void increaseSize(){
        Pessoa[] newAgenda = new Pessoa[size+5];
        for(int i = 0; i < agenda.length; i++){
            newAgenda[i] = agenda[i];
        }
        this.agenda = newAgenda;
    }
    
    public Pessoa searchByName(String name){
        Pessoa rres = null;
        for(Pessoa i : getAgenda()){
            if( i.getName().equals(name)){
                rres = i;
            }
        }
        return rres;
    }
    
    public Pessoa searchByDocument(int document){
        Pessoa res = null;
        for(Pessoa i : getAgenda()){
            if(i.getDocument() == (document)){
                res = i;
            }
        }
        
        return res;
        
    }
    
    public void sortAgenda(){
        Pessoa[] list = getAgenda();
        int pf = 0;
        
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                //Separar PJ e PF
                if (list[j] instanceof PessoaJuridica && list[j+1] instanceof PessoaFisica) {
                    Pessoa temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                //Ordenar por cpf/cnpj
                boolean isSameClass = list[j].getClass() == list[j+1].getClass();
                
                if (list[j].getDocument()> list[j+1].getDocument() && isSameClass) {
                    Pessoa temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
        
        //Nova agenda
        for(int i = 0; i < list.length; i++){
            agenda[i] = list[i];
        }
    }
    
    
}
