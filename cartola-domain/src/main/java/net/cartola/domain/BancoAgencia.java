package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 * 01/09/2016 16:01:25
 * //@author ALEXANDRE.SCAVACINI
 */
//@Entity
//@Table(name = "banc_agen")
//@XmlRootElement
public class BancoAgencia extends RegistroBase {

    private static final long serialVersionUID = 45891451427643L;
    
    private Long id;
    private Banco banco;
    private int numero;
    private String digito;
    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_banc_agen_id")
    //@SequenceGenerator(name = "seq_banc_agen_id", sequenceName = "seq_banc_agen_id", allocationSize = 1)
    //@Column(name = "banc_agen_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "banc_id", nullable = false)
    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    //@Column(name = "nume", nullable = false)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //@Column(name = "digi")
    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof BancoAgencia)) {
            return false;
        }
        BancoAgencia other = (BancoAgencia) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "BancoAgencia[id=" + id + ", numero=" + numero + ", digito=" + digito + " ]";
    }

}