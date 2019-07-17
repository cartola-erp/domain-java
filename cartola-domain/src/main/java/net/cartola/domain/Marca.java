package net.cartola.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 24/10/2015 18:45:42
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "marc", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "nome", name = "unk_marc_nome")})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    //@NamedQuery(name = "Marca.findByNome", query = "SELECT m FROM Marca m WHERE m.nome=:nome")})
public class Marca extends RegistroBase implements Comparable<Marca>, Serializable {

    private static final long serialVersionUID = 888923921L;
    private Long id;
    private String nome;
    private List<Item> itens;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marc_id")
    //@SequenceGenerator(name = "seq_marc_id", sequenceName = "seq_marc_id", allocationSize = 1)
    //@Column(name = "marc_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "nome", nullable = false, length = 100)
    //@NotNull(message = "Informe alguma descri��o.")
    //@Size(min=2,max=100, message = "O tamanho da descri��o deve conter entre 2 e 100.")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@OneToMany(mappedBy = "marca", fetch = FetchType.LAZY)
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Marca[id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public int compareTo(Marca o) {
        if (o == null || o.nome == null) {
            return 1;
        }
        if (this.nome == null) {
            return -1;
        }
        return this.nome.compareTo(o.nome);
    }
    
    @Override
    public Marca clone() throws CloneNotSupportedException {
        Marca clone = (Marca) super.clone();
        clone.nome = this.nome;
        return clone;
    }
}
