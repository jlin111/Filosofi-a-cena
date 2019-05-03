
package magazzino;

/**
 *
 * @author Jay Lean
 */
public class Fornitura implements Runnable{
    public int quantita, tempo;
    public Fornitore f1;
    public Magazzino M1;

    public Fornitura(Fornitore f1, int tempo, int quantita, Magazzino M1){
        this.f1 = f1;
        this.tempo = tempo;
        this.M1 = M1;
        this.quantita = quantita;
    }
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName()+" "+i+" "+M1.incrementa(Thread.currentThread(), quantita, i));
        }
    }
    
    
}
