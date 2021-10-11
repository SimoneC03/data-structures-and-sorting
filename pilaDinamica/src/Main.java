public class Main {
    public static void main(String[] args) {
        System.out.println("Inserimento numeri da 1 a 1000...");
        PilaDinamica p = new PilaDinamica();
        for(int i=1; i<=1000; i++) {
            p.push(i);
        }
        System.out.println("Numeri inseriti");
        System.out.println("Estrazione...");
        for(int i=0; i<1000; i++) {
            System.out.println(p.pop());
        }
    }
}
