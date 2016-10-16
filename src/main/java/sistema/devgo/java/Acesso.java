
package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Acesso {
    private String usuario;
    private String senha;
    //Associando acesso a funcionario
    private Funcionario Funcionario;

    
    
    public void TipoPermissao( String usuario, String senha){
        this.usuario=usuario;
        this.senha=senha;
    }
    public Funcionario getFuncionario() {
        return Funcionario;
    }
}
