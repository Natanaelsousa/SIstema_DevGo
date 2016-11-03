/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Livro {

    private Estoque Estoque;
    private String idioma;
    private double preco;
    private int quantidade;

    public Livro(){
        
    }
    
    public Livro(Estoque Estoque, String idioma, double preco, int quantidade) {
        this.Estoque = Estoque;
        this.idioma = idioma;
        this.preco = preco;
        this.quantidade = quantidade;
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
