package net.cartola.domain;



/**
 * 13/03/2016 15:58:12
 * //@author murilo
 */
//@Entity
//@Table(name = "item_etiq_hist")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ItemEtiquetaHistorico.findByItemEtiqueta", query = "SELECT i FROM ItemEtiquetaHistorico i WHERE i.itemEtiqueta=:itemEtiqueta")})
////@Audited //Hibernate Envers
public class ItemEtiquetaHistorico extends RegistroBase {
    
    private static final long serialVersionUID = 8789765411321234681L;
    
    private Long id;
    private ItemEtiqueta itemEtiqueta;
    private ArmazemEndereco armazemEndereco;
    private ItemEtiquetaHistoricoTipo itemEtiquetaHistoricoTipo;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_etiq_hist_id")
    //@SequenceGenerator(name = "seq_item_etiq_hist_id", sequenceName = "seq_item_etiq_hist_id", allocationSize = 1)
    //@Column(name = "item_etiq_hist_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_etiq_id", updatable = false, nullable = false)
    public ItemEtiqueta getItemEtiqueta() {
        return itemEtiqueta;
    }

    public void setItemEtiqueta(ItemEtiqueta itemEtiqueta) {
        this.itemEtiqueta = itemEtiqueta;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_ende_id")
    public ArmazemEndereco getArmazemEndereco() {
        return armazemEndereco;
    }

    public void setArmazemEndereco(ArmazemEndereco armazemEndereco) {
        this.armazemEndereco = armazemEndereco;
    }

    //@Enumerated(EnumType.ORDINAL)
    //@Column(name = "tipo", updatable = false, length = 30, nullable = false, 
  //  columnDefinition = "character varying(30) default 'CONSULTA'")
    public ItemEtiquetaHistoricoTipo getItemEtiquetaHistoricoTipo() {
        return itemEtiquetaHistoricoTipo;
    }

    public void setItemEtiquetaHistoricoTipo(ItemEtiquetaHistoricoTipo itemEtiquetaHistoricoTipo) {
        this.itemEtiquetaHistoricoTipo = itemEtiquetaHistoricoTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemEtiquetaHistorico)) {
            return false;
        }
        ItemEtiquetaHistorico other = (ItemEtiquetaHistorico) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "ItemEtiquetaHistorico[id=" + id + "]";
    }

}
