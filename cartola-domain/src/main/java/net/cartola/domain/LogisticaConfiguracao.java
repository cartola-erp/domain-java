package net.cartola.domain;

import java.util.Objects;
/**
 *
 * //@author DavidWD
 */
//@Entity
//@Cacheable(true)
//@Table(name = "logi_conf")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "LogisticaConfiguracao.findAll", query = "SELECT l FROM LogisticaConfiguracao l")})
public class LogisticaConfiguracao extends RegistroBase{

    private Long id;
    private String descricao;
    private Long tempoTratativasPlanejamento;
    private Long tempoTratativasCompra;
    private Long tempoTratativasArmazem;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_logi_conf_id")
    //@SequenceGenerator(name = "seq_logi_conf_id", sequenceName = "seq_logi_conf_id", allocationSize = 1)
    //@Column(name = "logi_conf_id")
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

    /*
    Numero de dias para o departamento de planejamento realizar a compra
    //@return
    */
    //@Column(name = "temp_trat_plan")
    public Long getTempoTratativasPlanejamento() {
        return tempoTratativasPlanejamento;
    }

    public void setTempoTratativasPlanejamento(Long tempoTratativasPlanejamento) {
        this.tempoTratativasPlanejamento = tempoTratativasPlanejamento;
    }

    /*
    Numero de dias para o departamento de compras realizar a compra
    //@return
    */
    //@Column(name = "temp_trat_comp")
    public Long getTempoTratativasCompra() {
        return tempoTratativasCompra;
    }

    public void setTempoTratativasCompra(Long tempoTratativasCompra) {
        this.tempoTratativasCompra = tempoTratativasCompra;
    }

    /*
    Numero de dias para o processo de guarda das mercadorias
    //@return
    */
    //@Column(name = "temp_trat_arma")
    public Long getTempoTratativasArmazem() {
        return tempoTratativasArmazem;
    }

    public void setTempoTratativasArmazem(Long tempoTratativasArmazem) {
        this.tempoTratativasArmazem = tempoTratativasArmazem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.descricao);
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
        final LogisticaConfiguracao other = (LogisticaConfiguracao) obj;
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
        return "LogisticaConfiguracao{" + "id=" + id + ", descricao=" + descricao + ", tempoTratativasPlanejamento=" + tempoTratativasPlanejamento + ", tempoTratativasCompra=" + tempoTratativasCompra + ", tempoTratativasArmazem=" + tempoTratativasArmazem + '}';
    }

}
