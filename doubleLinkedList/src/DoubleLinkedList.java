public class DoubleLinkedList {
    private class Nodo{
        public int valore;
        public Nodo next;
        public Nodo prev;
        public Nodo(){
            valore=0;
            next=null;
            prev=null;
        }
        public Nodo(int n){
            valore=n;
        }
    }

    private Nodo First;
    private Nodo Last;
    public DoubleLinkedList(){
        First=null;
        Last=null;
    }
    private void insertAfter(Nodo node, Nodo newNode){
        newNode.prev=node;
        newNode.next=node.next;
        if(node.next==null){
            Last=newNode;
        }
        else{
            node.next.prev=newNode;
        }

        node.next=newNode;
    }

    private void insertBefore(Nodo node, Nodo newNode){
        newNode.prev=node.prev;
        newNode.next=node;
        if(node.prev==null){
            First=newNode;
        }
        else{
            node.prev.next=newNode;
        }
        node.prev=newNode;
    }

    private void insertBeginning(Nodo newNodo) {
        if(First == null) {
            First = newNodo;
            Last = newNodo;
        }
        else {
            this.insertBefore(First, newNodo);
        }
    }

    private void insertEnd(Nodo newNodo) {
        if(Last == null) {
            First = newNodo;
            Last = newNodo;
        }
        else {
            this.insertAfter(Last, newNodo);
        }
    }

    private void remove(Nodo n) {
        if(n.prev == null)  First = n.next;
        else n.prev.next = n.next;

        if(n.next == null) Last = n.prev;
        else n.next.prev = n.prev;
    }

    public void insertBeginning(int n) {
        Nodo nodo = new Nodo(n);
        this.insertBeginning(nodo);
    }

    public void insertEnd(int n) {
        Nodo nodo = new Nodo(n);
        this.insertEnd(nodo);
    }

    public int size() {
        Nodo current = First;
        int size = 0;
        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void insertSorted(int valore) {
        Nodo n = new Nodo(valore);
        Nodo current = First;
        while(current != null && valore >= current.valore) {
            current = current.next;
        }
        if(current == null) this.insertEnd(n.valore);
        else
            if (current == First) this.insertBeginning(n.valore);
            else this.insertBefore(current, n);
    }

    public void remove(int valore) {
        Nodo current = First;
        while(current != null) {
            if(current.valore == valore) this.remove(current);
            current = current.next;
        }
    }

    public void removeFirst() throws Exception {
        if(First == null) throw new Exception("La lista è vuota");
        else {
            First = First.next;
            this.remove(First.prev);
        }
    }

    public int getFirst() throws Exception {
        if(First == null) throw new Exception("La lista è vuota");
        else {
            First = First.next;
            return First.prev.valore;
        }
    }

    public void removeLast() {
        Last = Last.prev;
        this.remove(Last.next);
    }

    public boolean isEmpty() {
        return (First==null);
    }



    @Override
    public String toString() {
        Nodo current = First;
        String out = "";
        while(current != null) {
            out += current.valore+" ";
            current = current.next;
        }
        return out;
    }


}
