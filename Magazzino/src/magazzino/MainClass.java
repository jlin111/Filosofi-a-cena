package magazzino;

/**
 *
 * @author Jay Lean
 */
public class MainClass {

    public static void main(String[] args) {
        
        Magazzino M1 = new Magazzino(100);
        Fornitore F_A = new Fornitore("A", "jkasfhjsdafjk");
        Fornitore F_B = new Fornitore("B", "afasfjksfgasd");
        Cliente cliente1 = new Cliente("c1");
        
        Fornitura f1 = new Fornitura(F_A, 100, 10, M1);
        Thread TFornitura = new Thread(f1);
        Vendita v1 = new Vendita(cliente1, 100, 100, M1);
        Thread TVendita = new Thread(v1);
        
        TVendita.start();
        try {
            Thread.sleep(v1.tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       TFornitura.start();
        
        
    }
   
}
