package net.cartola.domain;


/**
 * 26/10/2015 11:00:41
 * //@author murilo
 */
//@Entity
//@Table(name = "item_fina")
//@XmlRootElement
////@Audited //Hibernate Envers
public class ItemFinalidade extends RegistroBase {
    private static final long serialVersionUID = 1L;

    private Long id;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_fina_id")
    //@SequenceGenerator(name = "seq_item_fina_id", sequenceName = "seq_item_fina_id", allocationSize = 1)
    //@Column(name = "item_fina_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemFinalidade)) {
            return false;
        }
        ItemFinalidade other = (ItemFinalidade) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemFinalidade[ id=" + id + " ]";
    }

}
