package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Acesso {
    
    private String usuario;
    private String senha;
    private Funcionario Funcionario;
   
      
     public Acesso(String usuario, String senha){
        
         this.usuario = usuario;
         this.senha = senha;
        
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the Funcionario
     */
    public Funcionario getFuncionario() {
        return Funcionario;
    }

    /**
     * @param Funcionario the Funcionario to set
     */
    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }
    
      
    
    
}
