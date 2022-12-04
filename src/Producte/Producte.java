package Producte;

public class Producte {
    private String[] dades;
    private int identificador;
    private Producte[] reaccions;

    public Producte(String[] dades, int identificador, Producte[] reaccions) {
        this.dades = dades;
        this.identificador = identificador;
        this.reaccions = reaccions;
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
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public void setReaccio(int i, Producte reaccio) {
        this.reaccions[i] = reaccio;
    }
}
