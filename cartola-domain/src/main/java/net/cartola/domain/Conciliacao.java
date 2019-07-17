package net.cartola.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 12/09/2016 16:51:40
 *
 *@author ALEXANDRE.SCAVACINI
 */

public class Conciliacao extends RegistroBase {

    private static final long serialVersionUID = 2930480128352490132L;
    private Long id;
    private String naturezaLancamento;
    private int tpComplementoLancamento;
    private String ComplementoLancamento;
    private String cpmf;
    private Date data;
    private Date dataLancamento;
    private BigDecimal valorLancamento = new BigDecimal(BigInteger.ZERO);
    private String tipoLancamento;
    private int categoriaLancamento;
    private String codigoHistorico;
    private String historico;
    private String numeroDocumento;

   //@Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conc_id")
   //@SequenceGenerator(name = "seq_conc_id", sequenceName = "seq_conc_id", allocationSize = 1)
   //@Column(name = "conc_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   //@Column(name = "natu_lanc")
    public String getNaturezaLancamento() {
        return naturezaLancamento;
    }

    public void setNaturezaLancamento(String naturezaLancamento) {
        this.naturezaLancamento = naturezaLancamento;
    }

   //@Column(name = "tp_comp_lanc")
    public int getTpComplementoLancamento() {
        return tpComplementoLancamento;
    }

    public void setTpComplementoLancamento(int tpComplementoLancamento) {
        this.tpComplementoLancamento = tpComplementoLancamento;
    }

   //@Column(name = "comp_lanc")
    public String getComplementoLancamento() {
        return ComplementoLancamento;
    }

    public void setComplementoLancamento(String ComplementoLancamento) {
        this.ComplementoLancamento = ComplementoLancamento;
    }

   //@Column(name = "cpmf")
    public String getCpmf() {
        return cpmf;
    }

    public void setCpmf(String cpmf) {
        this.cpmf = cpmf;
    }

   //@Temporal(TemporalType.DATE)
   //@Column(name = "data_cont")
    public Date getData() {
        return data;
    }
   
    public void setData(Date data) {
        this.data = data;
    }

   //@Temporal(TemporalType.DATE)
   //@Column(name = "data_lanc")
    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

   //@Column(name = "valor_lanc")
    public BigDecimal getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(BigDecimal valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

   //@Column(name = "tp_lanc")
    public String getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(String tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

   //@Column(name = "cate_lanc")
    public int getCategoriaLancamento() {
        return categoriaLancamento;
    }

    public void setCategoriaLancamento(int categoriaLancamento) {
        this.categoriaLancamento = categoriaLancamento;
    }

   //@Column(name = "cod_hist")
    public String getCodigoHistorico() {
        return codigoHistorico;
    }

    public void setCodigoHistorico(String codigoHistorico) {
        this.codigoHistorico = codigoHistorico;
    }

   //@Column(name = "hist")
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

   //@Column(name = "num_doc")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
