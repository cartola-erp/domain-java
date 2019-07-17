package net.cartola.domain;

import java.util.List;

/**
 * 07/02/2016 23:47:03
 * //@author murilo
 */
//@Entity
//@Table(name = "qual_proc", uniqueConstraints = {
    //@UniqueConstraint(name = "unk_qual_proc_nume", columnNames = "numero")})
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "QualidadeProcesso.findAll", query = "SELECT qp FROM QualidadeProcesso qp")})
public class QualidadeProcesso  extends RegistroBase {
    private static final long serialVersionUID = 123947309823888821L;
    private Long id;
    private int numero;
    private String nome;
    private String descricao;
    private List<QualidadeInstrucaoTrabalho> instrucoesTrabalho;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_qual_proc_id")
    //@SequenceGenerator(name = "seq_qual_proc_id", sequenceName = "seq_qual_proc_id", allocationSize = 1)
    //@Column(name = "qual_proc_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "nume", nullable = false, unique = true)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //@Column(name = "nome", nullable = false)
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

    //@OneToMany(mappedBy = "qualidadeProcesso")
    public List<QualidadeInstrucaoTrabalho> getInstrucoesTrabalho() {
        return instrucoesTrabalho;
    }

    public void setInstrucoesTrabalho(List<QualidadeInstrucaoTrabalho> instrucoesTrabalho) {
        this.instrucoesTrabalho = instrucoesTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof QualidadeProcesso)) {
            return false;
        }
        QualidadeProcesso other = (QualidadeProcesso) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "QualidadeProcesso[ id=" + id + " ]";
    }

}
