package sistema.devgo.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Sibele
 */
public class UsuarioSistema {

    private String nome;

    private char[] hashSenha;
    
    private String senhaCripto;

    public void setSenhaCripto(String senhaCripto) {
        this.senhaCripto = senhaCripto;
    }

    private long  codFuncionario; //ROLES
    private String  departamento; //ROLES
    
    public UsuarioSistema() {
        
    }
    public UsuarioSistema(String nome, String senha) {
        this.nome = nome;
        this.hashSenha = gerarHashSenhaMD5(senha);
      
    }
      public UsuarioSistema(String nome, String senha, long codFuncionario) {
        this.nome = nome;
        this.hashSenha = gerarHashSenhaMD5(senha);
        this.codFuncionario = codFuncionario;
        this.departamento = departamento;
    }
//Lembrar de colocar o departamento como parametro para fazer  o filtro 
    public UsuarioSistema(String nome, String senha, long codFuncionario,String departamento) {
        this.nome = nome;
        this.hashSenha = gerarHashSenhaMD5(senha);
        this.codFuncionario = codFuncionario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char[] getHashSenha() {
        return hashSenha;
    }

    public long getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(long codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * Geração do hash da senha usando algoritmo MD5 (mais comum). Não usado
     * neste exemplo
     *
     * @param senha
     * @return
     */
    private char[] gerarHashSenhaMD5(String senha) {
        try {
      
       String salt = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";


      MessageDigest md = MessageDigest.getInstance("MD5");
      md.reset();
      byte[] digested = md.digest((salt + senha).getBytes());
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < digested.length; i++) {
        sb.append(Integer.toHexString(0xff & digested[i]));
      }
      return sb.toString().toCharArray();
    } catch (NoSuchAlgorithmException ex) {
      //Logger.getLogger(this.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    /**
     * Geração do hash da senha usando algoritmo PBKDF2WithHmacSHA1 (mais
     * seguro) Exemplo obtido em
     * http://www.javacodegeeks.com/2012/05/secure-password-storage-donts-dos-and.html
     *
     * Depois que o hash é gerado, não é possível recuperar a senha original.
     *
     * @param senha
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public static char[] gerarHashSenhaPBKDF2(String senha) throws NoSuchAlgorithmException, InvalidKeySpecException {
     // PBKDF2 with SHA-1 as the hashing algorithm. Note that the NIST
    // specifically names SHA-1 as an acceptable hashing algorithm for PBKDF2
    String algorithm = "PBKDF2WithHmacSHA1";
    // SHA-1 generates 160 bit hashes, so that's what makes sense here
    int derivedKeyLength = 160;
    // Pick an iteration count that works for you. The NIST recommends at
    // least 1,000 iterations:
    // http://csrc.nist.gov/publications/nistpubs/800-132/nist-sp800-132.pdf
    // iOS 4.x reportedly uses 10,000:
    // http://blog.crackpassword.com/2010/09/smartphone-forensics-cracking-blackberry-backup-passwords/
    int iterations = 2000;

    // SALT (EM SITUACOES REAIS, DEVEM SER DIFERENTES PARA CADA USUARIO)
    // Normalmente, deve ser alguma informação que, após cadastrado, não pode mais ser alterado.
    String salt = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

    KeySpec spec = new PBEKeySpec(senha.toCharArray(), salt.getBytes(), iterations, derivedKeyLength);
    SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);

    byte[] code = f.generateSecret(spec).getEncoded();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < code.length; i++) {
      sb.append(Integer.toHexString(0xff & code[i]));
    }
    System.out.println(sb.toString());
    return sb.toString().toCharArray();
  }
    
    

  public boolean autenticar(String nome, String senha) {
    if (this.nome != null) {
      try {
        return this.nome.equals(nome) && 
		Arrays.equals(this.hashSenha, gerarHashSenhaPBKDF2(senha));
      } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
        Logger.getLogger(UsuarioSistema.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return false;
    }

    /**
     * Verifica se usuário possui autorização de acesso baseado nos papeis que
     * possui.
     *
     * @param papelNecessario
     * @return
     */
    public List<Long> autorizado(long departamento) {
        List <Long> UsuarioAutorizado = new ArrayList<>();
        
            UsuarioAutorizado.add(departamento);
        
        
        return UsuarioAutorizado;
    }

    /**
     * @return the senhaCripto
     */
    public String getSenhaCripto() {
        return senhaCripto;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
