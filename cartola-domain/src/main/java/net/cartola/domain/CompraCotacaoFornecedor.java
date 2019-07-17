package net.cartola.domain;

//import javax.persistence.Column;

import java.util.List;

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
 * 16/08/2016 14:44:24
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_cota_forn")
//@XmlRootElement
public class CompraCotacaoFornecedor extends RegistroBase implements Comparable<CompraCotacaoFornecedor> {

    private static final long serialVersionUID = 134972340238928L;
    
    private Long id;
    private Fornecedor fornecedor;
    private boolean classificado = true;
    private boolean cotacaoRespondida = false;
    private CompraCotacao compraCotacao;
    private List<CompraCotacaoFornecedorItem> compraCotacaoFornecedorItem;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_cota_forn_id")
    //@SequenceGenerator(name = "seq_comp_cota_forn_id", sequenceName = "seq_comp_cota_forn_id", allocationSize = 1)
    //@Column(name = "comp_cota_forn_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_cota_id", nullable = false)
    public CompraCotacao getCompraCotacao() {
        return compraCotacao;
    }

    public void setCompraCotacao(CompraCotacao compraCotacao) {
        this.compraCotacao = compraCotacao;
    }    
    
    
    //@ManyToOne
    //@JoinColumn(name = "forn_id", nullable = false)
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    //@Column(name="clas", nullable = false)
    public boolean isClassificado() {
        return classificado;
    }

    public void setClassificado(boolean classificado) {
        this.classificado = classificado;
    }
    
    //@OneToMany(mappedBy = "compraCotacaoFornecedor")
    public List<CompraCotacaoFornecedorItem> getCompraCotacaoFornecedorItem() {
        return compraCotacaoFornecedorItem;
    }

    public void setCompraCotacaoFornecedorItem(List<CompraCotacaoFornecedorItem> compraCotacaoFornecedorItem) {
        this.compraCotacaoFornecedorItem = compraCotacaoFornecedorItem;
    }
    
   // @Column(name="cota_resp", nullable = true)
    public boolean isCotacaoRespondida() {
        return cotacaoRespondida;
    }

    public void setCotacaoRespondida(boolean cotacaoRespondida) {
        this.cotacaoRespondida = cotacaoRespondida;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraCotacaoFornecedor)) {
            return false;
        }
        CompraCotacaoFornecedor other = (CompraCotacaoFornecedor) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "CompraCotacaoFornecedor[ id=" + id + " ]";
    }

    //@Override
    public int compareTo(CompraCotacaoFornecedor o) {
        if (this.fornecedor == null && o.fornecedor == null) {
            return 0;
        }
        if (this.fornecedor != null) {
            if (o.fornecedor == null) {
                return -1;
            } else {
                return this.fornecedor.getNomeRazaoSocial().compareTo(o.getFornecedor().getNomeRazaoSocial());
            }
        } else {
            return 1;
        }
    }

}
