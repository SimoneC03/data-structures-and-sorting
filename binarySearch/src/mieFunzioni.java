public class mieFunzioni {
    public static void bubbleSort(int V[]) {
        boolean scambio = false;
        for(int i=0; i<V.length-1; i++) {
            for(int j=0; j<V.length-1-i; j++) {
                if(V[j] > V[j+1]) {
                    int k = V[j+1];
                    V[j+1] = V[j];
                    V[j] = k;
                    scambio = true;
                }
            }
            if(scambio==false) break;
        }
    }
    public static int ricercaBinaria(int V[], int n, int x) {
        int p=0;
        int u = n;
        while (p <= u) {
            int m = (p+u)/2;
            if (V[m]==x)
                return m;
            else if(x>V[m])
                p=m;
            else if(x<=V[m])
                u=m;
        }
        return -1;
    }

    public static int ricercaBinariaRicorsiva(int V[], int p, int u, int x) {
        if (p > u) return -1;
        int m = (p + u) / 2;
        if (V[m] == x) return m;
        if (x > V[m])
            return ricercaBinariaRicorsiva(V, m, u, x);
        else
            return ricercaBinariaRicorsiva(V, p, m, x);
    }
}
