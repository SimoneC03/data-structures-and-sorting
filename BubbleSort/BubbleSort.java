import java.util.Scanner;
public class BubbleSort{
	public static void inputVector(int V[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<n; i++) {
			System.out.print("V["+i+"] = ");
			V[i] = input.nextInt();
		}
	}

	public static void outputVector(int V[], int n) {
		for(int i=0; i<n; i++)
			System.out.println("V["+i+"] = "+V[i]);
	}

	public static void bubbleSort(int V[], int n) {
		for(int i=0; i<n-1; i++) {
			boolean scambio = false;
			for(int j = 0; j<n-1-i; j++) {
				if(V[j] > V[j+1]) {
					int k = V[j];
					V[j] = V[j+1];
					V[j+1] = k;
					scambio = true;
				}
			}
			if(scambio == false) break; 
		}
	}
}