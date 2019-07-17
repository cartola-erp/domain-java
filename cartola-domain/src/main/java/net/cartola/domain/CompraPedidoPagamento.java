package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 05/11/2015 16:28:45
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_pedi_paga")
//@XmlRootElement
public class CompraPedidoPagamento extends RegistroBase {

    private static final long serialVersionUID = 1234567890L;
    private Long id;
    private CompraPedidoFormaPagamento formaPagamento;
    private BigDecimal valor = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_pedi_paga_id")
    //@SequenceGenerator(name = "seq_comp_pedi_paga_id", sequenceName = "seq_comp_pedi_paga_id", allocationSize = 1)
    //@Column(name = "comp_pedi_paga_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "form_paga_id")
    public CompraPedidoFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(CompraPedidoFormaPagamento formaPagamento) {
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
        if (!(object instanceof CompraPedidoPagamento)) {
            return false;
        }
        CompraPedidoPagamento other = (CompraPedidoPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CompraPedidoPagamento[ id=" + id + " ]";
    }

}
