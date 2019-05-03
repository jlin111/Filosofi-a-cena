package magazzino;

/**
 *
 * @author Jay Lean
 */
public class Fornitore {
    
    public String nome, Piva;
    
    
    public Fornitore(String nome, String Piva){
        this.nome = nome;
        this.Piva = Piva;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPiva(String Piva){
        this.Piva = Piva;
    }
    public String getNome(){
        return nome;
    }
    public String getPiva(){
        return Piva;
    }
    
}
