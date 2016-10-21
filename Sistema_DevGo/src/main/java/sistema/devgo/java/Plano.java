package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Plano {

    private String idioma;
    private Venda venda; //Associação com Vendas

    public Plano(String idioma, Venda venda) {
        this.idioma = idioma;
        this.venda = venda;
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

}
