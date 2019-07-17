package net.cartola.domain;

 import java.util.Objects;
//  //javax.persistence.Column;
 //javax.persistence.Entity;
 //javax.persistence.GeneratedValue;
 //javax.persistence.GenerationType;
 //javax.persistence.Id;
 //javax.persistence.JoinColumn;
 //javax.persistence.ManyToOne;
 //javax.persistence.NamedQueries;
 //javax.persistence.NamedQuery;
 //javax.persistence.SequenceGenerator;
 //javax.persistence.Table;
 //javax.persistence.UniqueConstraint;
 //javax.xml.bind.annotation.XmlRootElement;

/**
 * 25/10/2015 19:31:58
 * @author murilo
 */
//////@Entity
//@Table(name = "item_codi"//, uniqueConstraints = {
     //@UniqueConstraint(columnNames = "tipo, codigo", name = "unk_codi_item_codi_tipo_codi")
//
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ItemCodigo.findAll", query = "SELECT c FROM ItemCodigo c")
 //  //,@NamedQuery(name = "ItemCodigo.findAllByCodigo", query = "SELECT c FROM ItemCodigo c WHERE c.codigo=:codigo")//})
//@Audited //Hibernate Envers
public class ItemCodigo extends RegistroBase {
    private static final long serialVersionUID = 76256362727771L;
    private Long id;
    private Item item;
    private CodigoTipo codigoTipo;
    private String codigo;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_codi_id")
   // @SequenceGenerator(name = "seq_item_codi_id", sequenceName = "seq_item_codi_id", allocationSize = 1)
    //@Column(name = "item_codi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    //@JoinColumn(name = "codi_tipo_id", nullable = false)
    public CodigoTipo getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(CodigoTipo codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    /**
     * O valor do codigo para o codigoTipo
     * @return
     */
    //@Column(name="codi", nullable = false)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemCodigo)) {
            return false;
        }
        ItemCodigo other = (ItemCodigo) object;
            if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public String toString() {
        return "ItemCodigo[id=" + id + ", tipo=" + codigoTipo + ", codigo=" + this.codigo + "]";
    }

}
