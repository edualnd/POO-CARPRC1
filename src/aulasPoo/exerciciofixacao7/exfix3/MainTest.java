package aulasPoo.exerciciofixacao7.exfix3;

import aulasPoo.exerciciofixacao7.exfix3.agendaContatos.Agenda;
import aulasPoo.exerciciofixacao7.exfix3.agendaContatos.Pessoa;
import aulasPoo.exerciciofixacao7.exfix3.agendaContatos.PessoaFisica;
import aulasPoo.exerciciofixacao7.exfix3.agendaContatos.PessoaJuridica;

import javax.sound.midi.SysexMessage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("O que deseja fazer:\n" +
                "[1] - Adicionar\n" +
                "[2] - Remover\n" +
                "[3] - Procurar pelo nome\n" +
                "[4] - Procurar pelo documento\n" +
                "[5] - Ordernar a agenda\n" +
                "[6] - Salvar a agenda\n" +
                "[0] - Finalizar programa");
        int ent =  sc.nextInt();

        switch(ent){
            case 1 -> adicionar(agenda);
            case 2 -> remover(agenda);
            case 3 -> procurarPorNome(agenda);
            case 4 -> procurarPorDocumento(agenda);
            case 5 -> {
                agenda.sortAgenda();
                System.out.println("Agenda ordenada");
            }
            case 6 -> salvarAgenda(agenda);
            case 0 -> System.out.println("Ate mais");
            default -> System.out.println("Entrada invalida tente novamente");
        }

    }

    private static void salvarAgenda(Agenda agenda) {
        agenda.sortAgenda();
        Pessoa[] pessoas = agenda.getAgenda();
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/aulasPoo/exerciciofixacao7/exfix3/agendaArq/agenda.txt",
                    true);
            try(BufferedWriter bw = new BufferedWriter(fw)) {
                for(Pessoa p: pessoas){

                }

            }catch (IOException e){
                System.out.println("Erro " + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Erro " + e.getMessage());
        }

    }

    private static void procurarPorDocumento(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o documento\n>>");
        int documento = sc.nextInt();

        Pessoa p = agenda.searchByDocument(documento);
        System.out.println(p.toString());
    }

    private static void procurarPorNome(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o nome\n>>");
        String nome = sc.nextLine();

        Pessoa p = agenda.searchByName(nome);
        System.out.println(p.toString());
    }

    private static void remover(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o documento\n>>");
        int documento = sc.nextInt();
        Pessoa p = agenda.searchByDocument(documento);
        if(p==null){
            System.out.println("Pessoa não encontrada");
        }else{
            agenda.removeByIdentity(documento);
            System.out.println("Pessoa removida");
        }

    }

    private static void adicionar(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pessoa juridica ou fisica:\n[1] - Juridica\n [2] - Fisica\n>>");
        int ent = sc.nextInt();
        Pessoa p = null;
        switch(ent){
            case 1 -> p = criarPessoaJuridica();
            case 2 -> p = criarPessoaFisica();
            default -> System.out.println("Opçao invalida");
        }
        if(p!=null){
            agenda.add(p);
            System.out.println("Pessoa adicionada com sucesso");
        }
    }

    private static Pessoa criarPessoaFisica() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja colocar os dados completos?\n[1]- Sim\n[2] - Não\n>>");
        int ent = sc.nextInt();
        Pessoa p = null;
        String name;
        int cpf;
        switch(ent){
            case 1 -> {
                System.out.print("Nome: ");
                name = sc.nextLine();
                System.out.print("Endereço: ");
                String address = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Estado civil: ");
                String maritalStatus = sc.nextLine();
                System.out.print("Data de nascimento: ");
                String birthdate = sc.nextLine();
                System.out.print("CPF: ");
                cpf = sc.nextInt();
                p = new PessoaFisica(name, address, email, cpf,birthdate, maritalStatus);

            }
            case 2 -> {
                System.out.print("Nome: ");
                name = sc.nextLine();
                System.out.print("CPF: ");
                cpf = sc.nextInt();
                p = new PessoaJuridica(cpf, name);
            }
            default -> System.out.println("Opçao invalida");
        }
        return p;
    }

    private static Pessoa criarPessoaJuridica() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja colocar os dados completos?\n[1]- Sim\n[2] - Não\n>>");
        int ent = sc.nextInt();
        Pessoa p = null;
        String name;
        int cnpj;
        switch(ent){
            case 1 -> {
                System.out.print("Nome: ");
                name = sc.nextLine();
                System.out.print("Endereço: ");
                String address = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Numero de registro: ");
                String registrationNumber = sc.nextLine();
                System.out.print("Nome da empresa: ");
                String legalName = sc.nextLine();
                System.out.print("CNPJ: ");
                cnpj = sc.nextInt();
                p = new PessoaJuridica(name, address, email, cnpj, registrationNumber, legalName);

            }
            case 2 -> {
                System.out.print("Nome: ");
                name = sc.nextLine();
                System.out.print("CNPJ: ");
                cnpj = sc.nextInt();
                p = new PessoaJuridica(cnpj, name);
            }
            default -> System.out.println("Opçao invalida");
        }
        return p;
    }
}

