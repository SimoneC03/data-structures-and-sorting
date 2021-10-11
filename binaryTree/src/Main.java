public class Main {
    public static void main(String[] args) {
        Tree albero = new Tree();
        albero.insert(5);
        albero.insert(8);
        albero.insert(7);
        albero.insert(4);
        albero.insert(3);
        System.out.println("postOrder:");
        albero.print();
        System.out.println("\n\nA livelli:");
        albero.printLevelOrder();

        System.out.println("\nCerco il 7...");
        if(albero.search(7)) System.out.print("Trovato!");
        else System.out.print("Non trovato!");
    }
}
