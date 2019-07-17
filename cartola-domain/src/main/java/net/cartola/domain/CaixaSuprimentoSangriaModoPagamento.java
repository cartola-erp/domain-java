package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 14/04/2016 20:03:10
 * //@author murilo
 */
//@Entity
//@Table(name = "caix_supr_sang_modo_paga")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CaixaSuprimentoSangriaModoPagamento.findAll", query = "SELECT c FROM CaixaSuprimentoSangriaModoPagamento c")})
public class CaixaSuprimentoSangriaModoPagamento extends RegistroBase {
    private static final long serialVersionUID = 13331313314243152L;

    private Long id;
    private ModoPagamento modoPagamento;
    private BigDecimal valor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caix_supr_sang_modo_paga_id")
    //@SequenceGenerator(name = "seq_caix_supr_sang_modo_paga_id", sequenceName = "seq_caix_supr_sang_modo_paga_id", allocationSize = 1)
    //@Column(name = "caix_supr_sang_modo_paga_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "modo_paga_id", nullable = false, updatable = false)
    public ModoPagamento getModoPagamento() {
        return modoPagamento;
    }

    public void setModoPagamento(ModoPagamento modoPagamento) {
        this.modoPagamento = modoPagamento;
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
        if (!(object instanceof CaixaSuprimentoSangriaModoPagamento)) {
            return false;
        }
        CaixaSuprimentoSangriaModoPagamento other = (CaixaSuprimentoSangriaModoPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "net.cartola.model.CaixaSangriaFormaPagamento[ id=" + id + " ]";
    }

}
