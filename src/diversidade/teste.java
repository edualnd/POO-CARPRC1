package diversidade;

import java.io.IOException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.println("Digite o texto que deseja ouvir (ou 'sair' para sair):");

        while (true) {
            System.out.print("=> ");
            texto = scanner.nextLine();
            texto = texto.toLowerCase();

            if (texto.equals("sair")) {
                System.exit(0);
            }

            String textoVoz = "PowerShell -Command \"Add-Type –AssemblyName System.Speech;" +
                    " (New-Object System.Speech.Synthesis.SpeechSynthesizer)." +
                    "Speak('" + texto + "');\"";

            try {
                Runtime.getRuntime().exec(textoVoz);
            } catch (IOException e) {
            }
        }}}