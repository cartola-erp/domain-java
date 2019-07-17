package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 14/04/2016 19:51:01
 * //@author murilo
 */
//@Entity
//@Table(name = "caix_supr_sang")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CaixaSuprimentoSangria.findAll", query = "SELECT c FROM CaixaSuprimentoSangria c")})
public class CaixaSuprimentoSangria extends RegistroBase {
    private static final long serialVersionUID = 291892192918822332L;
    private Long id;
    private CaixaSuprimentoSangriaTipo caixaSuprimentoSangriaTipo;
    private Caixa caixa;
    private BigDecimal valor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caix_supr_sang_id")
    //@SequenceGenerator(name = "seq_caix_supr_sang_id", sequenceName = "seq_caix_supr_sang_id", allocationSize = 1)
    //@Column(name = "caix_supr_sang_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "caix_id", nullable = false, updatable = false)
    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "caix_supr_sang_tipo", nullable = false)
    public CaixaSuprimentoSangriaTipo getCaixaSuprimentoSangriaTipo() {
        return caixaSuprimentoSangriaTipo;
    }

    public void setCaixaSuprimentoSangriaTipo(CaixaSuprimentoSangriaTipo caixaSuprimentoSangriaTipo) {
        this.caixaSuprimentoSangriaTipo = caixaSuprimentoSangriaTipo;
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
    public boolean equals(Object object) {
        if (!(object instanceof CaixaSuprimentoSangria)) {
            return false;
        }
        CaixaSuprimentoSangria other = (CaixaSuprimentoSangria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "net.cartola.model.CaixaSangria[ id=" + id + " ]";
    }

}
