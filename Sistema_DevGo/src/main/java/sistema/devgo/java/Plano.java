package sistema.devgo.java;

import java.util.List;

/**
 *
 * @author Sibele
 */
public class Plano {
    //Verificar necessidade desses atributos.
    private String idioma;
    private Venda venda; //Associação com Vendas
    
    
    private double preco;
    private String nomePlano;
    private long id_plano; 

    public Plano() {
    }
    
    
    public Plano(double preco, String nomePlano/*,String idioma, Venda venda*/) {
       /* this.idioma = idioma;
        this.venda = venda;*/
        this.preco=preco;
        this.nomePlano=nomePlano;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public long getId_plano() {
        return id_plano;
    }

    public void setId_plano(long id_plano) {
        this.id_plano = id_plano;
    }

    

    
}
