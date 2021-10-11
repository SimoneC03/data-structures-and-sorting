import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Quanti valori vuoi inserire? ");
		n = input.nextInt();
		int V[] = new int[n];
		Vettori.inputVector(V,n);
		System.out.println("Ordinando vettore ");
		Vettori.bubbleSort(V,n);
		System.out.println("Vettore ordinato: ");
		Vettori.outputVector(V,n);
  }

}