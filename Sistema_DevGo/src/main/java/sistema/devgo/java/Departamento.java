/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.devgo.java;

/**
 *
 * @author Natanael 
 */
public class Departamento {
    private long CodDepartamento;
    private String setor; 

    public  Departamento (long codDepartamento){
        this.CodDepartamento = codDepartamento;
       
    }

    public Departamento() {
       
    }

   
    public long getCodDepartamento() {
        return CodDepartamento;
    }

    /**
     * @param CodDepartamento the CodDepartamento to set
     */
    public void setCodDepartamento(long CodDepartamento) {
        this.CodDepartamento = CodDepartamento;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
