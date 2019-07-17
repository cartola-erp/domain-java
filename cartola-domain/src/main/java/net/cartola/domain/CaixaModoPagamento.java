package net.cartola.domain;

import java.math.BigDecimal;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 14/04/2016 20:01:00
 * //@author murilo
 */
////@Entity
////@Table(name = "caix_modo_paga")
////@XmlRootElement
////@NamedQueries({
//    //@NamedQuery(name = "CaixaModoPagamento.findAll", query = "SELECT c FROM CaixaModoPagamento c")})
public class CaixaModoPagamento extends RegistroBase {
    private static final long serialVersionUID = 16346767436734763L;

    private Long id;
    private Caixa caixa;
    private ModoPagamento modoPagamento;
    private BigDecimal soma;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caix_form_paga_id")
    //@SequenceGenerator(name = "seq_caix_form_paga_id", sequenceName = "seq_caix_form_paga_id", allocationSize = 1)
    //@Column(name = "caix_form_paga_id")
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

    //@ManyToOne
    //@JoinColumn(name = "modo_paga_id", nullable = false, updatable = false)
    public ModoPagamento getModoPagamento() {
        return modoPagamento;
    }

    public void setModoPagamento(ModoPagamento modoPagamento) {
        this.modoPagamento = modoPagamento;
    }

    //@Column(name="soma", precision = 13, scale = 4, nullable = false)
    public BigDecimal getSoma() {
        return soma;
    }

    public void setSoma(BigDecimal soma) {
        this.soma = soma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaixaModoPagamento)) {
            return false;
        }
        CaixaModoPagamento other = (CaixaModoPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "net.cartola.model.CaixaModoPagamento[ id=" + id + " ]";
    }

}
