package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Pessoa {
    private String email;
    private String telefone;

    
    //Construtor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    //Get e Set do atributo email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
     //Get e Set do atributo Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
