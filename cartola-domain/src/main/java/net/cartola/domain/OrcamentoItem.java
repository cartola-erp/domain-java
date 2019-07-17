package net.cartola.domain;

import java.math.BigDecimal;

/**
 * 02/11/2015 02:19:49
 * //@author murilo
 */
//@Entity
//@Table(name = "orca_item")
//@XmlRootElement
public class OrcamentoItem extends RegistroBase {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Orcamento orcamento;
    private int sequencia;
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
    private BigDecimal valorUnidade = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orca_item_id")
    //@SequenceGenerator(name = "seq_orca_item_id", sequenceName = "seq_orca_item_id", allocationSize = 1)
    //@Column(name = "orca_item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "orca_id", nullable = false)
    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
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
    //@Column(name = "desc_tipo", length = 11, nullable = false, 
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof OrcamentoItem)) {
            return false;
        }
        OrcamentoItem other = (OrcamentoItem) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "OrcamentoItem[id=" + id + ", seq=" + sequencia + ", descricao=\"" + descricao + "\"]";
    }

}
