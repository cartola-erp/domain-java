package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 15/05/2016 16:04:09
 *
 * //@author murilo
 */
//@Entity
//@Table(name = "esto_posi")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "EstoquePosicao.findAll", query = "SELECT ep FROM EstoquePosicao ep")})
public class EstoquePosicao implements Serializable {

    private static final long serialVersionUID = 1791490126804239841L;

    private Long id;
    private Estoque estoque;
    private BigDecimal saldo = BigDecimal.ZERO;
    private BigDecimal precoCusto = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_esto_posi_id")
    //@SequenceGenerator(name = "seq_esto_posi_id", sequenceName = "seq_esto_posi_id", allocationSize = 1)
    //@Column(name = "esto_posi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "esto_id", nullable = false, updatable = false)
    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    //@Column(name = "sald", precision = 13, scale = 4, nullable = false, updatable = false)
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    //@Column(name = "prec_cust", precision = 13, scale = 4, nullable = false, updatable = false)
    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EstoquePosicao)) {
            return false;
        }
        EstoquePosicao other = (EstoquePosicao) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "EstoquePosicao[id=" + id + "]";
    }

}
