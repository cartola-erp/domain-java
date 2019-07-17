package net.cartola.domain;

import java.math.BigDecimal;
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
//import javax.persistence.Transient;
//import javax.persistence.UniqueConstraint;

/**
 * 27/10/2015 01:07:43
 * //@author murilo
 */
//@Entity
//@Table(name = "esto", uniqueConstraints = {
    //@UniqueConstraint(columnNames = "pess_cada_id, item_id", name = "unk_esto_pess_cada_item")})
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e")
  // ,//@NamedQuery(name = "Estoque.findByItemIdEmpresaUnidadeId", query = "SELECT e FROM Estoque e WHERE e.item.id=:itemId AND e.empresaUnidade.id=:empresaUnidadeId")})
public class Estoque  extends RegistroBase {
    private static final long serialVersionUID = 555511112221L;
    private Long id;

    private EmpresaUnidade empresaUnidade;
    private Item item;
    private int diasEstoqueSeguranca = 0;
    private String curva;
    private BigDecimal cmd = BigDecimal.ZERO;
    private BigDecimal pontoPedido = BigDecimal.ZERO;
    private BigDecimal cotacao = BigDecimal.ZERO;
    private BigDecimal pedido = BigDecimal.ZERO;
    private BigDecimal comprado = BigDecimal.ZERO;
    private BigDecimal transito = BigDecimal.ZERO;
    private BigDecimal expedicaoEntrada = BigDecimal.ZERO;
    private BigDecimal expedicaoSaida = BigDecimal.ZERO;
    private BigDecimal garantiaAguardando = BigDecimal.ZERO;
    private BigDecimal garantiaRemetida = BigDecimal.ZERO;
    private BigDecimal consignacaoRemetida = BigDecimal.ZERO;
    private BigDecimal consignacaoRecebida = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_esto_id")
    //@SequenceGenerator(name = "seq_esto_id", sequenceName = "seq_esto_id", allocationSize = 1)
    //@Column(name = "esto_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "pess_cada_id", nullable = false, updatable = false)
    public EmpresaUnidade getEmpresaUnidade() {
        return empresaUnidade;
    }

    public void setEmpresaUnidade(EmpresaUnidade pessoaCadastro) {
        this.empresaUnidade = pessoaCadastro;
    }
    
    //@ManyToOne
    //@JoinColumn(name = "item_id", nullable = false, updatable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Quantos dias deseja-se atender a demanda caso o fornecimento do material atrase<br/>
     * Quanto maior a porcetagem desejada, maior sera o estoque de seguran�a<br/>
     * //@return 
     */
    //@Column(name = "dias_esto_segu", scale = 3, precision = 0, nullable = false)
    public int getDiasEstoqueSeguranca() {
        return diasEstoqueSeguranca;
    }

    public void setDiasEstoqueSeguranca(int diasEstoqueSeguranca) {
        this.diasEstoqueSeguranca = diasEstoqueSeguranca;
    }

    //@Column(name = "curv", length = 20)
    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }

    //@Column(name = "cmd", precision = 13, scale = 6, nullable = false, 
   // columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getCmd() {
        return cmd;
    }

    public void setCmd(BigDecimal cmd) {
        this.cmd = cmd;
    }
    
    /**
     * Este item so deve calculado quando o estoque for de um armazem de distribuicao
     * //@return 
     */
    //@Column(name = "pont_pedi", precision = 13, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getPontoPedido() {
        return pontoPedido;
    }

    public void setPontoPedido(BigDecimal pontoPedido) {
        this.pontoPedido = pontoPedido;
    }

    //@Column(name = "cota", precision = 11, scale = 4, nullable = false,  
  //  columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getCotacao() {
        return cotacao;
    }

    public void setCotacao(BigDecimal cotacao) {
        this.cotacao = cotacao;
    }

    //@Column(name = "pedi", precision = 11, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getPedido() {
        return pedido;
    }

    public void setPedido(BigDecimal pedido) {
        this.pedido = pedido;
    }

    //@Column(name = "comp", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getComprado() {
        return comprado;
    }

    public void setComprado(BigDecimal comprado) {
        this.comprado = comprado;
    }

    //@Column(name = "tran", precision = 11, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getTransito() {
        return transito;
    }

    public void setTransito(BigDecimal transito) {
        this.transito = transito;
    }

    //@Column(name = "expe_entr", precision = 11, scale = 4)
    public BigDecimal getExpedicaoEntrada() {
        return expedicaoEntrada;
    }

    public void setExpedicaoEntrada(BigDecimal expedicaoEntrada) {
        this.expedicaoEntrada = expedicaoEntrada;
    }

    //@Column(name = "expe_said", precision = 11, scale = 4)
    public BigDecimal getExpedicaoSaida() {
        return expedicaoSaida;
    }

    public void setExpedicaoSaida(BigDecimal expedicaoSaida) {
        this.expedicaoSaida = expedicaoSaida;
    }

    //@Column(name = "gara_agua", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getGarantiaAguardando() {
        return garantiaAguardando;
    }

    public void setGarantiaAguardando(BigDecimal garantiaAguardando) {
        this.garantiaAguardando = garantiaAguardando;
    }

    //@Column(name = "gara_reme", precision = 11, scale = 4, nullable = false, 
  //  columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getGarantiaRemetida() {
        return garantiaRemetida;
    }

    public void setGarantiaRemetida(BigDecimal garantiaRemetida) {
        this.garantiaRemetida = garantiaRemetida;
    }

    //@Column(name = "cons_reme", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getConsignacaoRemetida() {
        return consignacaoRemetida;
    }

    public void setConsignacaoRemetida(BigDecimal consignacaoRemetida) {
        this.consignacaoRemetida = consignacaoRemetida;
    }

    //@Column(name = "cons_rece", precision = 11, scale = 4, nullable = false, 
   // columnDefinition = "Numeric(11,4) default '0.00'")
    public BigDecimal getConsignacaoRecebida() {
        return consignacaoRecebida;
    }

    public void setConsignacaoRecebida(BigDecimal consignacaoRecebida) {
        this.consignacaoRecebida = consignacaoRecebida;
    }
    
    /**
     * Estoque que deve suprir a demanda caso a entrega do fornecedor atraze.
     * 
     * //@return 
     */
    //@Transient
    public Double getEstoqueSeguranca() {
        return (cmd != null ? cmd.doubleValue() : 0d) * this.diasEstoqueSeguranca;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Estoque[ id=" + id + " ]";
    }

}
