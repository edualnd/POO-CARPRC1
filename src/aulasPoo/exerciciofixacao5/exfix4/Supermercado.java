package aulasPoo.exerciciofixacao5.exfix4;

public class Supermercado {
    public static void main(String[] args) {
        Shampoo[] shampoo = new Shampoo[5];
        Leite[] leite = new Leite[5];
        Biscoito[] biscoito = new Biscoito[5];
        for(int i = 0; i<5; i++){
            double preco = (Math.random() * (20 - 5 + 1)) + 5;
            char letra1 = (char) ('A' + (int) (Math.random() * 26));
            char letra2 = (char) ('A' + (int) (Math.random() * 26));
            int caracteristica = (int) (Math.random() * (56 + 1));

            shampoo[i]= new Shampoo("SAM-" + letra1 + letra2,preco, caracteristica);
            leite[i]= new Leite("LEI-" + letra1 + letra2,preco, caracteristica);
            biscoito[i]= new Biscoito("BIS-" + letra1 + letra2,preco, caracteristica);
        }

        System.out.println("NOME  ||   PRECO  || IRRITABILIDADE ");
        for(int i = 0; i<5; i++){
            String nome = shampoo[i].getNome();
            String preco = String.format("%.2f", shampoo[i].getPreco());
            int caracteristica = shampoo[i].getIrritabilidade();
            System.out.println(nome + " || " + preco + " || " + caracteristica +
                    " || " + String.format("%.2f",shampoo[i].getCustoBeneficio()));
        }
        System.out.println("NOME  ||   PRECO  || COMPONENTES ");
        for(int i = 0; i<5; i++){
            String nome = biscoito[i].getNome();
            String preco = String.format("%.2f", biscoito[i].getPreco());
            int caracteristica = biscoito[i].getQtdComponentesCancerigenos();
            System.out.println(nome + " || " + preco + " || " + caracteristica
                    + " || " + String.format("%.2f",biscoito[i].getCustoBeneficio()));
        }
        System.out.println("NOME  ||   PRECO  || VALIDADE ");
        for(int i = 0; i<5; i++){
            String nome = leite[i].getNome();
            String preco = String.format("%.2f", leite[i].getPreco());
            int caracteristica = leite[i].getValidade();
            System.out.println(nome + " || " + preco + " || " + caracteristica +
                    " || " + String.format("%.2f",leite[i].getCustoBeneficio()));
        }
        Shampoo melhorS = shampoo[0];
        Leite melhorL = leite[0];
        Biscoito melhorB = biscoito[0];
        for (int i = 0; i < 5; i++) {
            int resultS = melhorS.compareTo(shampoo[i]);
            int resultL = melhorL.compareTo(leite[i]);
            int resultB = melhorB.compareTo(biscoito[i]);

            if(resultB < 0){
                melhorB = biscoito[i];
            }
            if(resultS < 0){
                melhorS = shampoo[i];
            }
            if(resultL < 0){
                melhorL = leite[i];
            }
        }

        System.out.println("Shampoo " + String.format("%.2f", melhorS.getCustoBeneficio()));
        System.out.println("Leite " + String.format("%.2f",melhorL.getCustoBeneficio()));
        System.out.println("Biscoito " + String.format("%.2f",
                melhorB.getCustoBeneficio()));

    }
}
