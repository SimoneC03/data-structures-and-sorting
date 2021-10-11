import java.util.Scanner;
public class Vettori{
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
	public static int ricercaBinaria(int V[], int n, int x) {
		int p = 0;
		int q = n-1;
		while(p<=q) {
			int m = (p+q)/2;
			if(x>V[m]) {
				p = m+1;
			}
			else if(x<V[m]) {
				q = m-1;
			}
			else if(x==V[m]) {
				return m;
			}
		}
		return -1;
	}
	public static int ricercaBinariaRicorsiva(int V[], int primo, int ultimo, int x) {
		if(primo>ultimo) return -1;
		int m = (primo+ultimo)/2;
		if(V[m] == x) return m;
		if(x > V[m]) 
			return ricercaBinariaRicorsiva(V, m+1, ultimo, x); 
		else
			return ricercaBinariaRicorsiva(V, primo, m-1, x);
	}
	/*
	public static int ricercaricorsiva(int V[], int n, int x) {
		return ricercaBinariaRicorsiva(V,0,n-1,x);
	}
	E METTI ricercaBinariaRicorsiva private
	*/
}