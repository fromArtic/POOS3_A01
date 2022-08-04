package Ex03;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Pessoa{
    private String nome, endResidencial, endComercial;
    
    public Pessoa(String n, String er, String ec){
        if(n != null && er != null && ec != null){
            if(!er.equals(ec)){
            this.nome = n;
            this.endResidencial = er;
            this.endComercial = ec;
            }
        }
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "; End. residencial: " + this.endResidencial 
                + "; End. comercial: " + this.endComercial);
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    public String getEndResidencial(){
        return endResidencial;
    }
    public void setEndResidencial(String endResidencial){
        if(!endResidencial.equals(this.endComercial)){
            this.endResidencial = endResidencial;
        }
    }
    public String getEndComercial(){
        return endComercial;
    }
    public void setEndComercial(String endComercial){
        if(!endComercial.equals(this.endResidencial)){
            this.endComercial = endComercial;
        }
    }
}
