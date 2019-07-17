package net.cartola.domain;

/**
 * 12/04/2016 17:35:48 //@author murilo
 */
//@Entity
//@XmlRootElement
//@Table(name = "usua_pess_visi", uniqueConstraints = {
//@UniqueConstraint(columnNames = "usua_id, pess_id", name = "unk_usua_pess_visi_usua_pess")})
public class UsuarioPessoaVisibilidade extends RegistroBase {

    private static final long serialVersionUID = 2230087543341234L;

    private Long id;
    private Usuario usuario;
    private Pessoa pessoa;
    private UsuarioPessoaVisibilidadeTipo usuarioPessoaVisibilidadeTipo;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usua_pess_visi_id")
    //@SequenceGenerator(name = "seq_usua_pess_visi_id", sequenceName = "seq_usua_pess_visi_id", allocationSize = 1)
    //@Column(name = "usua_pess_visi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "usua_id", nullable = false, updatable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_id", nullable = false, updatable = false)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "usua_pess_visi_tipo", nullable = false)
    public UsuarioPessoaVisibilidadeTipo getUsuarioPessoaVisibilidadeTipo() {
        return usuarioPessoaVisibilidadeTipo;
    }

    public void setUsuarioPessoaVisibilidadeTipo(UsuarioPessoaVisibilidadeTipo usuarioPessoaVisibilidadeTipo) {
        this.usuarioPessoaVisibilidadeTipo = usuarioPessoaVisibilidadeTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsuarioPessoaVisibilidade)) {
            return false;
        }
        UsuarioPessoaVisibilidade other = (UsuarioPessoaVisibilidade) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "UsuarioPessoaVisibilidade[id=" + id + ", usuario=" + this.usuario.getLogin() + "]";
    }

}
