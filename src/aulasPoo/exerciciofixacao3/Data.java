/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasPoo.exerciciofixacao3;
import java.time.LocalDate;
/**
 *
 * @author cg3034011
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = LocalDate.now().getDayOfMonth();
        this.mes = LocalDate.now().getMonthValue();
        this.ano = LocalDate.now().getYear();
    }

    public Data(int dia, int mes, int ano) {
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("Data invalida: Data sera a de hoje");
            this.dia = LocalDate.now().getDayOfMonth();
            this.mes = LocalDate.now().getMonthValue();
            this.ano = LocalDate.now().getYear();
        }
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    private boolean verificarData(int dia, int mes, int ano) {
        int[] meses = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(ano%4 == 0 && ano%100 !=0 || ano%400 == 0){
            meses[2] = 29;
        }
        if(mes < 1 || mes > 12){mes = 0;}
        
        return meses[mes] >= dia && dia > 0 && ano > 0;
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
    public void avancarDia(){
        int[] meses = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(isBissexto()){
            meses[2] = 29;
        }
        if(dia+1 > meses[mes]){
            dia = 1;
            if(mes ==12){
                mes = 1;
                ano++;
            }else{
                mes++;
            }
        } else{
            dia++;
        }
    
    }
    
    public int CompararDatas(Data data){
        int ret;
        int diaD = data.getDia();
        int mesD = data.getMes();
        int anoD = data.getAno();
        
        boolean diaIsDepois = dia > diaD && mes == mesD && ano == anoD;
        boolean mesIsDepois = mes > mesD && ano == anoD;
        
        if(dia == diaD && mes == mesD && ano == anoD){
            ret = 0;
        }else if(diaIsDepois || mesIsDepois || ano > anoD){
            ret = 1;
        }else{
            ret = -1;
        }
        return ret;
    }
    private boolean isBissexto(){
        boolean bissexto =(ano%4 == 0 && ano%100 !=0) || (ano%400 == 0);
        return bissexto;
    }
    
    
}
