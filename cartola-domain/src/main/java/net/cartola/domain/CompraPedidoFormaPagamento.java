package net.cartola.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * 05/11/2015 16:29:42
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_pedi_form_paga")
//@XmlRootElement
public class CompraPedidoFormaPagamento extends RegistroBase {
    private static final long serialVersionUID = 999439499949491L;
    private Long id;
    private CompraPedido compraPedido;
    private ModoPagamento formaPagamento;
    private BigDecimal valor = BigDecimal.ZERO;
    private List<CompraPedidoPagamento> pagamentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_pedi_form_paga_id")
    //@SequenceGenerator(name = "seq_comp_pedi_form_paga_id", sequenceName = "seq_comp_pedi_form_paga_id", allocationSize = 1)
    //@Column(name = "comp_pedi_form_paga_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_pedi_id", nullable = false)
    public CompraPedido getCompraPedido() {
        return compraPedido;
    }

    public void setCompraPedido(CompraPedido compraPedido) {
        this.compraPedido = compraPedido;
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

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPagamento")
    public List<CompraPedidoPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<CompraPedidoPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraPedidoFormaPagamento)) {
            return false;
        }
        CompraPedidoFormaPagamento other = (CompraPedidoFormaPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CompraPedidoFormaPagamento[ id=" + id + " ]";
    }

}
