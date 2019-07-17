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
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 01/09/2016 15:56:19
 * //@author ALEXANDRE.SCAVACINI
 */
//@Entity
//@Table(name = "banc_cont")
//@XmlRootElement
public class BancoConta extends RegistroBase {

    private static final long serialVersionUID = 971023984018234L;
    private Long id;
    private PessoaCadastro titular;
    private BancoAgencia bancoAgencia;
    private int numero;
    private String digito;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_banc_cont_id")
    //@SequenceGenerator(name = "seq_banc_cont_id", sequenceName = "seq_banc_cont_id", allocationSize = 1)
    //@Column(name = "banc_cont_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "titu_id", nullable = false)
    public PessoaCadastro getTitular() {
        return titular;
    }

    public void setTitular(PessoaCadastro titular) {
        this.titular = titular;
    }

    //@ManyToOne
    //@JoinColumn(name = "banc_agen_id", nullable = false)
    public BancoAgencia getBancoAgencia() {
        return bancoAgencia;
    }

    public void setBancoAgencia(BancoAgencia bancoAgencia) {
        this.bancoAgencia = bancoAgencia;
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
        if (!(object instanceof BancoConta)) {
            return false;
        }
        BancoConta other = (BancoConta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "BancoConta[id=" + id + ", numero=" + numero + ", digito=" + digito + "]";
    }

}