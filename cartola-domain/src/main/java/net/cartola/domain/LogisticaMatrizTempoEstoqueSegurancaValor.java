package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * 02/11/2015 00:59:21
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtes_valo")
//@XmlRootElement
public class LogisticaMatrizTempoEstoqueSegurancaValor extends RegistroBase {
    private static final long serialVersionUID = 95967984500505091L;
    private Long id;
    private LogisticaMatrizTempoEstoqueSegurancaCMD cmd;
    private LogisticaMatrizTempoEstoqueSegurancaCusto custo;
    private String curva;
    private BigDecimal valor = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtes_valor_id")
    //@SequenceGenerator(name = "seq_logi_mtes_valor_id", sequenceName = "seq_logi_mtes_valor_id", allocationSize = 1)
    //@Column(name = "logi_mtes_valor_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "logi_mtes_cmd_id") 
    public LogisticaMatrizTempoEstoqueSegurancaCMD getCmd() {
        return cmd;
    }

    public void setCmd(LogisticaMatrizTempoEstoqueSegurancaCMD cmd) {
        this.cmd = cmd;
    }

    //@ManyToOne
    //@JoinColumn(name = "logi_mtes_custo_id", nullable = false)
    public LogisticaMatrizTempoEstoqueSegurancaCusto getCusto() {
        return custo;
    }

    public void setCusto(LogisticaMatrizTempoEstoqueSegurancaCusto custo) {
        this.custo = custo;
    }

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
        final LogisticaMatrizTempoEstoqueSegurancaValor other = (LogisticaMatrizTempoEstoqueSegurancaValor) obj;
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
        return "LogisticaMatrizTempoEstoqueSegurancaValor[ id=" + id + " ]";
    }

}
