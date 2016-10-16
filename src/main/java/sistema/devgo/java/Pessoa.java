
package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Pessoa {

    

    
    private String email;
    private String telefone;
    
    public Pessoa(String email, String telefone){
        this.email=email;
        this.telefone=telefone;
    }
    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
