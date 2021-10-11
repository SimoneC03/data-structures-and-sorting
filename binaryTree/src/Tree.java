import java.util.LinkedList;
class Nodo {
    public int valore;
    public Nodo left;
    public Nodo right;
    public Nodo(int valore) {
        this.valore = valore;
        left = null;
        right = null;
    }
}
public class Tree {
    private Nodo root;
    public Tree() {
        root = null;
    }
    private void insertAfter(Nodo n, Nodo nuovo) {
        if(nuovo.valore <= n.valore) {
            if(n.left == null) n.left = nuovo;
            else insertAfter(n.left, nuovo);
        }
        else {
            if(n.right == null) n.right = nuovo;
            else insertAfter(n.right, nuovo);
        }
    }

    public void insert(int valore) {
        Nodo n = new Nodo(valore);
        if(root == null) root = n;
        else insertAfter(root, n);
    }

    private void preOrder(Nodo n) {
        if (n == null) return;
        System.out.print(n.valore + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    private void postOrder(Nodo n) {
        if (n == null) return;
        preOrder(n.left);
        preOrder(n.right);
        System.out.print(n.valore + " ");
    }

    private void inOrder(Nodo n) {
        if (n == null) return;
        preOrder(n.left);
        System.out.print(n.valore + " ");
        preOrder(n.right);
    }

    public void print() {
        if(root == null) System.out.print("L'albero è vuoto");
        else postOrder(root);
    }

    public void printLevelOrder() {
        LinkedList<Nodo> coda = new LinkedList<Nodo>();
        coda.add(root);
        while (!coda.isEmpty()) {
            Nodo temp = coda.removeFirst();
            System.out.print(temp.valore + " ");
            if (temp.left != null)  coda.add(temp.left);
            if (temp.right != null) coda.add(temp.right);
        }
    }

    private boolean search(Nodo n, int valore) {
        if(n == null) return false;
        else if(n.valore == valore) return true;
        return valore < n.valore ? search(n.left, valore) : search(n.right, valore);
    }

    public boolean search(int valore) {
        if(root == null) return false;
        else return search(root, valore);
    }
}
