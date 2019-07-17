package net.cartola.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * 28/10/2015 16:46:41
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name="logi_mtes")
//@XmlRootElement
public class LogisticaMatrizTempoEstoqueSeguranca extends RegistroBase implements Serializable {
    private static final long serialVersionUID = 9988899986661L;
    private Long id;
    private String descricao;
    private Set<LogisticaMatrizTempoEstoqueSegurancaCMD> cmds;
    private Set<LogisticaMatrizTempoEstoqueSegurancaCusto> custos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_mtes_id")
    //@SequenceGenerator(name = "seq_logi_mtes_id", sequenceName = "seq_logi_mtes_id", allocationSize = 1)
    //@Column(name = "logi_mtes_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //@Column(name = "dscr", nullable = false)
    //@NotNull(message = "� necess�rio informar alguma descri��o")
    //@Size(min = 2, max = 255, message = "tamanho da descri��o deve conter entre 2 e 255")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    //@OneToMany(mappedBy = "matriz")
    public Set<LogisticaMatrizTempoEstoqueSegurancaCMD> getCmds() {
        return cmds;
    }

    public void setCmds(Set<LogisticaMatrizTempoEstoqueSegurancaCMD> cmds) {
        this.cmds = cmds;
    }

    //@OneToMany(mappedBy = "matriz")
    public Set<LogisticaMatrizTempoEstoqueSegurancaCusto> getCustos() {
        return custos;
    }

    public void setCustos(Set<LogisticaMatrizTempoEstoqueSegurancaCusto> custos) {
        this.custos = custos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
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
        final LogisticaMatrizTempoEstoqueSeguranca other = (LogisticaMatrizTempoEstoqueSeguranca) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogisticaMatrizTempoEstoqueSeguranca[id=" + id + "]";
    }

}
