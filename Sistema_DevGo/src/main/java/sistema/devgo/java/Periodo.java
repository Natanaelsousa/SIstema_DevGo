package sistema.devgo.java;

/**
 *
 * @author Sibele
 */
public class Periodo {

    private long cod_periodo;
    private String nm_periodo;

    public Periodo() {
    }

    public Periodo(long cod_plano, String nm_periodo) {

        this.nm_periodo = nm_periodo;
    }

    public Periodo(long cod_periodo, long cod_plano, String nm_periodo) {
        this.cod_periodo = cod_periodo;

        this.nm_periodo = nm_periodo;
    }

    public long getCod_periodo() {
        return cod_periodo;
    }

    public void setCod_periodo(long cod_periodo) {
        this.cod_periodo = cod_periodo;
    }

    public String getNm_periodo() {
        return nm_periodo;
    }

    public void setNm_periodo(String nm_periodo) {
        this.nm_periodo = nm_periodo;
    }

}
