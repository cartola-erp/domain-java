package net.cartola.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 12/04/2016 16:21:17
 * //@author murilo
 */
//@Entity
//@XmlRootElement
//@Table(name = "usua_perf", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "usua_id, perf_id", name = "unk_usua_perf_usua_perf")})
public class UsuarioPerfil implements Serializable {
    private static final long serialVersionUID = 28780054094928L;
    private Long id;
    private Usuario usuario;
    private Perfil perfil;
    private Date criadoEm;
    private Long criadoPor;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usua_perf_id")
    //@SequenceGenerator(name = "seq_usua_perf_id", sequenceName = "seq_usua_perf_id", allocationSize = 1)
    //@Column(name = "usua_perf_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "usua_id", nullable = false, updatable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //@ManyToOne
    //@JoinColumn(name = "perf_id", nullable = false, updatable = false)
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    //@Column(name="cria_em", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    //@Column(name="cria_por_id", updatable = false)
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
        if (!(object instanceof UsuarioPerfil)) {
            return false;
        }
        UsuarioPerfil other = (UsuarioPerfil) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "UsuarioPerfil[id=" + id + "]";
    }

}
