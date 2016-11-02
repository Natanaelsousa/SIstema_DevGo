
package sistema.devgo.java;

import java.util.Date;

/**
 *
 * @author Sibele
 */
public class Venda {

//    private Date dataVenda;
//    private int qtdeAluno;
//    private String idioma;
//    private Plano plano;
//    private double valor;
//    private String cliente;
    
    private Long codVenda;
    private Long codPlano;
    private Long codCliente;
    private Long codFuncionario;
    private int quantidadeAluno;
    private double valorVenda;
    private Date dataVenda;

    
    public Venda(Long codVenda, Long codPlano,Long codCliente,Long codFuncionario,int quantidadeAluno,double valorVenda,Date dataVenda ){
        this.codCliente = codCliente;
        this.codPlano = codPlano;
        this.codCliente = codCliente;
        this.codFuncionario = codFuncionario;
        this.quantidadeAluno = quantidadeAluno;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
          
    }
    
     public Venda(Long codPlano,Long codCliente,Long codFuncionario,int quantidadeAluno,double valorVenda,Date dataVenda ){
        this.codPlano = codPlano;
        this.codCliente = codCliente;
        this.codFuncionario = codFuncionario;
        this.quantidadeAluno = quantidadeAluno;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
          
    }
    
    public Venda(){
                 
    }
    
    /**
     * @return the codVenda
     */
    public Long getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(Long codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the codPlano
     */
    public Long getCodPlano() {
        return codPlano;
    }

    /**
     * @param codPlano the codPlano to set
     */
    public void setCodPlano(Long codPlano) {
        this.codPlano = codPlano;
    }

    /**
     * @return the codCliente
     */
    public Long getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the codFuncionario
     */
    public Long getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(Long codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the quantidadeAluno
     */
    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    /**
     * @param quantidadeAluno the quantidadeAluno to set
     */
    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    /**
     * @return the valorVenda
     */
    public double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
     
}
