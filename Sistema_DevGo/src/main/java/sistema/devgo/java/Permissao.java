package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Permissao {

    private String departamento;

    public void nivelPermissao(String departamento) {
        // 
    }
//
    public int validaPermissao(Permissao tipoPermissao) {

        if ("ti".equals(tipoPermissao.getDepartamento())) {
            return 1;
        } else if ("financeiro".equals(tipoPermissao)) {
            return 2;
        } else if ("serviços".equals(tipoPermissao)) {
            return 3;
        }
        return 0;
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
