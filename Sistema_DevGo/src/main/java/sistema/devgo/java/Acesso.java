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

    
    /*
    public ? TipoPermissao( String usuario, String senha){
      //VERIFICAR COMO FAZER   
    }*/
    
    public Funcionario getFuncionario() {
        return Funcionario;
    }
}
