public class Main {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList lista = new DoubleLinkedList();
        lista.insertBeginning(1);
        lista.insertBeginning(2);
        lista.insertBeginning(3);
        lista.insertBeginning(3);
        lista.insertBeginning(3);
        lista.insertBeginning(3);
        lista.insertEnd(4);
        lista.insertEnd(5);
        lista.insertSorted(0);
        lista.remove(3);
        lista.removeFirst();
        lista.removeLast();
        System.out.println("-> "+lista);
        System.out.println("Lunghezza lista: "+lista.size());
    }
}
