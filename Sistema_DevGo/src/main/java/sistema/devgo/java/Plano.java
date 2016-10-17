package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Plano {

    private float preco;
    private String tipoPlano;
    private Livro Livro[];

    public Plano(String descricao, String tipoCurso, String TipoMaterial, String TipoPlano, float preco) {

    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
