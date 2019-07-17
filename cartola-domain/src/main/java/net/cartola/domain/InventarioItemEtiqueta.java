package net.cartola.domain;

import java.io.Serializable;

/**
 * 23/03/2016 12:31:43
 * ////@author murilo
 */
//@Entity
//@Table(name = "inve_item_etiq")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "InventarioItemEtiqueta.findAll", query = "SELECT i FROM InventarioItemEtiqueta i")})
public class InventarioItemEtiqueta extends RegistroBase  implements Serializable {
    private static final long serialVersionUID = 778855434433976543L;
    
    private Long id;
    private Inventario inventario;
    private ItemEtiqueta itemEtiqueta;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inve_item_etiq_id")
    //@SequenceGenerator(name = "seq_inve_item_etiq_id", sequenceName = "seq_inve_item_etiq_id", allocationSize = 1)
    //@Column(name = "inve_item_etiq_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "inve_id", nullable = false, updatable = false)
    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_etiq_id", updatable = false, nullable = false)
    public ItemEtiqueta getItemEtiqueta() {
        return itemEtiqueta;
    }

    public void setItemEtiqueta(ItemEtiqueta itemEtiqueta) {
        this.itemEtiqueta = itemEtiqueta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InventarioItemEtiqueta)) {
            return false;
        }
        InventarioItemEtiqueta other = (InventarioItemEtiqueta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "InventarioItemEtiqueta[id=" + id + "]";
    }

}
