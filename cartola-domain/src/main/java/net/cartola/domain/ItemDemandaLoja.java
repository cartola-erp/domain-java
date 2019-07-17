package net.cartola.domain;

import java.util.Objects;
import java.util.Set;

/**
 *
 * //@author DavidWD
 */
//@Entity
//@Table(name = "item_dema_loja")
//@XmlRootElement
public class ItemDemandaLoja extends RegistroBase {

    private static final long serialVersionUID = 1L;
    private Long id;
    private ItemDemandaPeriodo itemDemandaPeriodo;
    private EmpresaUnidade empresaUnidade;
    private int diasUteis;
    private Set<ItemDemanda> itens;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_dema_loja_id")
    //@SequenceGenerator(name = "seq_item_dema_loja_id", sequenceName = "seq_item_dema_loja_id", allocationSize = 1)
    //@Column(name = "item_dema_loja_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_dema_peri_id")
    public ItemDemandaPeriodo getItemDemandaPeriodo() {
        return itemDemandaPeriodo;
    }

    public void setItemDemandaPeriodo(ItemDemandaPeriodo itemDemandaPeriodo) {
        this.itemDemandaPeriodo = itemDemandaPeriodo;
    }

    //@ManyToOne
    //@JoinColumn(name = "empr_unid_id")
    public EmpresaUnidade getEmpresaUnidade() {
        return empresaUnidade;
    }

    public void setEmpresaUnidade(EmpresaUnidade empresaUnidade) {
        this.empresaUnidade = empresaUnidade;
    }

    //@Column(name = "dias_utei")
    public int getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(int diasUteis) {
        this.diasUteis = diasUteis;
    }

    //@OneToMany(mappedBy = "itemDemandaLoja")
    public Set<ItemDemanda> getItens() {
        return itens;
    }

    public void setItens(Set<ItemDemanda> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.itemDemandaPeriodo);
        hash = 41 * hash + Objects.hashCode(this.empresaUnidade);
        hash = 41 * hash + this.diasUteis;
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
        final ItemDemandaLoja other = (ItemDemandaLoja) obj;
        if (this.diasUteis != other.diasUteis) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.itemDemandaPeriodo, other.itemDemandaPeriodo)) {
            return false;
        }
        if (!Objects.equals(this.empresaUnidade, other.empresaUnidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemDemandaLoja{" + "id=" + id + ", itemDemandaPeriodo=" + itemDemandaPeriodo + ", empresaUnidade=" + empresaUnidade + ", diasUteis=" + diasUteis + '}';
    }

}
