package net.cartola.domain;

//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 26/05/2016 00:11:41
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "cent_cust", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "codigo", name = "unk_cate_codi"),
    //@UniqueConstraint(columnNames = "dscr", name = "unk_cate_desc")})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "CentroCusto.findAll", query = "SELECT c FROM CentroCusto c order by c.nivel, c.descricao")
   //,//@NamedQuery(name = "CentroCusto.findAnalitico", query = "SELECT c FROM CentroCusto c WHERE c.centroCustoTipo=:centroCustoTipo order by c.nivel, c.descricao")
  // ,//@NamedQuery(name = "CentroCusto.findSintetico", query = "SELECT c FROM CentroCusto c WHERE c.centroCustoTipo=:centroCustoTipo order by c.nivel, c.descricao")
  // ,//@NamedQuery(name = "CentroCusto.findById", query = "SELECT c FROM CentroCusto c WHERE c.id=:id")
  // ,//@NamedQuery(name = "CentroCusto.findByCentroCustoMestre", query = "SELECT c FROM CentroCusto c WHERE c.centroCustoMestre=:centroCustoMestre")
  // ,//@NamedQuery(name = "CentroCusto.findByNivel", query = "SELECT c FROM CentroCusto c WHERE c.nivel = :nivel order by c.descricao")
//})
public class CentroCusto extends RegistroBase {

    private static final long serialVersionUID = 1928347746755884839L;
    private Long id;
    private Short numero;
    private String codigo;
    private int nivel;
    private CentroCustoTipo centroCustoTipo;
    private CentroCusto centroCustoMestre;
    private String descricao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cent_cust_id")
    //@SequenceGenerator(name = "seq_cent_cust_id", sequenceName = "seq_cent_cust_id", allocationSize = 1)
    //@Column(name = "cent_cust_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name="nume", nullable = false)
    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    //@Column(name="codi", nullable = false)
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

    //@Enumerated(EnumType.STRING)
    //@Column(name="cent_cust_tipo", nullable = false)
    public CentroCustoTipo getCentroCustoTipo() {
        return centroCustoTipo;
    }

    public void setCentroCustoTipo(CentroCustoTipo centroCustoTipo) {
        this.centroCustoTipo = centroCustoTipo;
    }

    //@ManyToOne
    //@JoinColumn(name = "cent_cust_mest_id")
    public CentroCusto getCentroCustoMestre() {
        return centroCustoMestre;
    }

    public void setCentroCustoMestre(CentroCusto centroCustoMestre) {
        this.centroCustoMestre = centroCustoMestre;
    }

    //@NotNull(message = "A descri��o nao pode ser vazia")
    //@Size(min=2,max=255, message = "O tamanho da descri��o ${validatedValue} deve conter entre {min} e {max} caracteres")
    //@Column(name="dscr", length = 255)
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroCusto)) {
            return false;
        }
        CentroCusto other = (CentroCusto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.cartola.model.CentroCusto[ id=" + id + " ]";
    }

}
