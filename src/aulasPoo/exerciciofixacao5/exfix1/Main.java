package aulasPoo.exerciciofixacao5.exfix1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operacao: ");
        System.out.print(  "Soma - [+] " + "     | Subtracao - [-]" +
                         "\nDivisao - [/] " + "  | Multiplicacao - [*]" +
                         "\nPotencia - [**]" + " | Raiz Quadrada - [√]\n" +
                            ">> ");
        String ent = sc.nextLine();
        double v1 = 0, v2 = 0;
        if(!ent.equals("√")){
            System.out.print("Digite o 1º num: ");
            v1 = sc.nextDouble();

            System.out.print("Digite o 2º num: ");
            v2 = sc.nextDouble();
        }else{
            System.out.print("Digite o num: ");
            v1 = sc.nextDouble();
        }
        CalcCientifica calc = new CalcCientifica();
        switch(ent){
            case "+" -> {
                double res = calc.soma(v1,v2);
                System.out.println("Resposta: " + res);
            }
            case "-" -> {
                double res = calc.subtracao(v1,v2);
                System.out.println(v1+ " - "+  v2 + " = " + res);
            }
            case "/" -> {
                double res = calc.divisao(v1,v2);
                System.out.println(v1+ " / "+  v2 + " = " + res);
            }
            case "*" -> {
                double res = calc.multiplicacao(v1,v2);
                System.out.println(v1+ " * "+  v2 + " = " + res);
            }
            case "√" -> {
                double res = calc.quadrada(v1);
                System.out.println("√" + v1 +  " = " + res);
            }
            case "**" -> {
                double res = calc.potencia(v1,v2);
                System.out.println(v1+ " ** "+  v2 + " = " + res);
            }

        }



    }
}