package net.cartola.domain;

 import java.io.Serializable;
 import java.util.Date;
import java.util.List;

/**
 * 02/11/2015 00:08:07
 * //@author murilo
 */
////////@Entity
////@XmlRootElement
////@Table(name = "usua"//, uniqueConstraints = {
    ////@UniqueConstraint(columnNames = "logi", name = "unk_usua_logi")//})
////@NamedQueries({
    ////@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
   //,//@NamedQuery(name = "Usuario.porLogin", query = "select u from Usuario u where u.login=:login")
//})
public class Usuario extends RegistroBase implements Serializable, Cloneable{
    
    private static final long serialVersionUID = 23456543891L;
    
    private Long id;
    private String login;
    private transient String senha;
    private byte [] foto;
    private Pessoa pessoa;
    private Date criadoEm;
    private Long criadoPor;
    private Date alteradoEm;
    private Long alteradoPor;
    private Long versao;
    private List<CompraCotacao> compraCotacao;
    private List<UsuarioPerfil> perfis;
   // private Pessoa pessoa;

    public List<UsuarioPerfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<UsuarioPerfil> perfis) {
        this.perfis = perfis;
    }
   

    ////@Id
    ////@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usua_id")
   // //@SequenceGenerator(name = "seq_usua_id", sequenceName = "seq_usua_id", allocationSize = 1)
    ////@Column(name = "usua_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    ////@Column(name = "logi", unique = true, nullable = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    ////@Column(name = "senh")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

     //@OneToOne
    //@JoinColumn(name="pess_id")
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }   

    
    //@OneToMany(mappedBy = "loginAssignee", cascade = CascadeType.ALL)
    public List<CompraCotacao> getCompraCotacao() {
        return compraCotacao;
    }
    
    public void setCompraCotacao(List<CompraCotacao> compraCotacao) {
        this.compraCotacao = compraCotacao;
    }
   

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "Usuario[id=" + id + ", login=\"" + login + "\"]";
    }
    
    //@Override
    public Usuario clone() throws CloneNotSupportedException {
        Usuario clone = (Usuario) super.clone();
        clone.id = this.id;
        clone.login = this.login;       
        return clone;
    }

}
