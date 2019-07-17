package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 05/11/2015 15:16:18
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_pedi_item")
//@XmlRootElement
public class CompraPedidoItem extends RegistroBase {
    private static final long serialVersionUID = 12379934813288291L;
    private Long id;
    private CompraPedido compraPedido;
    private Item item;
    private String descricao;
    private String marca;
    private String unidade;
    private BigDecimal custo = BigDecimal.ZERO;
    private BigDecimal valorBase = BigDecimal.ZERO;
    private DescontoTipo descontoTipo = DescontoTipo.PORCENTAGEM;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal quantidade = BigDecimal.ZERO;
    private BigDecimal quantidadeEntregue = BigDecimal.ZERO;
    private BigDecimal valorUnidade = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private Date prazoEntrega;


    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_pedi_item_id")
    //@SequenceGenerator(name = "seq_comp_pedi_item_id", sequenceName = "seq_comp_pedi_item_id", allocationSize = 1)
    //@Column(name = "comp_pedi_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "comp_pedi_id", nullable = false)
    public CompraPedido getCompraPedido() {
        return compraPedido;
    }

    public void setCompraPedido(CompraPedido compraPedido) {
        this.compraPedido = compraPedido;
    }

    //@ManyToOne
    //@JoinColumn(name = "item_id")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Column(name = "marc")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //@Column(name = "unid", length = 6)
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    //@Column(name = "cust", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
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
    //@Column(name="desc_tipo", length = 11, nullable = false, 
    //columnDefinition = "character varying(11) default 'VALOR'")
    public DescontoTipo getDescontoTipo() {
        return descontoTipo;
    }

    public void setDescontoTipo(DescontoTipo descontoTipo) {
        this.descontoTipo = descontoTipo;
    }

    //@Column(name = "desc_porc", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name = "desc_valo", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getDescontoValor() {
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name = "quan", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    //@Column(name = "quan_entr", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getQuantidadeEntregue() {
        return quantidadeEntregue;
    }

    public void setQuantidadeEntregue(BigDecimal quantidadeEntregue) {
        this.quantidadeEntregue = quantidadeEntregue;
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

    //@Temporal(TemporalType.DATE)
    public Date getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Date prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraPedidoItem)) {
            return false;
        }
        CompraPedidoItem other = (CompraPedidoItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CompraPedidoItem[ id=" + id + ", descricao=\"" + descricao + "\"]";
    }

}
