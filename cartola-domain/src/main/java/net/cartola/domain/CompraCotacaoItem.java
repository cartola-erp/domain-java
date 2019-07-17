
package net.cartola.domain;

import java.math.BigDecimal;
import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 16/08/2016 14:53:28
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_cota_item")
//@XmlRootElement
public class CompraCotacaoItem extends RegistroBase implements Comparable<CompraCotacaoItem> {

    private static final long serialVersionUID = 882746363621L;
    private Long id;
    private CompraCotacao compraCotacao;
    private Item item;
    private BigDecimal quantidade = BigDecimal.ZERO;
    private List<CompraCotacaoFornecedorItem> itensFornecedor;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_cota_item_id")
    //@SequenceGenerator(name = "seq_comp_cota_item_id", sequenceName = "seq_comp_cota_item_id", allocationSize = 1)
    //@Column(name = "comp_cota_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_cota_id", nullable = false)
    public CompraCotacao getCompraCotacao() {
        return compraCotacao;
    }

    public void setCompraCotacao(CompraCotacao compraCotacao) {
        this.compraCotacao = compraCotacao;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "quan", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    //@OneToMany(mappedBy = "compraCotacaoItem")
    public List<CompraCotacaoFornecedorItem> getItensFornecedor() {
        return itensFornecedor;
    }

    public void setItensFornecedor(List<CompraCotacaoFornecedorItem> itensFornecedor) {
        this.itensFornecedor = itensFornecedor;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraCotacaoItem)) {
            return false;
        }
        CompraCotacaoItem other = (CompraCotacaoItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "CompraCotacaoItem[id=" + id + "]";
    }

    //@Override
    public int compareTo(CompraCotacaoItem o) {
        if (this.item == null && o.item == null) {
            return 0;
        } else {
            if (this.item.getSimilaridade().equals(o.item.getSimilaridade())) {
                return this.item.getSimilaridadeQualificador().compareTo(o.item.getSimilaridadeQualificador());
            } else {
                return this.item.getSimilaridade().compareTo(o.item.getSimilaridade());
            }
        }
    }

}
