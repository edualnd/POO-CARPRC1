package aulasPoo.exerciciofixacao7.exfix2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        File f = new File("src/aulasPoo" +
                "/exerciciofixacao7/exfix1/result/tabuada_" + num);

        FileReader fr;

        try {
            fr = new FileReader(f);
            int line;
            StringBuilder res = new StringBuilder();
            while((line = fr.read()) != -1){
                res.append((char) line);
            }
            System.out.println(res);
            fr.close();

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}
