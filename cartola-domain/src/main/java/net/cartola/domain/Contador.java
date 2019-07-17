package net.cartola.domain;

//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

/**
 * 26/10/2015 16:45:20
 * @author murilo
 */
//@Entity
//@DiscriminatorValue("CONTADOR")
//@Table(name = "cont", uniqueConstraints = {@UniqueConstraint(name = "unk_cont_crc", columnNames = "crc")})
public class Contador extends PessoaCadastro {
    private static final long serialVersionUID = 2342343224L;
    private String crc;

//    @Column(name="crc", nullable = false, length = 20)
    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

}


