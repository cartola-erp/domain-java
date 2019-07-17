package net.cartola.domain;


/**
 * 14/04/2016 19:50:51
 * //@author murilo
 */
//@Entity
//@Table(name = "caix_esta"
 //       , uniqueConstraints = //@UniqueConstraint(name = "unk_caix_esta_empr_unid_nume", columnNames = "empr_unid, nume"))
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CaixaEstacao.findAll", query = "SELECT c FROM CaixaEstacao c")})
public class CaixaEstacao extends RegistroBase {
    private static final long serialVersionUID = 96786585986598568L;

    private Long id;
    private EmpresaUnidade empresaUnidade;
    private Integer numero;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caix_esta_id")
    //@SequenceGenerator(name = "seq_caix_esta_id", sequenceName = "seq_caix_esta_id", allocationSize = 1)
    //@Column(name = "caix_esta_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "empr_unid", nullable = false, updatable = false)
    public EmpresaUnidade getEmpresaUnidade() {
        return empresaUnidade;
    }

    public void setEmpresaUnidade(EmpresaUnidade empresaUnidade) {
        this.empresaUnidade = empresaUnidade;
    }

    //@Column(name = "nume", nullable = false)
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaixaEstacao)) {
            return false;
        }
        CaixaEstacao other = (CaixaEstacao) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CaixaEstacao[id=" + id + ", numero=" + numero + "]";
    }

}
