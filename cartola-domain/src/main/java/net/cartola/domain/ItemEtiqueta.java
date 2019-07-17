package net.cartola.domain;


/**
 * 13/03/2016 15:57:42
 * //@author murilo
 */
//@Entity
//@Table(name = "item_etiq")
//@XmlRootElement
//@NamedQueries({
     //@NamedQuery(name = "ItemEtiqueta.findAll", query = "SELECT ii FROM ItemEtiqueta ii")
 //  , //@NamedQuery(name = "ItemEtiqueta.findByArmazemEnderecoId", query = "SELECT ii FROM ItemEtiqueta ii WHERE ii.armazemEndereco.id=:armazemEnderecoId")
  // , //@NamedQuery(name = "ItemEtiqueta.findByItemIdArmazemId", query = "SELECT ii FROM ItemEtiqueta ii WHERE ii.item.id=:itemId AND ii.armazemEndereco.armazem.id=:armazemId")})
////@Audited //Hibernate Envers
public class ItemEtiqueta extends RegistroBase {
    private static final long serialVersionUID = 7237327740945690501L;
    private Long id;
    private Short impressao = 0;
    private Item item;
    private ItemEndereco itemEndereco;
    private ArmazemEndereco armazemEndereco;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_etiq_id")
    //@SequenceGenerator(name = "seq_item_etiq_id", sequenceName = "seq_item_etiq_id", allocationSize = 1)
    //@Column(name = "item_etiq_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "impr", nullable = false)
    public Short getImpressao() {
        return impressao;
    }

    public void setImpressao(Short impressao) {
        this.impressao = impressao;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false, updatable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_ende_id")
    public ItemEndereco getItemEndereco() {
        return itemEndereco;
    }

    public void setItemEndereco(ItemEndereco itemEndereco) {
        this.itemEndereco = itemEndereco;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_ende_id")
    public ArmazemEndereco getArmazemEndereco() {
        return armazemEndereco;
    }

    public void setArmazemEndereco(ArmazemEndereco armazemEndereco) {
        this.armazemEndereco = armazemEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemEtiqueta)) {
            return false;
        }
        ItemEtiqueta other = (ItemEtiqueta) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "ItemEtiqueta[id=" + id + "]";
    }

}
