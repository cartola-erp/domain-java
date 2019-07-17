/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cartola.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * //@author DavidWD
 */
//@Entity
//@Table(name = "pedi_pgmt")
//@XmlRootElement
public class PedidoPagamento extends RegistroBase {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Pedido pedido;
    private int sequencia;
    private ModoPagamento modoPagamento;
    
    private FormaRecebimento formaRecebimento = FormaRecebimento.DINHEIRO_A_VISTA;
    private String descricao;
    private PeriodoCalculoTipo periodoCalculoTipo = PeriodoCalculoTipo.DIA;
    private String calculo = "0";
    private AcrescimoTipo acrescimoTipo = AcrescimoTipo.SEM_ACRESCIMO;
    private BigDecimal acrescimoValor = BigDecimal.ZERO;
    private BigDecimal acrescimoPorcentagem = BigDecimal.ZERO;
    private int qtdParcelas = 1;
    private BigDecimal valorBase = BigDecimal.ZERO;
    private BigDecimal valorTotal = BigDecimal.ZERO; 
    private BigDecimal valorTroco = BigDecimal.ZERO; 
    
    private boolean incluso = false; //transient
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedi_pgmt_id")
    //@SequenceGenerator(name = "seq_pedi_pgmt_id", sequenceName = "seq_pedi_pgmt_id", allocationSize = 1)
    //@Column(name = "pedi_pgmt_id")
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
    //@JoinColumn(name = "pgmt_id", nullable = false)
    public ModoPagamento getModoPagamento() {
        return modoPagamento;
    }

    public void setModoPagamento(ModoPagamento modoPagamento) {
        this.modoPagamento = modoPagamento;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "form_rece", length = 30, nullable = false, 
    //columnDefinition = "character varying(30) default 'DINHEIRO_A_VISTA'")
    public FormaRecebimento getFormaRecebimento() {
        return formaRecebimento;
    }

    public void setFormaRecebimento(FormaRecebimento formaRecebimento) {
        this.formaRecebimento = formaRecebimento;
    }
    
    public String getFormaRecebimentoString() {
        switch (formaRecebimento) {
            case DINHEIRO_A_VISTA:
                return "Dinheiro a Vista";
            case DEBITO:
                return "D�bito";
            case CREDITO:
                return "Cr�dito";
            case CHEQUE:
                return "Cheque";
            case CHEQUE_A_VISTA:
                return "Cheque � Vista";
            case A_PRAZO:
                return "A Prazo";
            case ADIANTAMENTO_CLIENTE:
                return "Adiantamento Cliente";
            case DEPOSITO_EM_CONTA:
                return "A Prazo";
            case CARTAO_REFEICAO:
                return "A Prazo";
            case VALE_REFEICAO:
                return "A Prazo";
            default:
                return "-";
        }
    }

    //@Column(name = "dscr", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "peri_calc_tipo", length = 14, nullable = false, 
    //columnDefinition = "character varying(14) default 'DIA'")
    public PeriodoCalculoTipo getPeriodoCalculoTipo() {
        return periodoCalculoTipo;
    }

    public void setPeriodoCalculoTipo(PeriodoCalculoTipo periodoCalculoTipo) {
        this.periodoCalculoTipo = periodoCalculoTipo;
    }

    //@Column(name = "calc", nullable = false)
    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "acre_tipo", length = 20, nullable = false, 
    //columnDefinition = "character varying(20) default 'SEM_ACRESCIMO'")
    public AcrescimoTipo getAcrescimoTipo() {
        return acrescimoTipo;
    }

    public void setAcrescimoTipo(AcrescimoTipo acrescimoTipo) {
        this.acrescimoTipo = acrescimoTipo;
    }
    
    public String getAcrescimoTipoString(){
        switch(this.acrescimoTipo){
            case PORCENTAGEM:
                return "Porcentagem";
            case VALOR_FIXO:
                return "Valore Fixo";
            default:
                return "Sem Acr�scimo";
        }
    }

    //@Column(name = "acre_valo", precision = 13, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getAcrescimoValor() {
        return acrescimoValor;
    }

    public void setAcrescimoValor(BigDecimal acrescimoValor) {
        this.acrescimoValor = acrescimoValor;
    }
    
    //@Column(name = "acre_porc", precision = 5, scale = 4, nullable = false, 
    //columnDefinition = "Numeric(5,4) default '0.00'")
    public BigDecimal getAcrescimoPorcentagem() {
        return acrescimoPorcentagem;
    }

    public void setAcrescimoPorcentagem(BigDecimal acrescimoPorcentagem) {
        this.acrescimoPorcentagem = acrescimoPorcentagem;
    }

    //@Column(name = "qtd_parc")
    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    /**
     * valor da pagar (sem acr�scimos)
     * 
     * //@return 
     */
    //@Column(name = "valo_base", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }

    /**
     * valor a pagar (ap�s acrescentar acr�scimos)
     * //@return 
     */
    //@Column(name = "valo_tota", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * valor em troco
     * somente o primeiro (maior) pagamento da lista guarda o valor em troco
     * //@return 
     */
    //@Column(name = "valo_troc", precision = 13, scale = 6, nullable = false, 
    //columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorTroco() {
//        if(valorTroco == null){
//            valorTroco = new BigDecimal(BigInteger.ZERO);
//        }
        return valorTroco;
    }

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = valorTroco;
    }
  
    //@Transient
    public boolean isIncluso() {
        return incluso;
    }

    public void setIncluso(boolean incluso) {
        this.incluso = incluso;
    }

    //@Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.pedido);
        hash = 83 * hash + this.sequencia;
        hash = 83 * hash + Objects.hashCode(this.modoPagamento);
        return hash;
    }

    //@Override
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
        final PedidoPagamento other = (PedidoPagamento) obj;
        if (this.sequencia != other.sequencia) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        if (!Objects.equals(this.modoPagamento, other.modoPagamento)) {
            return false;
        }
        return true;
    }

    //@Override
    public String toString() {
        return "PedidoPagamento{" + "id=" + id + ", pedido=" + pedido + ", sequencia=" + sequencia + ", modoPagamento=" + modoPagamento + '}';
    }
    
 
    
}
