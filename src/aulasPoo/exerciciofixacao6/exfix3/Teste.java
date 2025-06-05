package aulasPoo.exerciciofixacao6.exfix3;



public class Teste {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(20);
        try{
            cb.sacar(20);
        }catch(SaldoException e){
            System.out.println(e.getMessage());
        }
    }
}
