package net.cartola.domain;

import java.util.List;

/**
 * 24/10/2015 17:18:52
 * //@author murilo
 */

//@Entity
//@Cacheable(true)
//@Table(name = "esta", uniqueConstraints = {
    ////@UniqueConstraint(columnNames = "nome", name = "unk_esta_nome"),
    ////@UniqueConstraint(columnNames = "sigla", name = "unk_esta_sigla")//})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
    //@NamedQuery(name = "Estado.findById", query = "SELECT e FROM Estado e WHERE e.id=:id")//})
public class Estado extends RegistroBase implements Comparable<Estado> {

    private static final long serialVersionUID = 309485301L;
    private Long id;
    private String sigla;
    private String nome;
    //@XmlTransient
    private List<Cidade> cidades;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_esta_id")
    //@SequenceGenerator(name = "seq_esta_id", sequenceName = "seq_esta_id", allocationSize = 1)
    //@Column(name = "esta_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "sigla", length = 2)
    //////@NotNull(message = "sigla n�o pode ser vazia")
    ////@Size(min=1,max=2, message = "tamanho da sigla deve conter entre 1 e 2")
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    //////@NotNull(message = "descri//o n�o pode ser vazia")
    ////@Size(min=1,max=255, message = "tamanho da descri//o deve conter entre 1 e 255")
    //@Column(name = "nome", length = 255)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@XmlTransient
    //@OneToMany(mappedBy = "estado")
    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return nome + " ("+ sigla + ")";
    }

    @Override
    public int compareTo(Estado o) {
        if (o == null || o.sigla == null) {
            return 1;
        }
        if (this.sigla == null) {
            return -1;
        }
        return this.sigla.compareTo(o.sigla);
    }
    
    @Override
    public Estado clone() throws CloneNotSupportedException {
        Estado clone = (Estado) super.clone();
        clone.id = this.id;
        clone.nome = this.nome;
        clone.sigla = this.sigla;
        return clone;
    }

}
