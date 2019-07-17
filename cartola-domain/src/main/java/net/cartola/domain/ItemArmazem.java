package net.cartola.domain;

/**
 * Essa classe serve para definir para cada armazem
 * em qual zona o item deve ser armazenado.
 * 15/05/2016 15:19:03
 * //@author murilo
 */
//@Entity
//@Table(name = "item_arma", uniqueConstraints = {
     //@UniqueConstraint(columnNames = "item, armazem", name = "unk_item_arma_item_arma")
//})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ItemArmazem.findAll", query = "SELECT ia FROM ItemArmazem ia")
 //  ,//@NamedQuery(name = "ItemArmazem.findByItemIdArmazemId", query = "SELECT ia FROM ItemArmazem ia WHERE ia.item.id=:itemId AND ia.armazem.id=:armazemId")})
////@Audited //Hibernate Envers
public class ItemArmazem extends RegistroBase {
    private static final long serialVersionUID = 76254636272773271L;
    private Long id;
    private Item item;
    private Armazem armazem;
    private ArmazemZona armazemZona;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_arma_id")
    //@SequenceGenerator(name = "seq_item_arma_id", sequenceName = "seq_item_arma_id", allocationSize = 1)
    //@Column(name = "item_arma_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@NotNull
    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@NotNull
    //@ManyToOne
    //@JoinColumn(name = "arma_id", nullable = false)
    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    //@NotNull
    //@ManyToOne
    //@JoinColumn(name = "arma_zona_id", nullable = false)
    public ArmazemZona getArmazemZona() {
        return armazemZona;
    }

    public void setArmazemZona(ArmazemZona armazemZona) {
        this.armazemZona = armazemZona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemArmazem)) {
            return false;
        }
        ItemArmazem other = (ItemArmazem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemArmazem[id=" + id + "]";
    }

}
