/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4.funcionario;

import aulasPoo.exerciciofixacao4.funcionario.Funcionario;

/**
 *
 * @author cg3034011
 */
public class Assistente extends Funcionario{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String exibeDados(){
        return super.exibeDados() + "%nMatricula: " + matricula;
    }
    
    
}
