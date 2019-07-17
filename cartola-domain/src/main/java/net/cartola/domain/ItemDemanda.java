package net.cartola.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * //@author DavidWD
 */
//@Entity
//@Table(name = "item_dema")
//@XmlRootElement
public class ItemDemanda extends RegistroBase implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private ItemDemandaLoja itemDemandaLoja;
    private Item item;
    private BigDecimal cmd;
    private BigDecimal reposto;
    private String curva;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_dema_id")
    //@SequenceGenerator(name = "seq_item_dema_id", sequenceName = "seq_item_dema_id", allocationSize = 1)
    //@Column(name = "item_dema_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_dema_loja_id")
    public ItemDemandaLoja getItemDemandaLoja() {
        return itemDemandaLoja;
    }

    public void setItemDemandaLoja(ItemDemandaLoja itemDemandaLoja) {
        this.itemDemandaLoja = itemDemandaLoja;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_id")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "cmd")
    public BigDecimal getCmd() {
        return cmd;
    }

    public void setCmd(BigDecimal cmd) {
        this.cmd = cmd;
    }

    //@Column(name = "repo")
    public BigDecimal getReposto() {
        return reposto;
    }

    public void setReposto(BigDecimal reposto) {
        this.reposto = reposto;
    }

    //@Column(name = "curv")
    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemDemanda other = (ItemDemanda) obj;
        if (!Objects.equals(this.curva, other.curva)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.itemDemandaLoja, other.itemDemandaLoja)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemDemanda{" + "id=" + id + ", itemDemandaLoja=" + itemDemandaLoja + ", item=" + item + ", cmd=" + cmd + ", reposto=" + reposto + ", curva=" + curva + '}';
    }

}
