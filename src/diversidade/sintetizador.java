package diversidade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sintetizador {
    public static void main(String[] args) {
        int ent = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao SAPI");
        System.out.print("Deseja ler um:\n[0]Texto\n[1]Arquivo\n>> ");
        try{
            ent = sc.nextInt();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        if(ent == 0){
            lertexto();
        }else{
            lerArquivo();

        }
        System.out.println("Bye Bye!");
        
        
    }

    private static void lerArquivo() {
        Scanner sc = new Scanner(System.in);
        String caminho = "";
        System.out.print("Digite o caminho do arquivo que deseja ler:\n>> ");
        caminho = sc.nextLine();
        FileReader readerF = null;
        BufferedReader readerB =null;

        try {
            readerF = new FileReader(caminho);
            readerB = new BufferedReader(readerF);

            String text = "";
            do{
                text = readerB.readLine();
                if (text !=null){
                    System.out.println(text);
                    String textoVoz =  "powershell.exe -Command \"Add-Type -AssemblyName System.Speech;" +
                            "$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer;" +
                            "$speak.SelectVoice('Microsoft Maria Desktop');" +
                            "$speak.Speak('" + text + "');\"";
                    try {
                        Runtime.getRuntime().exec(textoVoz);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }

            }while(text!=null);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    private static void lertexto() {
        Scanner sc = new Scanner(System.in);
        String text = "";
        System.out.println("Se desejar finalizar o program digite 'sair'.");
        do{
            System.out.print("O que deseja dizer: ");
            text = sc.nextLine();
            if(!text.equals("sair")) {
                System.out.println(text);
                text = text.toLowerCase();
                String textoVoz =  "powershell.exe -Command \"Add-Type -AssemblyName System.Speech;" +
                        "$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer;" +
                        "$speak.SelectVoice('Microsoft Maria Desktop');" +
                        "$speak.Speak('" + text + "');\"";
                try {

                    Runtime.getRuntime().exec(textoVoz);
                } catch (IOException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }while(!text.equals("sair"));
    }
}
