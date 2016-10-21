package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Cliente  {

    private String CNPJ;
    private String razaoSocial;
    private String endereco;

    //Construtor
    public Cliente(String CNPJ, String razaoSocial, String endereco) {
        
        this.CNPJ=CNPJ;
        this.razaoSocial=razaoSocial;
        this.endereco=endereco;
    }
   
    
    public void Cliente( String CNPJ, String razaoSocial, String endereco) {
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.razaoSocial = razaoSocial;
    }

    //Get e Set de CNPJ
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    //Get e Set de RazaoSocial
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    //Get e Set de RazaoSocial
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
