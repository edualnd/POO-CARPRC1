package aulasPoo.exerciciofixacao6.exfix2;

import java.util.Scanner;

public class exfix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = 0;
        Integer quadrado = null;
        do{
            try{
                num = sc.nextInt();

                quadrado = num*num;

                System.out.println("Resultado: " + quadrado);
            }catch(Exception e){
                System.out.println("Opa… Acho que você se enganou! Digite\n" +
                        "novamente…");
                System.out.println(num);
                sc.nextLine();

            }

        }while(quadrado == null);


    }
    /*
    * Crie um programa em Java para ler um número, digitado pelo, e depois calcular
    *o quadrado desse número.
    *a) Você deve realizar o tratamento da exceção () caso o usuário digite um
    *número inválido (ex: 3w).
    *b) Apresente a mensagem de erro “Opa… Acho que você se enganou! Digite
    *novamente…”, e leia o número novamente, até o usuário digitar um número
    *correto.
    * */
}
