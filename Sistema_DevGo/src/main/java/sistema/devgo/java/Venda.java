
package sistema.devgo.java;

import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Venda extends Plano{
    private Date dataVenda;
    
    /*verificar metodo de venda
    public void Venda (String tipoContraro, String tipoCurso,String tipoPlano, float preço, Date dataVenda){
        
    }*/

    public Venda(String descricao, String tipoCurso, String TipoMaterial, String TipoPlano, float preco) {
        super(descricao, tipoCurso, TipoMaterial, TipoPlano, preco);
    }
}
