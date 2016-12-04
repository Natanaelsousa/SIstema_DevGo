package sistema.devgo.java;

import java.util.ArrayList;

/**
 *
 * @author Sibele
 */
public class Estoque {
    private int codIdioma;
    private int qtdeEntrada;

    public Estoque(int codIdioma, int qtdeEntrada) {

        this.qtdeEntrada = qtdeEntrada;
        this.codIdioma = codIdioma;
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
    public int getCodIdioma() {
        return codIdioma;
    }

    /**
     * @param codIdioma the codIdioma to set
     */
    public void setCodIdioma(int codIdioma) {
        this.codIdioma = codIdioma;
    }

}
