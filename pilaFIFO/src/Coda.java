public class Coda {
    private int coda[];
    private int capacita;
    private int head;
    private int tail;
    public Coda() {
        head = 0;
        tail = 0;
        capacita = 1000+1;
        coda = new int[this.capacita];
    }
    public Coda(int capacita) {
        head = 0;
        tail = 0;
        this.capacita = capacita;
        coda = new int[this.capacita];
    }
    public void enqueue(int el) {
        coda[tail] = el;
        tail = (tail+1) % this.capacita;
    }
    public int dequeue() {
        return 
    }
}
