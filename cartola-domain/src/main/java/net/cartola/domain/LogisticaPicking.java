package net.cartola.domain;

import java.util.List;

/**
 * 16/05/2016 11:15:11
 * //@author murilo
 */
//@Entity
//@Table(name="logi_pick")
//@XmlRootElement
public class LogisticaPicking extends RegistroBase {

    private static final long serialVersionUID = 1324873885942998L;
    private Long id;
    private List<LogisticaPickingItem> logisticaItens;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_pick_id")
    //@SequenceGenerator(name = "seq_logi_pick_id", sequenceName = "seq_logi_pick_id", allocationSize = 1)
    //@Column(name = "logi_pick_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "logisticaPicking")
    public List<LogisticaPickingItem> getLogisticaItens() {
        return logisticaItens;
    }

    public void setLogisticaItens(List<LogisticaPickingItem> logisticaItens) {
        this.logisticaItens = logisticaItens;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof LogisticaPicking)) {
            return false;
        }
        LogisticaPicking other = (LogisticaPicking) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "LogisticaPicking[id=" + id + "]";
    }

}
