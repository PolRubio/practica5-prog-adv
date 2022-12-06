package Producte;

public class Producte {
    private String[] dades;
    private int identificador;
    private Producte[] reaccions;

    public Producte(int identificador) {
        this.identificador = identificador;
    }

    public String[] getDades() {
        return dades;
    }
    public int getIdentificador() {
        return identificador;
    }
    public Producte getReaccio(int i) {
        return reaccions[i];
    }
    
    public void setDades(String[] dades) {
        this.dades = dades;
    }
    public void setReaccio(int i, Producte reaccio) {
        this.reaccions[i] = reaccio;
    }
}
