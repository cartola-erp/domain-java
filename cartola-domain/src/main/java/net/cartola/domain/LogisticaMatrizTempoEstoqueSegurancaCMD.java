package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * 28/10/2015 16:47:44
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtes_cmds")
//@XmlRootElement
public class LogisticaMatrizTempoEstoqueSegurancaCMD extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 666661881811L;
    private Long id;
    private LogisticaMatrizTempoEstoqueSeguranca matriz;
    private BigDecimal cmd = BigDecimal.ZERO;
    private Set<LogisticaMatrizTempoEstoqueSegurancaValor> valores;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtes_cmds_id")
    //@SequenceGenerator(name = "seq_logi_mtes_cmds_id", sequenceName = "seq_logi_mtes_cmds_id", allocationSize = 1)
    //@Column(name = "logi_mtes_cmds_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name="logi_mtes_id")
    public LogisticaMatrizTempoEstoqueSeguranca getMatriz() {
        return matriz;
    }

    public void setMatriz(LogisticaMatrizTempoEstoqueSeguranca matriz) {
        this.matriz = matriz;
    }

    //@Column(name="cmd", nullable = false, 
   // columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getCmd() {
        return cmd;
    }

    public void setCmd(BigDecimal cmd) {
        this.cmd = cmd;
    }

    //@OneToMany(mappedBy = "cmd")
    public Set<LogisticaMatrizTempoEstoqueSegurancaValor> getValores() {
        return valores;
    }

    public void setValores(Set<LogisticaMatrizTempoEstoqueSegurancaValor> valores) {
        this.valores = valores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof LogisticaMatrizTempoEstoqueSegurancaCMD)) {
            return false;
        }
        LogisticaMatrizTempoEstoqueSegurancaCMD other = (LogisticaMatrizTempoEstoqueSegurancaCMD) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "LogisticaMatrizTempoEstoqueSegurancaCMD[id=" + id + ", valor='" + cmd + "']";
    }

}
