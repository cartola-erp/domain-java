package net.cartola.domain;

//import java.util.List;
//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;


/**
 * 24/10/2015 16:33:41
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "cate", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "codigo", name = "unk_cate_codi"),
    //@UniqueConstraint(columnNames = "dscr", name = "unk_cate_desc")})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c order by c.nivel, c.descricao")
//   ,//@NamedQuery(name = "Categoria.findAllOrderByDescricao", query = "SELECT c FROM Categoria c order by c.descricao")
 //  ,//@NamedQuery(name = "Categoria.findByCategoriaPai", query = "SELECT c FROM Categoria c WHERE c.categoria=:categoria")
//   ,//@NamedQuery(name = "Categoria.findByNivel", query = "SELECT c FROM Categoria c WHERE c.nivel = :nivel order by c.descricao")
//})

import java.util.List;

public class Categoria extends RegistroBase {

    private static final long serialVersionUID = 983724297843081L;

    private Long id;
    private String codigo;
    private int nivel;
    private Categoria categoria;
    private String descricao;
    private String metaTag;
    private String metaDescricao;
    private List<Item> itensComerciais;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cate_id")
    //@SequenceGenerator(name = "seq_cate_id", sequenceName = "seq_cate_id", allocationSize = 1)
    //@Column(name = "cate_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "cate_codi")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //@Column(name="nive", nullable = false)
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //@ManyToOne
    //@JoinColumn(name = "cate_pai_id")
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        if (categoria != null) {
            this.nivel = categoria.getNivel() + 1;
        } else {
            this.nivel = 0;
        }
    }

    //@NotNull(message = "A descri��o nao pode ser vazia")
    //@Size(min=2,max=255, message = "O tamanho da descri��o ${validatedValue} deve conter entre {min} e {max} caracteres.")
    //@Column(name="dscr", length = 255)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
//
//    //@NotNull(message = "A meta tag nao pode ser vazia")
//    //@Size(min=2,max=20, message = "O tamanho da meta tag ${validatedValue} deve conter entre {min} e {max} caracteres.")
    //@Column(name="meta_tag", length = 20)
    public String getMetaTag() {
        return metaTag;
    }

    public void setMetaTag(String metaTag) {
        this.metaTag = metaTag;
    }

    //@Column(name="meta_desc")
    public String getMetaDescricao() {
        return metaDescricao;
    }

    public void setMetaDescricao(String metaDescricao) {
        this.metaDescricao = metaDescricao;
    }

    //@ManyToMany(mappedBy = "categorias")
    public List<Item> getItensComerciais() {
        return itensComerciais;
    }

    public void setItensComerciais(List<Item> itensComerciais) {
        this.itensComerciais = itensComerciais;
    }
    
    //@Transient
    public String getCategoriaString(){
        if (this.categoria == null){
            return "-";
        } else {
            return this.categoria.getDescricao();
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "cod:"+codigo+" desc:"+descricao;
    }

}
