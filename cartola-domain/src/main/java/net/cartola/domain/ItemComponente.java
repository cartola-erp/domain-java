package net.cartola.domain;

/**
 * 26/10/2015 11:55:35
 * //@author murilo
 */
//@Entity
//@Table(name = "item_comp", uniqueConstraints = {
     //@UniqueConstraint(columnNames = "item_cpst_id, item_cpnt_id", name = "unk_item_cpst_cpnt")
//})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ItemComponente.findAll", query = "SELECT c FROM ItemComponente c")
  // ,//@NamedQuery(name = "ItemComponente.findAllByComposto", query = "SELECT c FROM ItemComponente c WHERE c.composto=:composto")})
public class ItemComponente extends RegistroBase implements Comparable<ItemComponente> {
    private static final long serialVersionUID = 1L;
    private Long id;
    private int ordem;
    private Item composto;
    private Item componente;
    private double quantidade;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_comp_id")
    //@SequenceGenerator(name = "seq_item_comp_id", sequenceName = "seq_item_comp_id", allocationSize = 1)
    //@Column(name = "item_comp_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "orde", nullable = false, scale = 3)
    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_cpst_item_id")
    public Item getComposto() {
        return composto;
    }

    public void setComposto(Item composto) {
        this.composto = composto;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_cpnt_item_id")
    public Item getComponente() {
        return componente;
    }

    public void setComponente(Item componente) {
        this.componente = componente;
    }

    //@Column(name="quan", precision = 13, scale = 4, nullable = false)
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemComponente)) {
            return false;
        }
        ItemComponente other = (ItemComponente) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "ItemComponente[ id=" + id + ", composto=\"" + composto + "\", componente=\"" + componente + "\", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(ItemComponente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
