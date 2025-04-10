/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4;

/**
 *
 * @author cg3034011
 */
public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(double bonusSalarial, String matricula, String nome, double salario) {
        super(matricula, nome, salario);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    @Override
    public double ganhoAnual(){
        
        return super.ganhoAnual();
    }
}
