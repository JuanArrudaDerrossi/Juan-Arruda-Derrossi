
package desafiofnc2;

import java.util.ArrayList;

public class Procedimento {
    private int Codigo;
    private String Nome;
    ArrayList<Paciente> ListaPas; 
    
    public Procedimento(int Codigo,String Nome) {
         this.Codigo = Codigo;
        this.Nome = Nome;
  
        ListaPas = new ArrayList();
    
    }
    
    public int getCodigo() {
        return Codigo;
    }
    
    public void setCodigo (int Codigo){
        this.Codigo = Codigo;
     }
    
    public String getNome(){
        return Nome;
        
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public ArrayList<Paciente> getListaPas() {
        return ListaPas;
    }

    public void setListaPas(ArrayList<Paciente> ListaPas) {
        this.ListaPas = ListaPas;
    }
    
    public void addPas(Paciente P){
        P.setProc(this);
        ListaPas.add(P);
        
    }
    
}
