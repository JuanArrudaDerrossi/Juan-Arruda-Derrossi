
package desafiofnc2;


public class Paciente {
    private int Matricula;
    private String Nome;
    private Procedimento Proc;
    
    public Paciente() {
        
    }
    
    public Paciente(int Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        
    }
    
    public int getMatricula(){
        return Matricula;
        
    }
    
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public Procedimento getProc() {
        return Proc;
    }

    public void setProc(Procedimento Proc) {
        this.Proc = Proc;
    }
    
}
