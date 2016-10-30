package sistema.devgo.java;

/**
 *
 * @author Erik
 */
public class Cliente {
    
    private Long codCliente;
    private String CNPJ;
    private String razaoSocial;
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone1;
    private String telefone2;
    private String email;

    //Construtor
    public Cliente(String CNPJ, String razaoSocial, String cep,String rua, String numero, String bairro, String cidade, String estado,String telefone1, String telefone2, String email) {
        
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.cep = cep;
        this.rua= rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email; 
        
    }

     public Cliente(Long codCliente,String CNPJ, String razaoSocial, String cep,
      String rua, String numero, String bairro, String cidade, String estado,String telefone1, String telefone2, String email){
         
        this.codCliente = codCliente;
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.cep = cep;
        this.rua= rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email; 
              
     }
     
     public Cliente(){
         
     }

  
    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the telefone1
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
    
}

