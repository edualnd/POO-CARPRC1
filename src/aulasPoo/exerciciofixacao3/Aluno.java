/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public Aluno(String matricula, String nome, float notaProva1, float notaProva2, float notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
   
    public float media(){
        float media = ((notaProva1 * 2.5f) + (notaProva2 * 2.5f) + (notaTrabalho * 2)) / 7;
        return media;
    }
    public float rec(){
        float media = media();
        float notaNecessaria;
        if(media>=6){
            notaNecessaria = 0;
        }else{
            notaNecessaria = 12 - media;
        }
        
        return notaNecessaria;
    }
}


