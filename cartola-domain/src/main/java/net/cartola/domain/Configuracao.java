
package net.cartola.domain;

//import java.util.Objects;

import java.util.Objects;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DavidWD
 */
//@Entity
//@Table(name = "conf", uniqueConstraints = {
//    @UniqueConstraint(columnNames = "descricao", name = "unk_conf_desc")
//})
//@XmlRootElement
public class Configuracao extends RegistroBase{
    
    private Long id;
    private String descricao;
    private String valor;
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conf_id")
//    @SequenceGenerator(name = "seq_conf_id", sequenceName = "seq_conf_id", allocationSize = 1)
//    @Column(name = "conf_id")
//    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  //  @Column(name = "dscr", nullable = false)
//    @NotNull(message = "É necessário informar alguma descrição")
//    @Size(min = 1, max = 255, message = "tamanho da descrição deve conter entre 1 e 255")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

 //   @Column(name = "valo", nullable = false, length = 1024)
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Configuracao other = (Configuracao) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Configuracoes{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + '}';
    }
    
}
