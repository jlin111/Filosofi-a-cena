package magazzino;

/**
 *
 * @author Jay Lean
 */
public class Cliente {
    public String nome;
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
