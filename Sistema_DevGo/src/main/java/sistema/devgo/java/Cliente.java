package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Cliente extends Pessoa {

    private String CNPJ;
    private String razaoSocial;
    private String endereco;

    public Cliente(String CNPJ, String razaoSocial, String endereco) {
        super(CNPJ, endereco);
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
