package net.cartola.domain;

/**
 * 07/02/2016 23:48:06
 * //@author murilo
 */
//@Entity
//@Table(name = "qual_inst_trab", uniqueConstraints = {
    //@UniqueConstraint(name = "unk_qual_inst_trab_nume", columnNames = "numero")})
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "QualidadeInstrucaoTrabalho.findAll", query = "SELECT it FROM QualidadeInstrucaoTrabalho it")})
public class QualidadeInstrucaoTrabalho extends RegistroBase {
    private static final long serialVersionUID = 1L;
    private Long id;
    private QualidadeProcesso qualidadeProcesso;
    private int numero;
    private String nome;
    private String descricao;
    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_qual_inst_trab_id")
    //@SequenceGenerator(name = "seq_qual_inst_trab_id", sequenceName = "seq_qual_inst_trab_id", allocationSize = 1)
    //@Column(name = "qual_inst_trab_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "qual_proc_id", nullable = false)
    public QualidadeProcesso getQualidadeProcesso() {
        return qualidadeProcesso;
    }

    public void setQualidadeProcesso(QualidadeProcesso qualidadeProcesso) {
        this.qualidadeProcesso = qualidadeProcesso;
    }

    //@Column(name = "nume", nullable = false, unique = true)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //@Column(name = "nome", nullable = false, unique = true)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@Column(name = "dscr")
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
        if (!(object instanceof QualidadeInstrucaoTrabalho)) {
            return false;
        }
        QualidadeInstrucaoTrabalho other = (QualidadeInstrucaoTrabalho) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "QualidadeInstrucaoTrabalho[ id=" + id + " ]";
    }

}
