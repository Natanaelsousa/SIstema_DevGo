package sistema.devgo.java;

/**
 *
 * @author Natanael 
 */
public class Permissao {

    private String usuario;
    private String senha;
    private long cod_permissao;
    private long cod_funcionario;

    public Permissao (){
        
    }
    
    public Permissao (String usuario, String senha, long cod_funcionario){
        this.usuario = usuario;
        this.senha = senha;
        this.cod_funcionario = cod_funcionario;
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
     * @return the cod_permissao
     */
    public long getCod_permissao() {
        return cod_permissao;
    }

    /**
     * @param cod_permissao the cod_permissao to set
     */
    public void setCod_permissao(long cod_permissao) {
        this.cod_permissao = cod_permissao;
    }

    /**
     * @return the cod_funcionario
     */
    public long getCod_funcionario() {
        return cod_funcionario;
    }

    /**
     * @param cod_funcionario the cod_funcionario to set
     */
    public void setCod_funcionario(long cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

  

    }


