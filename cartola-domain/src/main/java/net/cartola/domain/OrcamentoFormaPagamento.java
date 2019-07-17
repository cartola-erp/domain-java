package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 02/11/2015 02:31:03
 * //@author murilo
 */
//@Entity
//@Table(name = "orca_form_paga")
//@XmlRootElement
public class OrcamentoFormaPagamento extends RegistroBase {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Orcamento orcamento;
    private ModoPagamento formaPagamento;
    private BigDecimal valor = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orca_form_paga_id")
    //@SequenceGenerator(name = "seq_orca_form_paga_id", sequenceName = "seq_orca_form_paga_id", allocationSize = 1)
    //@Column(name = "orca_form_paga_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "orca_id", nullable = false)
    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    //@ManyToOne
    //@JoinColumn(name = "form_paga_id", nullable = false)
    public ModoPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ModoPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    ////@Column(name = "valo", precision = 2)
    //@Column(name = "valo", nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
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
        if (!(object instanceof OrcamentoFormaPagamento)) {
            return false;
        }
        OrcamentoFormaPagamento other = (OrcamentoFormaPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "OrcamentoPagamento[id=" + id + ", formaPagamento=\"" + formaPagamento + "\", valor=" + valor + "]";
    }

}
