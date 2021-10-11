public class Pila {
    private int top;
    private int nmax;
    private int pila[];
    public Pila(int nmax) {
        this.nmax = nmax;
        this.pila = new int[nmax];
    }
    public int get(int i) {
        return pila[i];
    }
    public void push(int i) {
        try {
            pila[top] = i;
            top++;
        }
        catch(Exception err) {
            System.out.println(err);
        }
    }
    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Il vettore è vuoto");
        }
        top--;
        return pila[top];
    }
    public boolean isEmpty() {
        return (top==0);
    }
}
