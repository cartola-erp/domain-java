package net.cartola.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 05/11/2015 15:16:09
 * //@author murilo
 */
//@Entity
//@Table(name = "comp_pedi")
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "CompraPedido.findAll", query = "SELECT c FROM CompraPedido c")})
public class CompraPedido extends RegistroBase {
    private static final long serialVersionUID = 881289181811L;
    private Long id;
    private PessoaCadastro fornecedor;
    private PessoaCadastro destinatario;
    private String descricao;
    private Usuario solicitante;
    private Date prazoEntrega;
    private FreteTipo freteTipo = FreteTipo.CIF;
    private boolean fretePago = false;
    private CompraPedidoSituacao compraPedidoSituacao = CompraPedidoSituacao.EM_ABERTO;
    private CompraPedidoTipo compraPedidoTipo = CompraPedidoTipo.REPOSICAO;
    private boolean aprovado = false;
    private Usuario aprovadorPor;
    private PessoaCadastro transportador;
    private PessoaCadastro terceiro;
    private BigDecimal valorProdutos = BigDecimal.ZERO;
    private BigDecimal valorEntregue = BigDecimal.ZERO;
    private int itensQuantidadePedido;
    private int itensQuantidadeEntregue;
    private DescontoSobre descontoSobre = DescontoSobre.VALOR_TOTAL;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private String obs;
    private List<CompraPedidoItem> itens;
    private List<CompraPedidoFormaPagamento> formasPagamentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_pedi_id")
    //@SequenceGenerator(name = "seq_comp_pedi_id", sequenceName = "seq_comp_pedi_id", allocationSize = 1)
    //@Column(name = "comp_pedi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "forn_id", nullable = false)
    public PessoaCadastro getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(PessoaCadastro fornecedor) {
        this.fornecedor = fornecedor;
    }

    //@ManyToOne
    //@JoinColumn(name = "dest_id", nullable = false)
    public PessoaCadastro getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(PessoaCadastro destinatario) {
        this.destinatario = destinatario;
    }

    //@Column(name = "dscr")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@ManyToOne
    //@JoinColumn(name = "soli_id")
    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="praz_entr", nullable = false)
    public Date getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Date prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="fret_tipo", length = 3, nullable = false, 
    //columnDefinition = "character varying(3) default 'CIF'")
    public FreteTipo getFreteTipo() {
        return freteTipo;
    }

    public void setFreteTipo(FreteTipo freteTipo) {
        this.freteTipo = freteTipo;
    }

    //@Column(name="fret_pago", nullable = false)
    public boolean isFretePago() {
        return fretePago;
    }

    public void setFretePago(boolean fretePago) {
        this.fretePago = fretePago;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="comp_pedi_situ", length = 30, nullable = false, 
    //columnDefinition = "character varying(30) default 'EM_ABERTO'")
    public CompraPedidoSituacao getCompraPedidoSituacao() {
        return compraPedidoSituacao;
    }

    public void setCompraPedidoSituacao(CompraPedidoSituacao compraPedidoSituacao) {
        this.compraPedidoSituacao = compraPedidoSituacao;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="comp_pedi_tipo", length = 30, nullable = false, 
    //columnDefinition = "character varying(30) default 'REPOSICAO'")
    public CompraPedidoTipo getCompraPedidoTipo() {
        return compraPedidoTipo;
    }

    public void setCompraPedidoTipo(CompraPedidoTipo compraPedidoTipo) {
        this.compraPedidoTipo = compraPedidoTipo;
    }

    //@Column(name="apro", nullable = false)
    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //@ManyToOne
    //@JoinColumn(name = "apro_por_id")
    public Usuario getAprovadorPor() {
        return aprovadorPor;
    }

    public void setAprovadorPor(Usuario aprovadorPor) {
        this.aprovadorPor = aprovadorPor;
    }

    //@ManyToOne
    //@JoinColumn(name = "tran_id")
    public PessoaCadastro getTransportador() {
        return transportador;
    }

    public void setTransportador(PessoaCadastro transportador) {
        this.transportador = transportador;
    }

    //@ManyToOne
    //@JoinColumn(name = "terc_id")
    public PessoaCadastro getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(PessoaCadastro terceiro) {
        this.terceiro = terceiro;
    }

    //@Column(name = "valo_prod", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(BigDecimal valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    //@Column(name = "valo_entr", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorEntregue() {
        return valorEntregue;
    }

    public void setValorEntregue(BigDecimal valorEntregue) {
        this.valorEntregue = valorEntregue;
    }

    //@Column(name = "iten_quan_pedi", nullable = false)
    public int getItensQuantidadePedido() {
        return itensQuantidadePedido;
    }

    public void setItensQuantidadePedido(int itensQuantidadePedido) {
        this.itensQuantidadePedido = itensQuantidadePedido;
    }

    //@Column(name="iten_quan_entr", nullable = false)
    public int getItensQuantidadeEntregue() {
        return itensQuantidadeEntregue;
    }

    public void setItensQuantidadeEntregue(int itensQuantidadeEntregue) {
        this.itensQuantidadeEntregue = itensQuantidadeEntregue;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "desc_sobr", length = 30, nullable = false, 
    //columnDefinition = "character varying(30) default 'VALOR_TOTAL'")
    public DescontoSobre getDescontoSobre() {
        return descontoSobre;
    }

    public void setDescontoSobre(DescontoSobre descontoSobre) {
        this.descontoSobre = descontoSobre;
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

    //@Column(name="desc_valo", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getDescontoValor() {
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name = "desc_porc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name="valo_tota", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    //@Column(name="obs")
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "compraPedido")
    public List<CompraPedidoItem> getItens() {
        return itens;
    }
    
    public boolean add(CompraPedidoItem compraPedidoItem) {
        if (this.itens == null) {
            this.itens = new ArrayList<>();
        }
        boolean add = this.itens.add(compraPedidoItem);
        if(add) {
            compraPedidoItem.setCompraPedido(this);
        }
        return add;
    }

    public void setItens(List<CompraPedidoItem> itens) {
        this.itens = itens;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "compraPedido")
    public List<CompraPedidoFormaPagamento> getFormasPagamentos() {
        return formasPagamentos;
    }

    public void setFormasPagamentos(List<CompraPedidoFormaPagamento> formasPagamentos) {
        this.formasPagamentos = formasPagamentos;
    }

    //@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //@Override
    public boolean equals(Object object) {
        if (!(object instanceof CompraPedido)) {
            return false;
        }
        CompraPedido other = (CompraPedido) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    //@Override
    public String toString() {
        return "CompraPedido[id=" + id + ", descricao=\"" + this.descricao + "\"]";
    }

}
