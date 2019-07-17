package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 18/11/2015 18:26:40
 * //@author murilo
 */
////@Entity
////@Table(name = "item_foto")
////@DiscriminatorColumn(name="item_tipo")
////@XmlRootElement
////@NamedQueries({
//    //@NamedQuery(name = "ItemFoto.findAll", query = "SELECT i FROM ItemFoto i")
//   ,//@NamedQuery(name = "ItemFoto.findByItem", query = "SELECT i FROM ItemFoto i WHERE i.item=:item")
//})
////@Audited //Hibernate Envers
public class ItemFoto extends RegistroBase {

    private static final long serialVersionUID = 29374187331234331L;
    private Long id;
    private boolean capa;
    private Item item;
    private String nome;
    private byte[] conteudo;

//    //@Id
//    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_foto_id")
//    //@SequenceGenerator(name = "seq_item_foto_id", sequenceName = "seq_item_foto_id", allocationSize = 1)
//    //@Column(name = "item_foto_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <br>Imagem de capa eh a imagem que eh apresentada em todas</br>
     * <br>na tela de detalhamento ou edicao do produtos outras</br>
     * <br>imagens tambem podem ser visualizadas no entanto a imagem</br>
     * <br>de capa deve ser a primeira</br>
     * //@return 
     */
    //@Column(name = "capa", nullable = false)
    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //@Lob
    //@Column(name = "conteudo", nullable = false)
    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemFoto)) {
            return false;
        }
        ItemFoto other = (ItemFoto) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemFoto[id=" + id + ", arquivo=" + this.nome + "]";
    }

}
