
package aulasPoo.exerciciofixacao3;

/**
 *
 * @author cg3034011
 */
public class Aluno {
    
    private String matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float media(){
        final float PESOPROVA = 2.5f;
        final float PESOTRABALHO = 2f;
        float media = (PESOPROVA * (notaProva1 + notaProva2) + (notaTrabalho * PESOTRABALHO))/7;
        
        return media;
    }
    public float recuperacao(){
        float media = media();
        float rec = 0;
        if(media<6){
        rec = 12 - media;
        }
        return rec;

    }
}


