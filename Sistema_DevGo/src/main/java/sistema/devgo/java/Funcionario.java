package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Funcionario extends Pessoa {

    private String departamento;
    private int CPF;
    private String nome;
    private String sobrenome;
    //ASSOCIAÇÕES
    private Permissao Permissao;
    private Acesso Acesso;

   
    
    public Funcionario(String email, String telefone) {
        super(email, telefone);
        this.departamento = departamento;
        this.CPF = CPF;
        this.nome = nome;
        this.sobrenome = sobrenome;

    }
    //esperar resposta para arrumar

    public void associarPermissao(Permissao tipoPermissao) {
      /*if (departamento == "ti") {
            tipoPermissao == ti;
        }
        else if (departamento == "financeiro"){
            tipoPermissao == financeiro;
        }
        else if (departamento == "serviços"){
            tipoPermissao == servicos;
        }*/
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    //GETTERS DAS ASSOCIAÇÕES
     public Permissao getPermissao() {
        return Permissao;
    }

    public Acesso getAcesso() {
        return Acesso;
    }

}
