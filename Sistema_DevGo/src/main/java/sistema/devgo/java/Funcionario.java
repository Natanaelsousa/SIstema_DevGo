package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Funcionario {

    private String departamento;
    private int cpf;
    private String nome;
    private String sobrenome;

    //ASSOCIAÇÕES
    private Permissao Permissao;
    private Acesso Acesso;

    //Construtor
    public Funcionario(String departamento, int cpf, String nome, String sobrenome) {

        this.departamento = departamento;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    //Get e set de departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    //Get e set de CPF
    public void setCPF(int cpf) {
        this.cpf = cpf;
    }
    public int getCPF() {
        return cpf;
    }

    //Get e set de Nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Get e set de Sobrenome
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    //Get e Set de Permissao e Acesso(Associações)
   public Permissao getPermissao() {
        return Permissao;
    }
   public void setPermissao(Permissao Permissao) {
        this.Permissao = Permissao;
    }
   public Acesso getAcesso() {
        return Acesso;
    }
   public void setAcesso(Acesso Acesso) {
        this.Acesso = Acesso;
    }
   
   public void associarPermissao( Permissao tipoPermissao){
       // METODO PARA PERMISSAO DO FUNCIONARIO
       //VERIFICAR COMO FAZER
   }

}
