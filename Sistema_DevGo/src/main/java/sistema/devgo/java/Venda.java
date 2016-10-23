
package sistema.devgo.java;

import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Venda {

/*CNPJ
Razao
Plano
Periodo
Idioma
Aluno
Valor */
    private Date dataVenda;
    private int qtdeAluno;
    private String idioma;
    private Plano plano;
    private double valor;
    private String cliente; //Nessa variavel seta a razao do cliente que vai vir da venda
    
    
      public Venda(Date dataVenda, int qtdeAluno, String idioma, Plano plano,double valor,String cliente) {
        this.dataVenda = dataVenda;
        this.qtdeAluno = qtdeAluno;
        this.idioma = idioma;
        this.plano=plano;
        this.valor = valor;
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }



    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setQtdadeAluno(int qtdeAluno) {
        this.setQtdeAluno(qtdeAluno);
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public int getQtdeAluno() {
        return qtdeAluno;
    }

    public String getIdioma() {
        return idioma;
    }

    /**
     * @param qtdeAluno the qtdeAluno to set
     */
    public void setQtdeAluno(int qtdeAluno) {
        this.qtdeAluno = qtdeAluno;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
