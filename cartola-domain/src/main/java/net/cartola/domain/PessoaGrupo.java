package net.cartola.domain;

 import java.io.Serializable;
 import java.util.Set;
 //javax.persistence.Cacheable;
//  //javax.persistence.Column;
 //javax.persistence.Entity;
 //javax.persistence.GeneratedValue;
 //javax.persistence.GenerationType;
 //javax.persistence.Id;
 //javax.persistence.OneToMany;
 //javax.persistence.SequenceGenerator;
 //javax.persistence.Table;
 //javax.persistence.UniqueConstraint;
 //javax.xml.bind.annotation.XmlRootElement;

/**
 * Grupos empresariais<br/>
 * Cadastro para vincular empresas de um mesmo grupo 26/10/2015 17:10:16
 * @author murilo
 */
//////@Entity
//@Cacheable(true)
//@Table(name = "pess_grup"//, uniqueConstraints = {
    //@UniqueConstraint(name = "unk_pess_grup_nome", columnNames = "nome")//})
//@XmlRootElement
public class PessoaGrupo extends RegistroBase implements Comparable<PessoaGrupo>, Serializable {

    private static final long serialVersionUID = 238394802391L;
    private Long id;
    private String nome;
    private Set<Pessoa> pessoas;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pess_grup_id")
   // @SequenceGenerator(name = "seq_pess_grup_id", sequenceName = "seq_pess_grup_id", allocationSize = 1)
    //@Column(name = "pess_grup_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@OneToMany(mappedBy = "pessoaGrupo")
    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaGrupo)) {
            return false;
        }
        PessoaGrupo other = (PessoaGrupo) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "PessoaGrupo[ id=" + id + ", nome=\"" + nome + "\"]";
    }

    @Override
    public int compareTo(PessoaGrupo o) {
        if (o == null || o.nome == null) {
            return 1;
        }
        if (this.nome == null) {
            return -1;
        }
        return this.nome.compareTo(o.nome);
    }
    
    @Override
    public PessoaGrupo clone() throws CloneNotSupportedException {
        PessoaGrupo clone = (PessoaGrupo) super.clone();
        clone.nome = this.nome;
        return clone;
    }

}
