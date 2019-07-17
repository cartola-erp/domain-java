package net.cartola.domain;



import java.math.BigDecimal;
import java.util.Objects;
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
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 22/07/2015 23:07:28
 * //@author murilo
 */
//@Entity
//@Table(name = "movi_item")
//@XmlRootElement
public class MovimentoItem extends RegistroBase {

    private static final long serialVersionUID = 118927483904122111L;
    private Long id;
    private Movimento movimento;
    private int sequencia;
    private Item item;
    private String itemDescricao;
    private Long itemSimilaridade;
    private String itemQualificador;
    private boolean itemComposto = false;
    private ItemTipo itemTipo = ItemTipo.MERCADORIA;
    private Unidade itemUnidade;
    private Marca itemMarca;
    private String itemDescricaoFornecedor;
    private String itemMarcaFornecedor;
    private BigDecimal precoCusto = BigDecimal.ZERO;
    private BigDecimal valorBase = BigDecimal.ZERO;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private BigDecimal quantidade = BigDecimal.ONE;
    private BigDecimal quantidadeFornecedor = BigDecimal.ZERO;
    private BigDecimal valorUnidade = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private String codigoFornecedor;
    
    private BigDecimal desconto = BigDecimal.ZERO; //transient
    private boolean incluso = false; //transient
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movi_item_id")
    //@SequenceGenerator(name = "seq_movi_item_id", sequenceName = "seq_movi_item_id", allocationSize = 1)
    //@Column(name = "movi_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "movi_id", nullable = false)
    public Movimento getMovimento() {
        return movimento;
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    //@Column(name = "sequ")
//    //@Column(name = "sequ", nullable = false)
    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "item_dscr", length = 255)
//    //@Column(name = "item_dscr", length = 255, nullable = false)
    public String getItemDescricao() {
        return itemDescricao;
    }

    public void setItemDescricao(String itemDescricao) {
        this.itemDescricao = itemDescricao;
    }

    //@Column(name="item_simi")
    public Long getItemSimilaridade() {
        return itemSimilaridade;
    }

    public void setItemSimilaridade(Long itemSimilaridade) {
        this.itemSimilaridade = itemSimilaridade;
    }

    //@Column(name="item_qual")
    public String getItemQualificador() {
        return itemQualificador;
    }

    public void setItemQualificador(String itemQualificador) {
        this.itemQualificador = itemQualificador;
    }

    //@Column(name="item_comp")
    public boolean isItemComposto() {
        return itemComposto;
    }

    public void setItemComposto(boolean itemComposto) {
        this.itemComposto = itemComposto;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="item_tipo", length = 14, 
//    //@Column(name="item_tipo", length = 14, nullable = false, 
  //  columnDefinition = "character varying(14) default 'MERCADORIA'")
    public ItemTipo getItemTipo() {
        return itemTipo;
    }

    public void setItemTipo(ItemTipo itemTipo) {
        this.itemTipo = itemTipo;
    }

    //@Column(name = "item_desc_forn")
    public String getItemDescricaoFornecedor() {
        return itemDescricaoFornecedor;
    }

    public void setItemDescricaoFornecedor(String itemDescricaoFornecedor) {
        this.itemDescricaoFornecedor = itemDescricaoFornecedor;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_unid_id")
//    //@JoinColumn(name = "item_unid_id", nullable = false)
    public Unidade getItemUnidade() {
        return itemUnidade;
    }

    public void setItemUnidade(Unidade itemUnidade) {
        this.itemUnidade = itemUnidade;
    }

    //@ManyToOne
//    //@JoinColumn(name = "item_marc_id", nullable = false)
    //@JoinColumn(name = "item_marc_id")
    public Marca getItemMarca() {
        return itemMarca;
    }

    public void setItemMarca(Marca itemMarca) {
        this.itemMarca = itemMarca;
    }

    //@Column(name = "item_marc_forn")
    public String getItemMarcaFornecedor() {
        return itemMarcaFornecedor;
    }

    public void setItemMarcaFornecedor(String itemMarcaFornecedor) {
        this.itemMarcaFornecedor = itemMarcaFornecedor;
    }
    
    //@Column(name = "prec_cust", precision = 13, scale = 4, nullable = false)
    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    //@Column(name = "valo_base", precision = 13, scale = 4, nullable = false)
    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    //@Enumerated(EnumType.STRING)
//    //@Column(name="desc_tipo", length = 11, nullable = false, 
    //@Column(name="desc_tipo", length = 11, 
   // columnDefinition = "character varying(11) default 'VALOR'")
    public DescontoTipo getDescontoTipo() {
        return descontoTipo;
    }

    public void setDescontoTipo(DescontoTipo descontoTipo) {
        this.descontoTipo = descontoTipo;
    }

    //@Column(name = "desc_porc", precision = 7, scale = 6, nullable = false)
    public BigDecimal getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name = "desc_valo", precision = 13, scale = 6, nullable = false)
    public BigDecimal getDescontoValor() {
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name = "quan", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    //@Column(name = "quan_forn", precision = 13, scale = 6, nullable = false)
    public BigDecimal getQuantidadeFornecedor() {
        return quantidadeFornecedor;
    }

    public void setQuantidadeFornecedor(BigDecimal quantidadeFornecedor) {
        this.quantidadeFornecedor = quantidadeFornecedor;
    }

    //@Column(name = "valo_unid", precision = 13, scale = 6, nullable = false)
    public BigDecimal getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(BigDecimal valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    //@Column(name = "valo_tota", precision = 13, scale = 6, nullable = false)
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    //@Column(name = "codi_forn")
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    //Campo para c�lculo
    //@Transient
    public BigDecimal getDesconto() {
        if(desconto == null){
            desconto = BigDecimal.ZERO;
        }
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    //@Transient
    public boolean isIncluso() {
        return incluso;
    }

    public void setIncluso(boolean incluso) {
        this.incluso = incluso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.movimento);
        hash = 37 * hash + this.sequencia;
        hash = 37 * hash + Objects.hashCode(this.item);
        hash = 37 * hash + Objects.hashCode(this.quantidade);
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
        final MovimentoItem other = (MovimentoItem) obj;
        if (this.sequencia != other.sequencia) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.movimento, other.movimento)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovimentoItem{" + "id=" + id + ", movimento=" + movimento + ", sequencia=" + sequencia + ", item=" + item + ", itemDescricao=" + itemDescricao + ", itemSimilaridade=" + itemSimilaridade + ", itemQualificador=" + itemQualificador + ", itemComposto=" + itemComposto + ", itemTipo=" + itemTipo + ", itemUnidade=" + itemUnidade + ", itemMarca=" + itemMarca + ", itemDescricaoFornecedor=" + itemDescricaoFornecedor + ", itemMarcaFornecedor=" + itemMarcaFornecedor + ", precoCusto=" + precoCusto + ", valorBase=" + valorBase + ", descontoTipo=" + descontoTipo + ", descontoValor=" + descontoValor + ", descontoPorcentagem=" + descontoPorcentagem + ", quantidade=" + quantidade + ", quantidadeFornecedor=" + quantidadeFornecedor + ", valorUnidade=" + valorUnidade + ", valorTotal=" + valorTotal + ", codigoFornecedor=" + codigoFornecedor + ", desconto=" + desconto + ", incluso=" + incluso + '}';
    }

}
