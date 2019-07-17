package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
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
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 11/02/2016 20:59:10
 * //@author murilo
 */
//@Entity
//@Table(name = "item_ende")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "ItemEndereco.findAll", query = "SELECT i FROM ItemEndereco i")
  //, //@NamedQuery(name = "ItemEndereco.findByItemIdArmazemId", query = "SELECT i FROM ItemEndereco i WHERE i.item.id=:itemId AND i.armazemEndereco.armazem.id=:armazemId")})
public class ItemEndereco  extends RegistroBase {
    private static final long serialVersionUID = 882358932843829111L;
    private Long id;
    private Item item;
    private ArmazemEndereco armazemEndereco;
    private BigDecimal entrada = BigDecimal.ZERO;
    private BigDecimal efetiva = BigDecimal.ZERO;
    private BigDecimal saida = BigDecimal.ZERO;
    private Unidade unidade;
    private Date validade; 

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_ende_id")
    //@SequenceGenerator(name = "seq_item_ende_id", sequenceName = "seq_item_ende_id", allocationSize = 1)
    //@Column(name = "item_ende_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@ManyToOne
    //@JoinColumn(name = "arma_ende_id", nullable = false)
    public ArmazemEndereco getArmazemEndereco() {
        return armazemEndereco;
    }

    public void setArmazemEndereco(ArmazemEndereco armazemEndereco) {
        this.armazemEndereco = armazemEndereco;
    }

    //@ManyToOne
    //@JoinColumn(name = "unid_id", nullable = false)
    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    //@Column(name = "entr", precision = 11, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getEntrada() {
        return entrada;
    }

    public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
    }

    //@Column(name = "efet", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getEfetiva() {
        return efetiva;
    }

    public void setEfetiva(BigDecimal efetiva) {
        this.efetiva = efetiva;
    }

    //@Column(name = "said", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getSaida() {
        return saida;
    }

    public void setSaida(BigDecimal saida) {
        this.saida = saida;
    }
    
    
    //@Temporal(TemporalType.DATE)
    //@Column(name = "vali")
    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemEndereco)) {
            return false;
        }
        ItemEndereco other = (ItemEndereco) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ItemEndereco[id=" + id + "]";
    }

}
