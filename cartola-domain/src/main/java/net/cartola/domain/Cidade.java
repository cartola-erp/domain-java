package net.cartola.domain;

/**
 * 24/10/2015 17:19:12 //@author murilo
 */
//@Entity
//@Cacheable
//@Table(name = "cida", uniqueConstraints = {
////@UniqueConstraint(columnNames = "esta_id, nome", name = "unk_cida_nome_esta")
//    ////@UniqueConstraint(columnNames = "ibge_codigo", name = "unk_cida_ibge_codi")
////})
//@XmlRootElement
//@NamedQueries({
//@NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
//    //@NamedQuery(name = "Cidade.findByIbgeCodigo", query = "SELECT c FROM Cidade c WHERE c.ibgeCodigo = :ibgeCodigo"),
//@NamedQuery(name = "Cidade.findByUfCidade", query = "SELECT c FROM Cidade c WHERE c.estado.sigla = :sigla AND c.nome=:nome")//})
public class Cidade extends RegistroBase implements Comparable<Cidade> {

    private static final long serialVersionUID = 13473804731L;

    private Long id;
    private String nome;
    private Integer ibgeCodigo;//possui 7 digitos
    private Estado estado;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cida_id")
    //@SequenceGenerator(name = "seq_cida_id", sequenceName = "seq_cida_id", allocationSize = 1)
    //@Column(name = "cida_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "nome", nullable = false, length = 255)
    //////@NotNull(message = "descri//o n�o pode ser vazia")
    ////@Size(min=2,max=255, message = "O tamanho da descri//o deve conter entre 2 e 255")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@Column(name = "ibge_codi", nullable = false, length = 7)
    //////@NotNull(message = "c�digo n�o pode ser vazio")
    //////@Size(min=1,max=7, message = "tamanho do c�digo deve estar entre 1 e 7")
    ////@Min(value = 0000000, message = "tamanho do c�digo deve ser entre 1 e 7") 
    //@Max(value = 9999999, message = "tamanho do c�digo deve ser entre 1 e 7")
    public Integer getIbgeCodigo() {
        return ibgeCodigo;
    }

    public void setIbgeCodigo(Integer ibgeCodigo) {
        this.ibgeCodigo = ibgeCodigo;
    }

    //@ManyToOne
    //@JoinColumn(name = "esta_id", nullable = false)
    //////@NotNull(message = "� necess�rio informar algum estado")
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    //@Override
    public String toString() {
        return nome + "/" + estado.getSigla();
    }

    //@Override
    public int compareTo(Cidade o) {
        if (o == null || o.nome == null) {
            return 1;
        }
        if (this.nome == null) {
            return -1;
        }
        return this.nome.compareTo(o.nome);
    }

    //@Override
    public Cidade clone() throws CloneNotSupportedException {
        Cidade clone = (Cidade) super.clone();
        clone.id = this.id;
        if (this.estado != null) {
            clone.estado = this.estado.clone();
        }
        clone.nome = this.nome;
        clone.ibgeCodigo = this.ibgeCodigo;
        return clone;
    }
}
