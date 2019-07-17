package net.cartola.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 *
 * //@author DavidWD
 */
//@Entity
//@Table(name = "item_dema_peri")
//@XmlRootElement
public class ItemDemandaPeriodo extends RegistroBase {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Date inicio;
    private Date termino;
    private Set<ItemDemandaLoja> itemDemandaLojas; 

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_dema_peri_id")
    //@SequenceGenerator(name = "seq_item_dema_peri_id", sequenceName = "seq_item_dema_peri_id", allocationSize = 1)
    //@Column(name = "item_dema_peri_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "inic")
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    //@Column(name = "term")
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    //@OneToMany(mappedBy = "itemDemandaPeriodo")
    public Set<ItemDemandaLoja> getItemDemandaLojas() {
        return itemDemandaLojas;
    }

    public void setItemDemandaLojas(Set<ItemDemandaLoja> itemDemandaLojas) {
        this.itemDemandaLojas = itemDemandaLojas;
    }
    
    //@Transient
    public String getDataHorarioInicioString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.inicio == null) {
            return "";
        } else {
            return dataFormat.format(this.inicio) + " �s " + horaFormat.format(this.inicio);
        }
    }
    
        //@Transient
    public String getDataHorarioTerminoString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.termino == null) {
            return "";
        } else {
            return dataFormat.format(this.termino) + " �s " + horaFormat.format(this.termino);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.inicio);
        hash = 23 * hash + Objects.hashCode(this.termino);
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
        final ItemDemandaPeriodo other = (ItemDemandaPeriodo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.inicio, other.inicio)) {
            return false;
        }
        if (!Objects.equals(this.termino, other.termino)) {
            return false;
        }
        return true;
    }

    //@Override
    public String toString() {
        return "ItemDemandaPeriodo{" + "id=" + id + ", inicio=" + inicio + ", termino=" + termino + '}';
    }

}
