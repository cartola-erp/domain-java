package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 02/11/2015 00:59:06
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtc_valo")
//@XmlRootElement
public class LogisticaMatrizTempoCoberturaValor extends RegistroBase {

    private static final long serialVersionUID = 1239671623525511L;
    private Long id;
    private LogisticaMatrizTempoCoberturaCMD cmd;
    private LogisticaMatrizTempoCoberturaCusto custo;
    private String curva;
    private BigDecimal valor = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtc_valor_id")
    //@SequenceGenerator(name = "seq_logi_mtc_valor_id", sequenceName = "seq_logi_mtc_valor_id", allocationSize = 1)
    //@Column(name = "logi_mtc_valor_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "logi_mtc_cmd_id") 
    public LogisticaMatrizTempoCoberturaCMD getCmd() {
        return cmd;
    }

    public void setCmd(LogisticaMatrizTempoCoberturaCMD cmd) {
        this.cmd = cmd;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "logi_mtc_cust_id", nullable = false)
    public LogisticaMatrizTempoCoberturaCusto getCusto() {
        return custo;
    }

    public void setCusto(LogisticaMatrizTempoCoberturaCusto custo) {
        this.custo = custo;
    }

    /*
    
    D�gito de Curva ABC utilizada
    //@return
    */
    
    //@Column(name = "curv", nullable = false)
    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }
    
    
    //@Column(name="valo", precision = 13, scale = 4, nullable = false)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LogisticaMatrizTempoCoberturaValor other = (LogisticaMatrizTempoCoberturaValor) obj;
        if (!Objects.equals(this.curva, other.curva)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cmd, other.cmd)) {
            return false;
        }
        if (!Objects.equals(this.custo, other.custo)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "LogisticaMatrizTempoCoberturaValor[id=" + id + "]";
    }
}
