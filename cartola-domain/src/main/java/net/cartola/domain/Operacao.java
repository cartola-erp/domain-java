package net.cartola.domain;
//
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
//import javax.persistence.UniqueConstraint;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 26/10/2015 22:16:45
 * //@author murilo
 */
////@Entity
////@Cacheable(true)
////@Table(name = "oper", uniqueConstraints = {
//     //@UniqueConstraint(columnNames = "descricao", name = "unk_oper_desc")
//})
////@XmlRootElement
////@NamedQueries({
//    //@NamedQuery(name = "Operacao.findAll", query = "SELECT c FROM Operacao c")
//})
public class Operacao extends RegistroBase {

    private static final long serialVersionUID = 71737183473211L;

    private Long id;
    private String descricao;
//    private MovimentoTipo tipo;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_oper_id")
    //@SequenceGenerator(name = "seq_oper_id", sequenceName = "seq_oper_id", allocationSize = 1)
    //@Column(name = "oper_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name="dscr", nullable = false)
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
        if (!(object instanceof Operacao)) {
            return false;
        }
        Operacao other = (Operacao) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    //
    
    @Override
    public String toString() {
        //return "Operacao[ id=" + id + ", descricao=\"" + descricao + "\", tipo=\"" + tipo + "\"]";
        return "Operacao[ id=" + id + ", descricao=\"" + descricao + "\"]";
    }

}
