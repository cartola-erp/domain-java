package net.cartola.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * Representa todas as compras, vendas, transfer�ncias e qualquer outro movimento que possa haver<br/>
 * Os documentos fiscais est�o vinculados a esse registro sendo filhos deste<br/>
 * Os calculos de comiss�es, faturamento e cobran�as devem ser realizados com base neste documento<br/>
 * 
 * 22/07/2015 20:18:27
 * //@author murilo
 */
////@Entity
////@Table(name = "movi")
////@XmlRootElement(name = "movi")
////@XmlAccessorType(XmlAccessType.FIELD)
public class Movimento extends RegistroBase {

    private static final long serialVersionUID = 2930480128352490132L;
    private Long id;
    private Caixa caixa;
    private TransacaoComercial transacaoComercial;
    private Evento evento;
    private Pedido pedido;
    private Operacao operacao;
    private Date data;
    private MovimentoStatus movimentoStatus = MovimentoStatus.NORMAL;
    private PessoaCadastro remetente;
    private PessoaCadastro destinatario;
    private String pessoaNome;
    private double clienteFaturado = 0;
    private double clienteLimite = 0;
    private String pessoaObs;
    private String compradorNome;
    private Pessoa vendedor;
    private String vendedorNome;
    private Pessoa transportador;
    private Pessoa terceiro;
    private BigDecimal valorItens = BigDecimal.ZERO;
    private BigDecimal valorFrete = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private DescontoSobre descontoSobre = DescontoSobre.VALOR_TOTAL;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private String obs;
    private List<MovimentoItem> movimentoItens;
    private List<MovimentoFormaPagamento> movimentoFormasPagamentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movi_id")
    //@SequenceGenerator(name = "seq_movi_id", sequenceName = "seq_movi_id", allocationSize = 1)
    //@Column(name = "movi_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "caix_id")
    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    /**
     * A transacao comercial � um registro criado no momento do registro da primeira opera��o<br/>
     * Logo n�o deve ter uma devolu��o que inicie uma transa��o, sempre deve ter sido iniciada pela compra ou venda<br/>
     * Quando houver uma cota��o, or�amento de compra ou venda ent�o a transa��o deve-se iniciar neste instante<br/>
     * //@return 
     */
    //@ManyToOne
    //@JoinColumn(name = "tran_come_id", nullable = false)
    public TransacaoComercial getTransacaoComercial() {
        return transacaoComercial;
    }

    public void setTransacaoComercial(TransacaoComercial transacaoComercial) {
        this.transacaoComercial = transacaoComercial;
    }

    //@ManyToOne
    //@JoinColumn(name = "pedi_id")
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "even_id")
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    //@ManyToOne
    //@JoinColumn(name = "oper_id", nullable = false)  
    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="data_movi")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "movi_stat", length = 14, nullable = false)
    public MovimentoStatus getMovimentoStatus() {
        return movimentoStatus;
    }

    public void setMovimentoStatus(MovimentoStatus movimentoStatus) {
        this.movimentoStatus = movimentoStatus;
    }

    //@ManyToOne
    //@JoinColumn(name = "reme_id", nullable = false)
    public PessoaCadastro getRemetente() {
        return remetente;
    }

    public void setRemetente(PessoaCadastro remetente) {
        this.remetente = remetente;
    }

    //@ManyToOne
    //@JoinColumn(name = "dest_id", nullable = false)
    public PessoaCadastro getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(PessoaCadastro destinatario) {
        this.destinatario = destinatario;
    }

    //@Column(name="pess_nome")
    public String getPessoaNome() {
        return pessoaNome;
    }

    public void setPessoaNome(String pessoaNome) {
        this.pessoaNome = pessoaNome;
    }

    //@Column(name="clie_fatu", precision = 13, scale = 4, nullable = false)
    public double getClienteFaturado() {
        return clienteFaturado;
    }

    public void setClienteFaturado(double clienteFaturado) {
        this.clienteFaturado = clienteFaturado;
    }

    //@Column(name="clie_limi", precision = 13, scale = 4, nullable = false)
    public double getClienteLimite() {
        return clienteLimite;
    }

    public void setClienteLimite(double clienteLimite) {
        this.clienteLimite = clienteLimite;
    }

    //@Lob
    //@Column(name="pess_obs")
    public String getPessoaObs() {
        return pessoaObs;
    }

    public void setPessoaObs(String pessoaObs) {
        this.pessoaObs = pessoaObs;
    }

    //@Column(name="comp_nome")
    public String getCompradorNome() {
        return compradorNome;
    }

    public void setCompradorNome(String compradorNome) {
        this.compradorNome = compradorNome;
    }

    //@ManyToOne
    //@JoinColumn(name = "vend_id")
    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }
    
    //@Column(name="vend_nome")
    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    //@ManyToOne
    //@JoinColumn(name = "tran_id")
    public Pessoa getTransportador() {
        return transportador;
    }

    public void setTransportador(Pessoa transportador) {
        this.transportador = transportador;
    }

    //@ManyToOne
    //@JoinColumn(name = "terc_id")
    public Pessoa getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(Pessoa terceiro) {
        this.terceiro = terceiro;
    }

    //@Column(name="valo_iten", precision = 13, scale = 4, nullable = false)
    public BigDecimal getValorItens() {
        return valorItens;
    }

    public void setValorItens(BigDecimal valorItens) {
        this.valorItens = valorItens;
    }

    //@Column(name = "valo_fret", precision = 13, scale = 4, nullable = false)
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
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

    //@Column(name = "desc_perc", precision = 5, scale = 4, nullable = false)
    public BigDecimal getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name = "desc_valo", precision = 13, scale = 4, nullable = false, 
  //  //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getDescontoValor() {
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
    }

    //@Column(name="valo_tota", precision = 13, scale = 4, nullable = false)
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

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "movimento")
    public List<MovimentoItem> getMovimentoItens() {
        if(this.movimentoItens == null){
            this.movimentoItens = new ArrayList<>();
        }
        return movimentoItens;
    }

    public void setMovimentoItens(List<MovimentoItem> movimentoItens) {
        this.movimentoItens = movimentoItens;
    }
    
    public void add(MovimentoItem movimentoItem) {
        if (this.movimentoItens == null) {
            this.movimentoItens = new ArrayList<>();
        }
        movimentoItem.setMovimento(this);
        this.movimentoItens.add(movimentoItem);
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "movimento")
    public List<MovimentoFormaPagamento> getMovimentoFormasPagamentos() {
        if(this.movimentoFormasPagamentos == null){
            this.movimentoFormasPagamentos = new ArrayList<>();
        }
        return movimentoFormasPagamentos;
    }


    public void setMovimentoFormasPagamentos(List<MovimentoFormaPagamento> movimentoFormasPagamentos) {
        this.movimentoFormasPagamentos = movimentoFormasPagamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Movimento[id=" + id + ", operacao=" + operacao + "]";
    }

}
