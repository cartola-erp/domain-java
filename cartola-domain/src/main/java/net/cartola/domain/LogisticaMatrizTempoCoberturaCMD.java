package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
/**
 * 28/10/2015 14:52:21
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtc_cmds")
//@XmlRootElement
public class LogisticaMatrizTempoCoberturaCMD extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 207543298711L;
    private Long id;
    private LogisticaMatrizTempoCobertura matriz;
    private BigDecimal cmd = BigDecimal.ZERO;
    private Set<LogisticaMatrizTempoCoberturaValor> valores;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtc_cmd_id")
    //@SequenceGenerator(name = "seq_logi_mtc_cmd_id", sequenceName = "seq_logi_mtc_cmd_id", allocationSize = 1)
    //@Column(name = "logi_mtc_cmd_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name="logi_mtc_id")
    public LogisticaMatrizTempoCobertura getMatriz() {
        return matriz;
    }

    public void setMatriz(LogisticaMatrizTempoCobertura matriz) {
        this.matriz = matriz;
    }
    
    //@Column(name="cmd", precision = 13, scale = 4, nullable = false)
    public BigDecimal getCmd() {
        return cmd;
    }

    public void setCmd(BigDecimal cmd) {
        this.cmd = cmd;
    }

    //@OneToMany(mappedBy = "cmd")
    public Set<LogisticaMatrizTempoCoberturaValor> getValores() {
        return valores;
    }

    public void setValores(Set<LogisticaMatrizTempoCoberturaValor> valores) {
        this.valores = valores;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof LogisticaMatrizTempoCoberturaCMD)) {
            return false;
        }
        LogisticaMatrizTempoCoberturaCMD other = (LogisticaMatrizTempoCoberturaCMD) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "LogistricaMatrizTempoCoberturaCMD[id=" + id + ", valor='" + cmd + "']";
    }

}
