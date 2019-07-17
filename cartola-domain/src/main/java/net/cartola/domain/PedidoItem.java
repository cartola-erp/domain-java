package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.ForeignKey;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 23/12/2015 09:09:03
 * //@author DavidWD
 */

//@Entity
//@Table(name = "pedi_item")
//@XmlRootElement
public class PedidoItem extends RegistroBase implements Comparable<PedidoItem> {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Pedido pedido;
    private int sequencia;
    private Item item;
    private String itemDescricao;
    private Long itemSimilaridade;
    private String itemQualificador;
    private boolean itemComposto = false;
    private ItemTipo itemTipo = ItemTipo.MERCADORIA;
    private Unidade itemUnidade;
    //private Marca itemMarca;
    private String itemMarcaFornecedor;
    private BigDecimal precoCusto = BigDecimal.ZERO;
    private BigDecimal valorBase = BigDecimal.ZERO;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private BigDecimal quantidade = BigDecimal.ONE;
    private BigDecimal valorUnidade = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    
    private Evento evento;
    private String eventoDescricao;
    private PessoaEndereco eventoLocal;
    private Date eventoData;
    private BigDecimal valorFrete = BigDecimal.ZERO;
    
    private BigDecimal desconto = BigDecimal.ZERO; //transient
    private boolean incluso = false; //transient

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedi_item_id")
    //@SequenceGenerator(name = "seq_pedi_item_id", sequenceName = "seq_pedi_item_id", allocationSize = 1)
    //@Column(name = "pedi_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "pedi_id", nullable = false)
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    //@Column(name = "sequ", nullable = false)
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
    
    /*
        Descri��o do evento ao qual este item foi vinculado
        //@return
    */
    //@Column(name = "item_dscr", length = 255, nullable = false)
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
    //@Column(name="item_tipo", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'MERCADORIA'")
    public ItemTipo getItemTipo() {
        return itemTipo;
    }

    public void setItemTipo(ItemTipo itemTipo) {
        this.itemTipo = itemTipo;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_unid_id", nullable = false)
    public Unidade getItemUnidade() {
        return itemUnidade;
    }

    public void setItemUnidade(Unidade itemUnidade) {
        this.itemUnidade = itemUnidade;
    }

//    //@ManyToOne
//    //@JoinColumn(name = "item_marc_id", nullable = false)
//    public Marca getItemMarca() {
//        return itemMarca;
//    }
//
//    public void setItemMarca(Marca itemMarca) {
//        this.itemMarca = itemMarca;
//    }

    //@Column(name = "item_marc_forn")
    public String getItemMarcaFornecedor() {
        return itemMarcaFornecedor;
    }

    public void setItemMarcaFornecedor(String itemMarcaFornecedor) {
        this.itemMarcaFornecedor = itemMarcaFornecedor;
    }
    
    //@Column(name = "prec_cust", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    //@Column(name = "valo_base", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "desc_tipo", length = 11, nullable = false, 
    //columnDefinition = "character varying(11) default 'VALOR'")
    public DescontoTipo getDescontoTipo() {
        return descontoTipo;
    }

    public void setDescontoTipo(DescontoTipo descontoTipo) {
        this.descontoTipo = descontoTipo;
    }
    
    //@Column(name = "desc_valo", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getDescontoValor() {
        if(descontoValor == null){
            descontoValor = BigDecimal.ZERO;
        }
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name = "desc_porc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getDescontoPorcentagem() {
        if(descontoPorcentagem == null){
            descontoPorcentagem = BigDecimal.ZERO;
        }
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name = "quan", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    //@Column(name = "valo_unid", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(BigDecimal valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    //@Column(name = "valo_tota", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "even_id")
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
        
    /*
        Descri��o do evento ao qual este item foi vinculado
        //@return
    */
    //@Column(name = "even_dscr", length = 30)
    public String getEventoDescricao() {
        return eventoDescricao;
    }

    public void setEventoDescricao(String eventoDescricao) {
        this.eventoDescricao = eventoDescricao;
    }

    //@ManyToOne
    //@JoinColumn(name = "even_loca_id")
    public PessoaEndereco getEventoLocal() {
        return eventoLocal;
    }

    public void setEventoLocal(PessoaEndereco eventoLocal) {
        this.eventoLocal = eventoLocal;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "even_data")
    public Date getEventoData() {
        return eventoData;
    }

    public void setEventoData(Date eventoData) {
        this.eventoData = eventoData;
    }
    
    //@Column(name = "valo_fret", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
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
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.pedido);
        hash = 31 * hash + this.sequencia;
        hash = 31 * hash + Objects.hashCode(this.item);
        hash = 31 * hash + Objects.hashCode(this.quantidade);
        hash = 31 * hash + Objects.hashCode(this.evento);
        hash = 31 * hash + Objects.hashCode(this.desconto);
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
        final PedidoItem other = (PedidoItem) obj;
        if (this.sequencia != other.sequencia) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        if (!Objects.equals(this.evento, other.evento)) {
            return false;
        }
        if (!Objects.equals(this.desconto, other.desconto)) {
            return false;
        }
        return true;
    }
    


    @Override
    public String toString() {
        return "PedidoItem{" + "id=" + id + ", sequencia=" + sequencia + ", item=" + item + ", evento=" + evento + ", descricao=" + eventoDescricao + ", precoCusto=" + precoCusto + ", valorBase=" + valorBase + ", descontoTipo=" + descontoTipo + ", descontoPorcentagem=" + descontoPorcentagem + ", descontoValor=" + descontoValor + ", quantidade=" + quantidade + ", valorUnidade=" + valorUnidade + ", valorTotal=" + valorTotal + ", local=" + eventoLocal + ", dataEvento=" + eventoData + ", valorFrete=" + valorFrete + ", desconto=" + desconto + ", incluso=" + incluso + '}';
    }

    @Override
    public int compareTo(PedidoItem o) {
        return this.sequencia - o.sequencia;
    }
}
