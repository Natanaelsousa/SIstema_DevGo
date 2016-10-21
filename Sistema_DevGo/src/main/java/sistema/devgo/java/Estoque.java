package sistema.devgo.java;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Estoque {

    private Date dataEntrada;
    private Date dataSaida;
    private int qtdeEntrada;
    private int qtdeSaida;
    private ArrayList<Livro> livro;

    public Estoque(Date dataEntrada, Date dataSaida, int qtdeEntrada, int qtdeSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.qtdeEntrada = qtdeEntrada;
        this.qtdeSaida = qtdeSaida;
        this.livro = new ArrayList<Livro>();
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setQtdeEntrada(int qtdeEntrada) {
        this.qtdeEntrada = qtdeEntrada;
    }

    public void setQtdeSaida(int qtdeSaida) {
        this.qtdeSaida = qtdeSaida;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @return the qtdeEntrada
     */
    public int getQtdeEntrada() {
        return qtdeEntrada;
    }

    /**
     * @return the qtdeSaida
     */
    public int getQtdeSaida() {
        return qtdeSaida;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }
}
