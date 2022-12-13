package Backtracking;
import Producte.Producte;

public class SolucioBack {
    public static void main(String[] args) {
       
        System.out.print("Indica quants productes diferents ha d'emmagatzemar l'empresa: ");
        int n = Integer.parseInt(System.console().readLine());
        Producte[] productes = new Producte[n];
        for(int i=0; i<n; i++){
            productes[i] = new Producte(i);
        }

    }
}
