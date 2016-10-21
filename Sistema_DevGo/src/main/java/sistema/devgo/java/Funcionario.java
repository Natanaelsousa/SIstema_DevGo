package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Funcionario {

    private String departamento;
    private int CPF;
    private String nome;
    private String sobrenome;

    //ASSOCIAÇÕES
    private Permissao Permissao;
    private Acesso Acesso;

    //Construtor
    public Funcionario(String departamento, int CPF, String nome, String sobrenome) {

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

    //Get e set de departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Get e set de CPF
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
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

    //Get de Permissao e Acesso(Associações)
    public Permissao getPermissao() {
        return Permissao;
    }

    public Acesso getAcesso() {
        return Acesso;
    }

}
