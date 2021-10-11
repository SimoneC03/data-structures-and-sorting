import java.util.Scanner;
public class ordinaVettore {
	public static void main(String[] args) {
		int n, x;
		Scanner input = new Scanner(System.in);
		System.out.print("Quanti valori vuoi inserire? ");
		n = input.nextInt();
		int V[] = new int[n];
		Vettori.inputVector(V,n);
		System.out.println("Ordinando vettore ");
		Vettori.bubbleSort(V,n);
		System.out.println("Vettore ordinato: ");
		Vettori.outputVector(V,n);
		System.out.print("Inserisci un valore da cercare: ");
		x = input.nextInt();
		if(Vettori.ricercaBinaria(V,n,x) >= 0) {
			System.out.print("Valore trovato in posizione "+Vettori.ricercaBinaria(V,n,x));
			System.out.println("Valore Trovato dalla funzione ricorsiva: "+Vettori.ricercaBinariaRicorsiva(V,0,V.length-1,x));
		}
		else {
			System.out.print("Il valore non è presente");
		}
  }

}