package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 26/10/2015 11:43:04
 * //@author murilo
 */
//@Entity
//@Table(name = "comi_tabe_faix")
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "ComissaoTabelaFaixa.findAll", query = "SELECT c FROM ComissaoTabelaFaixa c")})
public class ComissaoTabelaFaixa extends RegistroBase {
    private static final long serialVersionUID = 4165132415451L;

    private Long id;
    private int ordem;
    private BigDecimal minimo = BigDecimal.ZERO;
    private BigDecimal maximo = BigDecimal.ZERO;
    private BigDecimal porcentagem = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comi_tabe_faix_id")
    //@SequenceGenerator(name = "seq_comi_tabe_faix_id", sequenceName = "seq_comi_tabe_faix_id", allocationSize = 1)
    //@Column(name = "comi_tabe_faix_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name="orde", nullable = false)
    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public BigDecimal getMinimo() {
        return minimo;
    }

    public void setMinimo(BigDecimal minimo) {
        this.minimo = minimo;
    }

    public BigDecimal getMaximo() {
        return maximo;
    }

    public void setMaximo(BigDecimal maximo) {
        this.maximo = maximo;
    }

    public BigDecimal getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(BigDecimal porcentagem) {
        this.porcentagem = porcentagem;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComissaoTabelaFaixa)) {
            return false;
        }
        ComissaoTabelaFaixa other = (ComissaoTabelaFaixa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.cartola.model.ComissaoTabelaFaixa[ id=" + id + " ]";
    }

}
