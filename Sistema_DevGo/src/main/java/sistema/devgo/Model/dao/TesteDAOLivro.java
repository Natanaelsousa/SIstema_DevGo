/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.Model.dao;

import java.sql.SQLException;
import sistema.devgo.java.Livro;

/**
 *
 * @author Alessandra
 */
public class TesteDAOLivro {

    public static void main(String[] args) throws SQLException {

        //recebendo do browser
        String idioma = "Ingles";
        double preco = 20.00;
        int quantidade = 2;

          //tratar os dados necessários
        //instanciar o livro
        Livro l = new Livro(null, idioma, preco, quantidade);
        //instanciar o livroDAO
        LivroDAO ldao = new LivroDAO();

        try {

            // metodo salvar sobescrito do DAO
            ldao.salvar(l);

        } catch (Exception e) {

            System.out.println("O livro informado já possui cadastro!");
        }
/**
        String idioma2 = "Ingles";
        double preco2 = 20.00;
        int quantidade2 = 2;

         Livro l2 = new Livro(null, idioma, preco, quantidade);

        ldao.editar(l2);**/

    }
}
