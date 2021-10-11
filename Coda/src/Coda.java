class Nodo {
    public int valore;
    public Nodo prev;
}




public class Coda {
    Nodo head, tail;

    public Coda() {
        this.head = null;
        this.tail = null;
    }

    public int dequeue() {
        int valore = head.valore;
        head = head.prev;
        return valore;
    }
    public void enqueue(int valore) {
        Nodo n = new Nodo();
        n.valore = valore;
        if(isEmpty()) {
            head = n;
            tail = n;
        }
        else {
            this.tail.prev = n;
            this.tail = n;
        }
    }
    public boolean isEmpty() {
        return (head == null);
    }
    public boolean isFull() {
        return false;
    }
}
