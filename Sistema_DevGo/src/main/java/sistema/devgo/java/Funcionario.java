package sistema.devgo.java;

import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Funcionario {

    private long CodDepartamento;
    private String cpf;
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dtNascimento;
    private String status;
    private long CodFuncionario;

    //Construtores
    public Funcionario() {

    }

    public Funcionario(Date dataNasc, Long departamento, String cpf, String nome, String sobrenome) {

        this.CodDepartamento = departamento;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.status = "ATIVO";
        this.dtNascimento = dataNasc;

    }

    public Funcionario(Long idFuncionario, Long departamento, String cpf, String nome, String sobrenome) {

        this.CodDepartamento = departamento;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.status = "ATIVO";
        this.CodFuncionario = idFuncionario;

    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dtNascimento
     */
    public Date getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the iddepartamento
     */
    public Long getCodDepartamento() {
        return CodDepartamento;
    }

    /**
     * @param iddepartamento the iddepartamento to set
     */
    public void setCodDepartamento(Long iddepartamento) {
        this.CodDepartamento = iddepartamento;
    }

    /**
     * @return the idFuncionario
     */
    public Long getCodFuncionario() {
        return CodFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setCodFuncionario(Long idFuncionario) {
        this.CodFuncionario = idFuncionario;
    }

}
