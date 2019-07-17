package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 23/06/2016 09:20:57
 * //@author murilo
 */
//@Entity
//@Table(name = "item_devo_ofen_tipo", uniqueConstraints = //@UniqueConstraint(name = "unk_item_devo_ofen_tipo_dscr", columnNames = "dscr"))
//@XmlRootElement
public class ItemDevolucaoOfensorTipo extends RegistroBase {

    private static final long serialVersionUID = 6987461523546351L;
    private Long id;
    private String descricao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_devo_ofen_tipo_id")
    //@SequenceGenerator(name = "seq_item_devo_ofen_tipo_id", sequenceName = "seq_item_devo_ofen_tipo_id", allocationSize = 1)
    //@Column(name = "item_devo_ofen_tipo_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@Column(name = "dscr", nullable = false, unique = true)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemDevolucaoOfensorTipo)) {
            return false;
        }
        ItemDevolucaoOfensorTipo other = (ItemDevolucaoOfensorTipo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemDevolucaoOfensorTipo[id=" + id + "]";
    }

}
