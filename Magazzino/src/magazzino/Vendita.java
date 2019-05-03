
package magazzino;

/**
 *
 * @author Jay Lean
 */
public class Vendita implements Runnable{
    public int quantita, tempo;
    public Magazzino M1;
    public Cliente c1;

    public Vendita(Cliente c1, int tempo, int quantita, Magazzino M1){
        this.c1 = c1;
        this.tempo = tempo;
        this.M1 = M1;
        this.quantita = quantita;
    }
    @Override
    public void run() {
       for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i+" "+M1.decrementa(Thread.currentThread(), quantita, i));
        }
    }
    
    
}
