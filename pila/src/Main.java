import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(10);
        for(int i=1; i<=10; i++) {
            p.push((int) Math.floor(Math.random() * 100));
        }
        System.out.println("Valori casuali:");
        for(int i=0; i<10; i++) {
            System.out.print(p.get(i));
            System.out.print(" - ");
        }
        System.out.println();
        System.out.println("Pila svuotata stampando valori invertiti:");
        while(!p.isEmpty()) {
            try {
                System.out.print(p.pop());
                System.out.print(" - ");
            }
            catch(Exception err) {
                System.out.println(err);
            }
        }
    }
}
