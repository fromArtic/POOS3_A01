package Ex02;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        if(d > 0 && d < 31){
            this.dia = d;
        }else{
            System.out.println("Dia inválido!!!!!!!!");
        }
        if(m > 0 && m <= 12){
            this.mes = m;
        }else{
            System.out.println("Mês inválido!!!!!!!!");
        }
        if(a > 1900){
            this.ano = a;
        }else{
            System.out.println("Ano inválido!!!!!!!!");
        }
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, this.dia + " / " + this.mes + " / " + this.ano);
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        if(dia > 0 && dia < 31){
            this.dia = dia;
        }else{
            System.out.println("Dia inválido!!!!!!!!");
        }
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }else{
            System.out.println("Mês inválido!!!!!!!!");
        }
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        if(ano > 1900){
            this.ano = ano;
        }else{
            System.out.println("Ano inválido!!!!!!!!");
        }
    }
}
