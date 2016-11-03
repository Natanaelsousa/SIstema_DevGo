package sistema.devgo.java;

import java.util.List;

/**
 *
 * @author Sibele
 */
public class Plano {

    private String nomePlano;
    private String periodo;
    private long cod_idioma;
    private double preco;
    private long id_plano;

    //Construtores
    public Plano() {
    }
    public Plano(long id_plano,double preco, String nomePlano, String periodo,long cod_idioma) {
        this.cod_idioma = cod_idioma;
        this.periodo = periodo;
        this.preco = preco;
        this.nomePlano = nomePlano;
        this.id_plano=id_plano;
    }
   
    //Get e Set de Idioma
    public long getCod_idioma() {
        return cod_idioma;
    }
    public void setCod_idioma(long cod_idioma) {
        this.cod_idioma = cod_idioma;
    }
    
    //Get e Set de Preço
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Get e Set do Nome dos planos
    public String getNomePlano() {
        return nomePlano;
    }
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    //Get e Set do Identificador do plano
    public long getId_plano() {
        return id_plano;
    }
    public void setId_plano(long id_plano) {
        this.id_plano = id_plano;
    }

    //Get e Set do periodo
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
