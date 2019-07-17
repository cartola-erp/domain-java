package net.cartola.domain;

import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 * 07/11/2015 00:17:21
 * //@author murilo
 */
//@Entity
//@Table(name = "forn_item")
public class FornecedorItem extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Fornecedor fornecedor;
    private Item item;
    private Integer leadTime;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_forn_item_id")
    //@SequenceGenerator(name = "seq_forn_item_id", sequenceName = "seq_forn_item_id", allocationSize = 1)
    //@Column(name = "forn_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "forn_id", nullable = false)
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name="lead_time")
    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FornecedorItem)) {
            return false;
        }
        FornecedorItem other = (FornecedorItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "FornecedorItem[id=" + id + ", fornecedor=\"" + this.fornecedor + "\", item=\"" + this.item + "\", leadTime=\"" + this.leadTime + "\" ]";
    }

}
