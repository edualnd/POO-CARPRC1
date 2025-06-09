package aulasPoo.exerciciofixacao7.exfix1;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print("Até que numero deseja a tabuada: ");
        int max = sc.nextInt();
        String nomArquivo = "tabuada_" + num;
        FileWriter fw = null;

        try {
            fw = new FileWriter("src/aulasPoo/exerciciofixacao7/exfix1/result/" + nomArquivo,
                    false);
            try(BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("Tabuada do " + num);
                bw.newLine();
                for (int i = 1; i <= max ; i++) {
                    String texto = num + " * " + i + " = " + (num*i);
                    bw.write(texto);
                    bw.newLine();
                    bw.flush();
                }
            }catch (IOException e){
                System.out.println("Erro " + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Erro " + e.getMessage());
        }
    }
}
