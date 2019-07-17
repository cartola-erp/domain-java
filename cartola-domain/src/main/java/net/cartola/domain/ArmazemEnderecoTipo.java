package net.cartola.domain;

//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 28/03/2016 11:27:34
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "arma_ende_tipo")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ArmazemEnderecoTipo.findAll", query = "SELECT ae FROM ArmazemEnderecoTipo ae")})
public class ArmazemEnderecoTipo extends RegistroBase {
    private static final long serialVersionUID = 913740178384231L;
    
    private Long id;
    private String descricao;
    private Integer profundidade;
    private Integer largura;
    private Integer altura;
    private Double percentualPerda;
    private boolean subdivisao;
    private Integer cargaCapacidade;


    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_arma_ende_tipo_id")
    //@SequenceGenerator(name = "seq_arma_ende_tipo_id", sequenceName = "seq_arma_ende_tipo_id", allocationSize = 1)
    //@Column(name = "arma_ende_tipo_id")
    //@Override
    public Long getId() {
        return id;
    }

    //@Override
    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "dscr")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //@Column(name = "prof")
    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

    //@Column(name = "larg")
    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    //@Column(name = "altu")
    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    //@Transient
    public Integer getArea() {
        if (largura == null || profundidade == null) {
            return null;
        } else {
            return largura * profundidade;
        }
    }
    
    //@Transient
    public Integer getVolume() {
        Integer area = getArea();
        if (area == null || altura == null) {
            return null;
        } else {
            return altura * area;
        }
    }

    //@Column(name = "perc_perd", precision = 13, scale = 4, nullable = false)
    public Double getPercentualPerda() {
        return percentualPerda;
    }

    public void setPercentualPerda(Double percentualPerda) {
        this.percentualPerda = percentualPerda;
    }

    //@Column(name = "subd", nullable = false)
    public boolean isSubdivisao() {
        return subdivisao;
    }

    public void setSubdivisao(boolean subdivisao) {
        this.subdivisao = subdivisao;
    }

    /**
     * Capacidade de carga suportada pela unidade de armazenamento, unidade em gramas
     * //@return Integer
     */
    //@Column(name = "carg_capa")
    public Integer getCargaCapacidade() {
        return cargaCapacidade;
    }

    public void setCargaCapacidade(Integer cargaCapacidade) {
        this.cargaCapacidade = cargaCapacidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ArmazemEnderecoTipo)) {
            return false;
        }
        ArmazemEnderecoTipo other = (ArmazemEnderecoTipo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ArmazemEnderecoTipo[id=" + id + ", descricao=" + descricao + "]";
    }
}
