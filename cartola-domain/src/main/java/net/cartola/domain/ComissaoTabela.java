package net.cartola.domain;


/**
 * 26/10/2015 11:11:47
 * //@author murilo
 */
//@Entity
//@Table(name = "comi_tabe", uniqueConstraints = {
     //@UniqueConstraint(columnNames = "dscr", name = "unk_comi_tabe_desc")
//})
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "ComissaoTabela.findAll", query = "SELECT c FROM ComissaoTabela c")})
public class ComissaoTabela extends RegistroBase implements Comparable<ComissaoTabela> {
    private static final long serialVersionUID = 662632626276316211L;
    private Long id;
    private String descricao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comi_tabe_id")
    //@SequenceGenerator(name = "seq_comi_tabe_id", sequenceName = "seq_comi_tabe_id", allocationSize = 1)
    //@Column(name = "comi_tabe_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ComissaoTabela)) {
            return false;
        }
        ComissaoTabela other = (ComissaoTabela) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ComissaoTabela[ id=" + id + ", descricao=" + descricao + "]";
    }

    @Override
    public int compareTo(ComissaoTabela o) {
        if (o == null || o.descricao == null) {
            return 1;
        }
        if (this.descricao == null) {
            return -1;
        }
        return this.descricao.compareTo(o.descricao);
    }

}
