package net.cartola.domain;
//
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
//import javax.persistence.UniqueConstraint;

/**
 * 23/06/2016 09:20:46
 * //@author murilo
 */
//@Entity
//@Table(name = "item_devo_ofen", uniqueConstraints = //@UniqueConstraint(name = "unk_item_devo_ofen_item_tipo", columnNames = "item_id, item_devo_ofen_tipo_id"))
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "ItemDevolucaoOfensor.findAll", query = "SELECT i FROM ItemDevolucaoOfensor i")})
public class ItemDevolucaoOfensor extends RegistroBase {

    private static final long serialVersionUID = 897170828296465412L;
    private Long id;
    private Item item;
    private ItemDevolucaoOfensorTipo itemDevolucaoOfensorTipo;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_devo_ofen_id")
    //@SequenceGenerator(name = "seq_item_devo_ofen_id", sequenceName = "seq_item_devo_ofen_id", allocationSize = 1)
    //@Column(name = "item_devo_ofen_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_devo_ofen_tipo_id", nullable = false)
    public ItemDevolucaoOfensorTipo getItemDevolucaoOfensorTipo() {
        return itemDevolucaoOfensorTipo;
    }

    public void setItemDevolucaoOfensorTipo(ItemDevolucaoOfensorTipo itemDevolucaoOfensorTipo) {
        this.itemDevolucaoOfensorTipo = itemDevolucaoOfensorTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemDevolucaoOfensor)) {
            return false;
        }
        ItemDevolucaoOfensor other = (ItemDevolucaoOfensor) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemDevolucaoOfensor[id=" + id + "]";
    }

}
