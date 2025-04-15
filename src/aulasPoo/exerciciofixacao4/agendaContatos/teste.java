/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasPoo.exerciciofixacao4.agendaContatos;

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
        PessoaFisica p1 = new PessoaFisica("Ana Clara", "Rua das Flores, 123", "ana.clara@email.com", "123.456.789-00", "1990-05-12", "Solteira");
        PessoaFisica p2 = new PessoaFisica("Bruno Souza", "Av. Paulista, 456", "bruno.souza@email.com", "234.567.890-11", "1985-08-23", "Casado");
        PessoaFisica p3 = new PessoaFisica("Carla Mendes", "Rua Azul, 789", "carla.mendes@email.com", "345.678.901-22", "1992-03-10", "Divorciada");
        PessoaFisica p4 = new PessoaFisica("Diego Lima", "Rua Verde, 321", "diego.lima@email.com", "456.789.012-33", "1988-11-17", "Solteiro");
        PessoaFisica p5 = new PessoaFisica("Eduarda Silva", "Rua do Sol, 654", "eduarda.silva@email.com", "567.890.123-44", "1995-01-30", "Casada");
        PessoaFisica p6 = new PessoaFisica("Felipe Rocha", "Av. Central, 987", "felipe.rocha@email.com", "678.901.234-55", "1993-07-15", "Solteiro");
        PessoaFisica p7 = new PessoaFisica("Gabriela Castro", "Rua das Palmeiras, 147", "gabriela.castro@email.com", "789.012.345-66", "1987-04-28", "Viúva");
        PessoaFisica p8 = new PessoaFisica("Henrique Costa", "Travessa do Norte, 258", "henrique.costa@email.com", "890.123.456-77", "1991-09-05", "Casado");
        PessoaFisica p9 = new PessoaFisica("Isabela Martins", "Rua Aurora, 369", "isabela.martins@email.com", "901.234.567-88", "1996-12-22", "Solteira");
        PessoaFisica p10 = new PessoaFisica("João Pedro", "Av. das Nações, 159", "joao.pedro@email.com", "012.345.678-99", "1989-06-03", "Divorciado");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.searchByName("João Pedro");
        
        
    }
    
}
