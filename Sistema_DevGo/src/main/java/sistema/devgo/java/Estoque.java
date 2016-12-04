package sistema.devgo.java;

/**
 *
 * @author Natanael
 */
public class Estoque {
    private long codIdioma;
    private int qtdeEntrada;

    public Estoque(long codIdioma, int qtdeEntrada) {

        this.qtdeEntrada = qtdeEntrada;
        this.codIdioma = codIdioma;
    }

    public Estoque() {
     
    }

    public void setQtdeEntrada(int qtdeEntrada) {
        this.qtdeEntrada = qtdeEntrada;
    }

    public int getQtdeEntrada() {
        return qtdeEntrada;
    }

    /**
     * @return the codIdioma
     */
    public long getCodIdioma() {
        return codIdioma;
    }

    /**
     * @param codIdioma the codIdioma to set
     */
    public void setCodIdioma(long codIdioma) {
        this.codIdioma = codIdioma;
    }

}
