import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti valori vuoi ordinare? ");
        int n = input.nextInt();
        int V[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("V["+i+"] = ");
            V[i] = input.nextInt();
        }
        mieFunzioni.bubbleSort(V);
        for(int i=0; i<n; i++)
            System.out.println("V["+i+"] = "+V[i]);
        System.out.print("Inserisci un valore da cercare all'interno del vettore:");
        int x = input.nextInt();
        System.out.print("Trovato in posizione: "+mieFunzioni.ricercaBinaria(V, n, x));
    }

}
