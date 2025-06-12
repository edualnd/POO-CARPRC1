package aulasPoo.exerciciofixacao7.exfix7;

import java.io.*;
import java.util.Scanner;

public class exfix7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a origem do arquivo: ");
        String origem = sc.nextLine();
        System.out.println("Qual o destino do arquivo: ");
        String destino = sc.nextLine();
        copiarArquivo(origem, destino);
    }

    private static int copiarArquivo(String origem, String destino) {
        File file = null;
        int ent = 0;
        String nome = "";
        Scanner sc = new Scanner(System.in);
        try {
            file = new File(origem);
            if(!file.exists()){
                System.out.println("Arquivo inexistente");
                return 0;
            }
            FileReader or = new FileReader(file);
            file = new File(destino);
            if(!file.exists()){
                System.out.println("Arquivo inexistente dest");
                return 0;
            }
            else if(!file.createNewFile()) {
                System.out.print("Arquivo já existe. Deseja altera-lo:\n" +
                        "[1] - Sim\n[0] - Não\n>> ");
                ent = sc.nextInt();
                sc.nextLine();
                if(ent== 0){
                    System.out.print("De um novo nome a ele:\n>> ");
                    String novoNome = sc.nextLine();
                    file = new File(file.getParent(), novoNome+".txt");
                }
            }

            FileWriter dest = new FileWriter(file);

            String line;
            BufferedWriter bw = new BufferedWriter(dest);
            BufferedReader br = new BufferedReader(or);
            while((line = br.readLine()) != null){

                bw.write(line);
                bw.newLine();
                bw.flush();
            }
// src/aulasPoo/exerciciofixacao7/exfix1/result/tabuada_1
// src/aulasPoo/exerciciofixacao7/exfix7/destino/scratch.txt


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }
}
