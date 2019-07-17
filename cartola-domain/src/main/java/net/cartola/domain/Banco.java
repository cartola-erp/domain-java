package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 * 01/09/2016 16:01:15
 * //@author ALEXANDRE.SCAVACINI
 */
//@Entity
//@Table(name = "banc")
//@XmlRootElement
public class Banco extends RegistroBase {

    private static final long serialVersionUID = 8017437129185172341L;
    private Long id;
    private int numero;
    private String nome;
    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cont_banc_id")
    //@SequenceGenerator(name = "seq_cont_banc_id", sequenceName = "seq_cont_banc_id", allocationSize = 1)
    //@Column(name = "cont_banc_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "net.cartola.model.Banco[ id=" + id + " ]";
    }

}