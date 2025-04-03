
package aulasPoo.aula1;

import java.util.Scanner;

/**
 *
 * @author cg3034011
 */
public class aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o codigo deseja rodar: ");
        System.out.printf("1 - exemplo%n"
                + "2 - vetorDeObjetos%n"
                + "3 - classeComContrutor%n"
                + "4 - Encapsulamento%n");
        System.out.printf(">> ");
        ent = sc.nextInt();
        switch(ent){
            case 1 -> exemplo();
            case 2 -> vetorDeObjetos();
            case 3 -> classeComContrutor();
            case 4 -> encapsulamento();
            default -> System.out.println("Não encontrado");
        }
    }

    private static void exemplo() {
        Exemplo1 Eduarda = new Exemplo1();
        
        Eduarda.nome = "Eduarda";
        Eduarda.idade = 19;
        Eduarda.nacionalidade = "Brasileira";
        Eduarda.profissao = "Estudante";
        
        System.out.println("Nome: " + Eduarda.nome);
        System.out.println("Idade: " + Eduarda.idade);
        System.out.println("Nacionalidade: " + Eduarda.nacionalidade);
        System.out.println("Profissao: " + Eduarda.profissao);
    }

    private static void vetorDeObjetos() {
        Scanner sc = new Scanner(System.in);
        Produto p[] = new Produto[2];

        
        for (Produto p1 : p) {
            p1 = new Produto();
            System.out.println("Nome do produto:");
            p1.nome = sc.next();
            System.out.println("Preco de custo:");
            p1.precoCusto = sc.nextFloat();
            p1.precoVenda = p1.calculoPrecoVenda(p1.precoCusto);
        }
        for(Produto p1 : p) {
            System.out.println("Nome: " + p1.nome + " || Venda: " + p1.precoVenda + " || Custo: " + p1.precoCusto);
        }
    }

    private static void classeComContrutor() {
        Produto f[] = new Produto[2];
        
        //Sem Contrutor
        f[0] = new Produto();
        f[0].nome = "Agua";
        f[0].precoCusto =  10;
        f[0].precoVenda =  f[0].calculoPrecoVenda(f[0].precoCusto);
        
        //Contrutor
        f[1] = new Produto("Bolacha", 10);
        
        for(Produto p1 : f) {
            System.out.println("Nome: " + p1.nome + " || Venda: " + p1.precoVenda + " || Custo: " + p1.precoCusto);
        }
    }

    private static void encapsulamento() {
        
        exEncapsulamento produto1 = new exEncapsulamento();
        produto1.setNome("Sabao");
        produto1.setPrecoCusto(10);
        produto1.setPrecoVenda();
        
        System.out.println("Nome: " +produto1.getNome());
        System.out.println("Custo: " +produto1.getPrecoCusto());
        System.out.println("Venda: " +produto1.getPrecoVenda());
    }
}
