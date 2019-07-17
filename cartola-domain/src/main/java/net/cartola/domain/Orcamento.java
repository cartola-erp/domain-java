package net.cartola.domain;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 02/11/2015 02:19:38
 *
 * //@author murilo
 */
//@Entity
//@Table(name = "orca")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Orcamento.findAll", query = "SELECT o FROM Orcamento o")})
public class Orcamento extends RegistroBase {

    private static final long serialVersionUID = 123123456456L;
    private Long id;
    private TransacaoComercial transacaoComercial;
    private Evento evento;
    private Date data;
    private OrcamentoStatus orcamentoStatus = OrcamentoStatus.NORMAL;
    private Pessoa remetente;
    private Pessoa destinatario;
    private String clienteNome;
    private double clienteFaturado;
    private double clienteLimite;
    private String clienteObs;
    private String compradorNome;
    private Pessoa vendedor;
    private String vendedorNome;
    private Pessoa terceiro;
    private BigDecimal valorProdutos = BigDecimal.ZERO;
    private DescontoSobre descontoSobre = DescontoSobre.VALOR_TOTAL;
    private DescontoTipo descontoTipo = DescontoTipo.VALOR;
    private BigDecimal descontoValor = BigDecimal.ZERO;
    private BigDecimal descontoPorcentagem = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private String obs;
    private List<OrcamentoItem> itens;
    private List<OrcamentoFormaPagamento> formasPagamentos;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orca_id")
    //@SequenceGenerator(name = "seq_orca_id", sequenceName = "seq_orca_id", allocationSize = 1)
    //@Column(name = "orca_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * A transacao comercial � um registro criado no momento do registro da primeira opera��o<br/>
     * Logo n�o deve ter uma devolu��o que inicie uma transa��o, sempre deve ter sido iniciada pela compra ou venda<br/>
     * Quando houver uma cota��o, or�amento de compra ou venda ent�o a transa��o deve-se iniciar neste instante<br/>
     * //@return 
     */
    //@ManyToOne
    //@JoinColumn(name = "tran_id", nullable = true)
    public TransacaoComercial getTransacaoComercial() {
        return transacaoComercial;
    }

    public void setTransacaoComercial(TransacaoComercial transacaoComercial) {
        this.transacaoComercial = transacaoComercial;
    }

    //@ManyToOne
    //@JoinColumn(name = "even_id")
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="data_movi", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="orca_stat")
    public OrcamentoStatus getOrcamentoStatus() {
        return orcamentoStatus;
    }

    public void setOrcamentoStatus(OrcamentoStatus orcamentoStatus) {
        this.orcamentoStatus = orcamentoStatus;
    }

    //@ManyToOne
    //@JoinColumn(name = "reme_id", nullable = false)
    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    //@ManyToOne
    //@JoinColumn(name = "dest_id", nullable = false)
    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    //@Column(name="clie_nome")
    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    //@Column(name="clie_fatu", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public double getClienteFaturado() {
        return clienteFaturado;
    }

    public void setClienteFaturado(double clienteFaturado) {
        this.clienteFaturado = clienteFaturado;
    }

    //@Column(name="clie_limi", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public double getClienteLimite() {
        return clienteLimite;
    }

    public void setClienteLimite(double clienteLimite) {
        this.clienteLimite = clienteLimite;
    }

    //@Lob
    //@Column(name="clie_obs")
    public String getClienteObs() {
        return clienteObs;
    }

    public void setClienteObs(String clienteObs) {
        this.clienteObs = clienteObs;
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
    //@JoinColumn(name = "terc_id")
    public Pessoa getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(Pessoa terceiro) {
        this.terceiro = terceiro;
    }

    //@Column(name="valo_prod", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(BigDecimal valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "desc_sobr", length = 11, nullable = false, 
    //columnDefinition = "character varying(11) default 'VALOR'")
    public DescontoSobre getDescontoSobre() {
        return descontoSobre;
    }

    public void setDescontoSobre(DescontoSobre descontoSobre) {
        this.descontoSobre = descontoSobre;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="desc_tipo", nullable = false, length = 11)
    public DescontoTipo getDescontoTipo() {
        return descontoTipo;
    }

    public void setDescontoTipo(DescontoTipo descontoTipo) {
        this.descontoTipo = descontoTipo;
    }

    //@Column(name="desc_porc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public void setDescontoPorcentagem(BigDecimal descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    //@Column(name="desc_valo", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getDescontoValor() {
        return descontoValor;
    }

    public void setDescontoValor(BigDecimal descontoValor) {
        this.descontoValor = descontoValor;
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

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "orcamento")
    public List<OrcamentoItem> getItens() {
        return itens;
    }

    public void add(OrcamentoItem orcamentoItem) {
        if(this.itens==null) {
            this.itens = new ArrayList<>();
        }
        orcamentoItem.setOrcamento(this);
        this.itens.add(orcamentoItem);
    }

    public void setItens(List<OrcamentoItem> itens) {
        this.itens = itens;
    }

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "orcamento")
    public List<OrcamentoFormaPagamento> getFormasPagamentos() {
        return formasPagamentos;
    }

    public boolean add(OrcamentoFormaPagamento orcamentoFormaPagamento) {
        if(this.formasPagamentos == null) {
            this.formasPagamentos = new ArrayList<>();
        }
        orcamentoFormaPagamento.setOrcamento(this);
        return this.formasPagamentos.add(orcamentoFormaPagamento);
    }

    public void setFormasPagamentos(List<OrcamentoFormaPagamento> formasPagamentos) {
        this.formasPagamentos = formasPagamentos;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Orcamento[id=" + id + ", data=\"" + DateFormat.getDateInstance().format(data) + "\"]";
    }

}
