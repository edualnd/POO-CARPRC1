package aulasPoo.exerciciofixacao7.exfix5;

import java.io.*;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ent = 1;
        String disciplina = "CARPRC1";
        do{
            System.out.print("O que deseja fazer: \n"
                    + "[1] Registrar alunos\n"
                    + "[2] Ler dados da disciplina\n"
                    + "Ou finalizar programa [0]\n>>");
            ent = sc.nextInt();
            switch(ent){
                case 1 -> registrarAlunos(disciplina);
                case 2 -> lerDados(disciplina);
                case 0 -> System.out.println("Programa finalizado");
                default -> System.out.println("Entrada Invalida tente novamente");
            }
        }while(ent!=0);
    }
    public static void registrarAlunos(String disciplina){
        Scanner sc = new Scanner(System.in);
        String nome;
        int codigo, nota1, nota2;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();
            System.out.print("Digite o codigo: ");
            codigo = sc.nextInt();
            System.out.print("Digite o nota 1: ");
            nota1 = sc.nextInt();
            System.out.print("Digite o nota 2: ");
            nota2 = sc.nextInt();

            try{
                FileOutputStream fos = new FileOutputStream(disciplina, true);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeInt(nome.length());
                dos.writeChars(nome);
                dos.writeInt(nota1);
                dos.writeInt(nota2);
                dos.flush();

            }catch (FileNotFoundException e){
                System.out.println("Arquivo nao encontrado");
            } catch (IOException e) {
                System.out.println("Erro ao abrir");
            }

            sc.nextLine();
        }

    }
    private static void lerDados(String disciplina) {
        try {
            FileInputStream fis = new FileInputStream(disciplina);
            DataInputStream dis = new DataInputStream(fis);
            StringBuilder nome = new StringBuilder();
            int[] nota1 = new int[3];
            int[] nota2 = new int[3];
            float media;
            int t = 0;
            while(dis.available()>0){
                int tamanhoNome = dis.readInt();
                for (int i = 0; i < tamanhoNome; i++) {
                    nome.append(dis.readChar());
                }

                nota1[t] = dis.readInt();
                nota2[t] = dis.readInt();

                media = (float)(nota1[t] + nota2[t])/2;
                String situacao = "Aprovado(a)";
                if(media<4){situacao = "Reprovado";}
                else if(media>=4 && media<6){situacao = "IFA";}

                System.out.println("Nome: " + nome);
                System.out.println("Nota 1: " + nota1[t]);
                System.out.println("Nota 2: " + nota2[t]);
                System.out.println("Situação: " + situacao);
                System.out.println("-------------------");
                t++;
            }
            float mediaTurma= 0;
            for (int i=0; i<3;i++){
                mediaTurma+= nota1[i] + nota2[i];
            }
            mediaTurma /= 6;
            System.out.printf("Media da turma: %.2f%n", mediaTurma);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao abrir");
        }
    }
}
