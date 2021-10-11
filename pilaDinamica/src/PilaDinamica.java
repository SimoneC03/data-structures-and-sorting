class Nodo{
    public int valore;
    public Nodo prev;
    public Nodo() {
        valore = 0;
        prev = null;
    }
}

public class PilaDinamica {
    Nodo top;
    public PilaDinamica() {
        top = null;
    }
    public PilaDinamica(int valore) {
        top = null;
    }
    public void push(int valore) {
        Nodo n = new Nodo();
        n.valore = valore;
        n.prev = top;
        top = n;
    }

    public int pop() {
        int val = top.valore;
        top = top.prev;
        return val;
    }

    public int peek() {
        return top.valore;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
