
package sistema.devgo.java;

import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Venda {

 
    private Date dataVenda;
    private int quantidadeAluno;
    private String idioma;
    private Plano plano;
    
    
      public Venda(Date dataVenda, int quantidadeAluno, String idioma, Plano plano) {
        this.dataVenda = dataVenda;
        this.quantidadeAluno = quantidadeAluno;
        this.idioma = idioma;
        this.plano=plano;
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

    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public String getIdioma() {
        return idioma;
    }
}
