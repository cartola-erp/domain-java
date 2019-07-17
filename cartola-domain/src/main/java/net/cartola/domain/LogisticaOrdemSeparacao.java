package net.cartola.domain;

/**
 * 16/05/2016 11:14:53
 * //@author murilo
 */
//@Entity
//@Table(name="logi_orde_sepa")
//@XmlRootElement
public class LogisticaOrdemSeparacao extends RegistroBase {
    private static final long serialVersionUID = 1397583489238431L;
    private Long id;
    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_orde_sepa_id")
    //@SequenceGenerator(name = "seq_logi_orde_sepa_id", sequenceName = "seq_logi_orde_sepa_id", allocationSize = 1)
    //@Column(name = "logi_orde_sepa_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof LogisticaOrdemSeparacao)) {
            return false;
        }
        LogisticaOrdemSeparacao other = (LogisticaOrdemSeparacao) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "LogisticaOrdemSeparacao[id=" + id + "]";
    }

}
