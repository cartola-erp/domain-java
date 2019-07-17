package net.cartola.domain;

import java.util.Date;

/**
 * 06/11/2015 16:41:33
 * //@author murilo
 */
//@Entity
//@Table(name = "proj", uniqueConstraints = {
    //@UniqueConstraint(name = "unk_proj_nome", columnNames = "nome")})
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "Projeto.findAll", query = "SELECT p FROM Projeto p")})
public class Projeto extends RegistroBase {
    
    private static final long serialVersionUID = 7777377377374881L;
    private Long id;
    private PessoaCadastro pessoaCadastro;
    private String nome;
    private String objetivos;
    private Date inicio;
    private Date termino;
    private Double concluido;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_proj_id")
    //@SequenceGenerator(name = "seq_proj_id", sequenceName = "seq_proj_id", allocationSize = 1)
    //@Column(name = "proj_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_cada_id", nullable = false)
    public PessoaCadastro getPessoaCadastro() {
        return pessoaCadastro;
    }

    public void setPessoaCadastro(PessoaCadastro pessoaCadastro) {
        this.pessoaCadastro = pessoaCadastro;
    }

    //@Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@Column(name = "obje", nullable = false)
    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "inic", nullable = false)
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "term", nullable = false)
    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    //@Column(name = "conc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public Double getConcluido() {
        return concluido;
    }

    public void setConcluido(Double concluido) {
        this.concluido = concluido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Projeto[id=" + id + ", nome=\"" + nome + "\"]";
    }

}
