public class Main {
    public static void main(String[] args) {
        Coda c = new Coda();
        for(int i=1; i<=1000; i++)
            c.enqueue(i);
        /*for(int i=1; i<=1000; i++) {
            System.out.println(c.dequeue());
        }*/
        while(c.head!=null) {
            System.out.println(c.dequeue());
        }
    }
}
