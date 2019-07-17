package net.cartola.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 12/04/2016 17:04:21
 *
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@XmlRootElement
//@Table(name = "perf")
//@NamedQueries({
    //@NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
    //@NamedQuery(name = "Perfil.porTipo", query = "select p from Perfil p where p.perfilTipo=:perfilTipo")
//})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 7123740942613461L;

    private Long id;
    private PerfilTipo perfilTipo;
    private Date criadoEm;
    private Long criadoPor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_perf_id")
    //@SequenceGenerator(name = "seq_perf_id", sequenceName = "seq_perf_id", allocationSize = 1)
    //@Column(name = "perf_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "perf_tipo", nullable = false, unique = true, updatable = false)
    public PerfilTipo getPerfilTipo() {
        return perfilTipo;
    }

    public void setPerfilTipo(PerfilTipo perfilTipo) {
        this.perfilTipo = perfilTipo;
    }

    //@Column(name = "cria_em", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    //@Column(name = "cria_por_id", updatable = false)
    public Long getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(Long criadoPor) {
        this.criadoPor = criadoPor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Perfil[id=" + id + ", perfilTipo=" + this.perfilTipo + "]";
    }

}
