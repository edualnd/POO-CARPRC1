/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package aulasPoo.exerciciofixacao4.agendaContatos;



/**
 *
 * @author cg3034011
 */
public class Agenda {
    private Pessoa[] list;
    private int tamanho;
    
    public Agenda() {
        this.list = new Pessoa[5];
        this.tamanho = 0;
    }
    
    public Pessoa[] getList() {
        Pessoa[] items = new Pessoa[tamanho];
        for(int i = 0; i < tamanho; i++){
            items[i] = list[i];
        }
        return items;
    }
    
    public void add(Pessoa n){
        if(tamanho == list.length){
            increaseSize();
        }
        list[tamanho] = n;
        tamanho++;
    }
    
    public void remove(){
        if(tamanho != 0){
            System.out.printf("Removendo list[%d]%n", tamanho-1);
            list[tamanho-1] = null;
            tamanho--;
        }
    }
    private void increaseSize(){
        Pessoa[] newList = new Pessoa[tamanho+5];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        this.list = newList;
    }
    
    public void searchByName(String name){
        for(Pessoa i : getList()){
            if( i.getNome().equals(name)){
                System.out.printf(i.toString());
                System.out.println("");
            }
        }
        
    }
    
    public void searchByIdentity(int documento){
        boolean found = false;
        
        for(PessoaFisica i : getList()){
            if(i.getCpf().equals(documento)){
                System.out.printf(i.toString());
                System.out.println("");
                found = true;
            }
        }
        if(!found){
            for(PessoaJuridica i : getList()){
                if(i.getCnpj().equals(documento)){
                    System.out.printf(i.toString());
                    System.out.println("");
                }
            }
        }
        
        
    }
    
}
