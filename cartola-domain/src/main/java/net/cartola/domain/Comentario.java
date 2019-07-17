package net.cartola.domain;

import java.util.List;



/**
 * 24/12/2015 11:37:04
 * //@author Francisco Assis
 */
//@Entity
//@Table(name = "come")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Comentario.findAll", query = "SELECT c FROM Comentario c")
  // ,//@NamedQuery(name = "Comentario.findAllByItem", query = "SELECT c FROM Comentario c WHERE c.item=:item")
  // ,//@NamedQuery(name = "Comentario.findAllByPessoa", query = "SELECT c FROM Comentario c WHERE c.pessoa=:pessoa")})
public class Comentario extends RegistroBase {

    private static final long serialVersionUID = 976987908990865454L;
    private Long id;
    private Item item;
    private Usuario usuario;
    private List<Comentario> comentarios;
    private String texto;
    private boolean aprovado;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_come_id")
    //@SequenceGenerator(name = "seq_come_id", sequenceName = "seq_come_id", allocationSize = 1)
    //@Column(name = "come_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = true)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_id", nullable = true)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //@Lob
    //@Column(name = "text", nullable = false)
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //@Column(name = "apro", nullable = false)
    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Comentario)) {
            return false;
        }
        Comentario other = (Comentario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Comentario[id=" + id + ", texto=" + texto + "]";
    }

}
