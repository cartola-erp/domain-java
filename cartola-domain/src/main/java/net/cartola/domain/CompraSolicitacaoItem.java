package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
////import javax.persistence.Transient;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 05/11/2015 15:15:59
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_soli_item")
//@XmlRootElement
public class CompraSolicitacaoItem extends RegistroBase implements Comparable<CompraSolicitacaoItem> {
    
    private static final long serialVersionUID = 1234126461982432301L;
    
    private Long id;
    private CompraSolicitacao compraSolicitacao;
    private String sequencia;
    private Item item;
    private CentroCusto centroCusto;
    private String descricao;
    private ItemTipo itemTipo = ItemTipo.MERCADORIA;
    private Unidade itemUnidade;
    private String itemMarca;
    private BigDecimal quantidade = BigDecimal.ONE;
    private BigDecimal valorUnidade;
    private BigDecimal valorTotal;
    private Date prazoEntrega;
    private String codigoFornecedor;
    private MovimentoItem movimentoItem;
    private boolean itemPreExistente = true;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_soli_item_id")
    //@SequenceGenerator(name = "seq_comp_soli_item_id", sequenceName = "seq_comp_soli_item_id", allocationSize = 1)
    //@Column(name = "comp_soli_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_soli_id", nullable = false)
    public CompraSolicitacao getCompraSolicitacao() {
        return compraSolicitacao;
    }

    public void setCompraSolicitacao(CompraSolicitacao compraSolicitacao) {
        this.compraSolicitacao = compraSolicitacao;
    }

    //@Column(name = "sequ")
    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = true)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@ManyToOne
    //@JoinColumn(name = "cent_cust_id", nullable = false)
    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }

    //@NotNull(message = "A descri��o nao pode ser vazia")
    //@Size(min = 2, max = 255, message = "O tamanho da descri��o ${validatedValue} deve conter entre {min} e {max} caracteres")
    //@Column(name="dscr", length = 255)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="item_tipo", length = 14)
    public ItemTipo getItemTipo() {
        return itemTipo;
    }

    public void setItemTipo(ItemTipo itemTipo) {
        this.itemTipo = itemTipo;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_unid_id")
    public Unidade getItemUnidade() {
        return itemUnidade;
    }

    public void setItemUnidade(Unidade itemUnidade) {
        this.itemUnidade = itemUnidade;
    }

    //@Column(name = "marc")
    public String getItemMarca() {
        return itemMarca;
    }

    public void setItemMarca(String itemMarca) {
        this.itemMarca = itemMarca;
    }
    
    //@Transient
    public String getQuantidadeString() {
        
        String quantidadeString = "";
        if (null != this.quantidade) {
            quantidadeString = this.quantidade.stripTrailingZeros().toString().replace(".", ",");
        }
        
        return quantidadeString;
    }
    
    public void setQuantidadeString(String quantidadeString) {
        this.quantidade = new BigDecimal(quantidadeString.replace(",", "."));
    }
    
    //@Column(name = "quan", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    
    //@Transient
    public String getValorUnidadeString() {
        
        String valorUnidadeString = "";
        if (null != this.valorUnidade) {
            valorUnidadeString = this.valorUnidade.stripTrailingZeros().toString().replace(".", ",");
        }
        
        return valorUnidadeString;
    }

    public void setValorUnidadeString(String valorUnidadeString) {
        this.valorUnidade = new BigDecimal(valorUnidadeString.replace(",", "."));
    }
    
    //@Column(name = "valo_unid", precision = 13, scale = 6)
    public BigDecimal getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(BigDecimal valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
    //@Transient
    public String getValorTotalString() {
        
        String valorTotalString = "";
        if (null != this.valorTotal) {
            valorTotalString = this.valorTotal.stripTrailingZeros().toString().replace(".", ",");
        }
        
        return valorTotalString;
    }
    
    public void setValorTotalString(String valorTotalString) {
        this.valorTotal = new BigDecimal(valorTotalString.replace(",", "."));
    }

    public void setValorTotal(String valorTotalString) {
        this.valorTotal = new BigDecimal(valorTotalString.replace(",", "."));
    }
    
    //@Column(name = "valo_tota", precision = 13, scale = 6)
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "praz_entr", nullable = true)
    public Date getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Date prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    //@Column(name = "codi_forn")
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    //@ManyToOne
    //@JoinColumn(name = "movi_item_id")
    public MovimentoItem getMovimentoItem() {
        return movimentoItem;
    }

    public void setMovimentoItem(MovimentoItem movimentoItem) {
        this.movimentoItem = movimentoItem;
    }
    
    //@Column(name="item_pre_exis")
    public boolean isItemPreExistente() {
        return itemPreExistente;
    }

    public void setItemPreExistente(boolean itemPreExistente) {
        this.itemPreExistente = itemPreExistente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraSolicitacaoItem)) {
            return false;
        }
        CompraSolicitacaoItem other = (CompraSolicitacaoItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CompraSolicitacaoItem[ id=" + id + " ]";
    }

    @Override
    public int compareTo(CompraSolicitacaoItem o) {
        return this.sequencia.compareTo(o.sequencia);
    }

}
