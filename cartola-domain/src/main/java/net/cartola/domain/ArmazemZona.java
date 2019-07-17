package net.cartola.domain;
//
//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 08/02/2016 00:02:11
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "arma_zona")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ArmazemZona.findAll", query = "SELECT az FROM ArmazemZona az"),
    //@NamedQuery(name = "ArmazemZona.findPorArmazemId", query = "SELECT az FROM ArmazemZona az WHERE az.armazem.id=:arma_id")})
public class ArmazemZona extends RegistroBase {

    private static final long serialVersionUID = 99348482812882111L;
    private Long id;
    private Armazem armazem;
    private String descricao;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_arma_zona_id")
    //@SequenceGenerator(name = "seq_arma_zona_id", sequenceName = "seq_arma_zona_id", allocationSize = 1)
    //@Column(name = "arma_zona_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_id", nullable = false)
    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }
    
    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof ArmazemZona)) {
            return false;
        }
        ArmazemZona other = (ArmazemZona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "ArmazemZona[id=" + id + ", descricao=" + descricao + "]";
    }
    
    //@Override
    public ArmazemZona clone() throws CloneNotSupportedException {
        ArmazemZona clone = (ArmazemZona) super.clone();
        clone.descricao = this.descricao;
        return clone;
    }

}
