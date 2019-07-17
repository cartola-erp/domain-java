
package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 16/08/2016 14:54:25
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_cota_forn_item")
//@XmlRootElement
public class CompraCotacaoFornecedorItem extends RegistroBase {

    private static final long serialVersionUID = 92040249416525321L;
    private Long id;
    private CompraCotacaoItem compraCotacaoItem;
    private CompraCotacaoFornecedor compraCotacaoFornecedor;
    private BigDecimal quantidadeDisponivel = BigDecimal.ZERO;
    private BigDecimal preco = BigDecimal.ZERO;
    private Date previsaoEntrega;
    private boolean classificado = false;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_cota_forn_item_id")
    //@SequenceGenerator(name = "seq_comp_cota_forn_item_id", sequenceName = "seq_comp_cota_forn_item_id", allocationSize = 1)
    //@Column(name = "comp_cota_forn_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_cota_item_id", nullable = false)
    public CompraCotacaoItem getCompraCotacaoItem() {
        return compraCotacaoItem;
    }

    public void setCompraCotacaoItem(CompraCotacaoItem compraCotacaoItem) {
        this.compraCotacaoItem = compraCotacaoItem;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_cota_forn_id", nullable = false)
    public CompraCotacaoFornecedor getCompraCotacaoFornecedor() {
        return compraCotacaoFornecedor;
    }

    public void setCompraCotacaoFornecedor(CompraCotacaoFornecedor compraCotacaoFornecedor) {
        this.compraCotacaoFornecedor = compraCotacaoFornecedor;
    }

    //@Column(name = "quan_disp", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(BigDecimal quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //@Column(name = "prec", precision = 13, scale = 6, nullable = false)
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="prev_entr")
    public Date getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(Date previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    //@Column(name="clas", nullable = false)
    public boolean isClassificado() {
        return classificado;
    }

    public void setClassificado(boolean classificado) {
        this.classificado = classificado;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraCotacaoFornecedorItem)) {
            return false;
        }
        CompraCotacaoFornecedorItem other = (CompraCotacaoFornecedorItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "CompraCotacaoFornecedorItem[id=" + id + "]";
    }

}
