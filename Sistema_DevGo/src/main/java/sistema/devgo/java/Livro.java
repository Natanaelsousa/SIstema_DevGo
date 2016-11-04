
package sistema.devgo.java;

/* @author Sibele*/
public class Livro {

    private Estoque Estoque;
    private String idioma;
    private double preco;
    private int quantidade;
    private int cod_idioma;

    public Livro(){
        
    }
    
    public Livro(Estoque Estoque, String idioma, double preco, int quantidade, int cod_idioma) {
        this.Estoque = Estoque;
        this.idioma = idioma;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cod_idioma = cod_idioma;
    }

    public int getCod_idioma() {
        return cod_idioma;
    }

    public void setCod_idioma(int cod_idioma) {
        this.cod_idioma = cod_idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque getEstoque() {
        return Estoque;
    }
}
