/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao4.funcionario;

public class Administrativo extends Assistente{
    private String turno;
    private double adicional;


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        
        this.adicional = adicional;
    }
    
    @Override
    public double ganhoAnual(){
        double adicionalAnual =0;
        if(turno == "noturno"){
            adicionalAnual = 12 * adicional;
        }
        return super.ganhoAnual() + adicionalAnual;
    }
}