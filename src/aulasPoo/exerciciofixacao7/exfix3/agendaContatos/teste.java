/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/exfix5.java to edit this template
*/
package aulasPoo.exerciciofixacao7.exfix3.agendaContatos;

/**
 *
 * @author cg3034011
 */
public class teste {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda list = new Agenda();
        
        PessoaJuridica pj1 = new PessoaJuridica(100000001, "Juridica 1");
        PessoaJuridica pj2 = new PessoaJuridica(100000002, "Juridica 2");
        PessoaJuridica pj3 = new PessoaJuridica(100000003, "Juridica 3");
        PessoaJuridica pj4 = new PessoaJuridica(100000004, "Juridica 4");
        PessoaJuridica pj5 = new PessoaJuridica(100000005, "Juridica 5");
        PessoaJuridica pj6 = new PessoaJuridica(100000006, "Juridica 6");
        PessoaJuridica pj7 = new PessoaJuridica(100000007, "Juridica 7");
        PessoaFisica pf1 = new PessoaFisica(111111111, "Fisica 1");
        PessoaFisica pf2 = new PessoaFisica(222222222, "Fisica 2");
        PessoaFisica pf3 = new PessoaFisica(333333333, "Fisica 3");
        PessoaFisica pf4 = new PessoaFisica(444444444, "Fisica 4");
        PessoaFisica pf5 = new PessoaFisica(555555555, "Fisica 5");
        PessoaFisica pf6 = new PessoaFisica(666666666, "Fisica 6");
        PessoaFisica pf7 = new PessoaFisica(777777777, "Fisica 7");
        PessoaFisica pf8 = new PessoaFisica(888888888, "Fisica 8");
        
        list.add(pj3);
        list.add(pf1);
        list.add(pf6);
        list.add(pj7);
        list.add(pf3);
        list.add(pj1);
        list.add(pj5);
        for(Pessoa a : list.getAgenda()){
            System.out.println(a.getName() + " document -- " + a.getDocument());
        }
        System.out.println("ouch");
        list.add(pf8);
        list.add(pf2);
        list.add(pj2);
        list.add(pf5);
        list.add(pj6);
        list.add(pf7);
        list.add(pf4);
        list.add(pj4);
        
        list.sortAgenda();
        list.removeByIdentity(888888888);
        list.removeByIdentity(444444444);
        list.removeByIdentity(888888888);
        for(Pessoa a : list.getAgenda()){
            System.out.println(a.getName() + " document -- " + a.getDocument());
        }
        
        
        
    }
    
}
