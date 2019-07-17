package net.cartola.domain;

import java.math.BigDecimal;
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
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;



/**
 * 22/07/2015 23:36:10
 * //@author murilo
 */
//@Entity
//@Table(name = "movi_form_pgmt")
//@XmlRootElement
public class MovimentoFormaPagamento extends RegistroBase {

    private static final long serialVersionUID = 1928731923261L;
    private Long id;
    private Movimento movimento;
    private int sequencia;
    private ModoPagamento formaPagamento;
    
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
    private List<MovimentoPagamento> pagamentos;
    
    private boolean incluso = false; //transient

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movi_form_paga_id")
    //@SequenceGenerator(name = "seq_movi_form_paga_id", sequenceName = "seq_movi_form_paga_id", allocationSize = 1)
    //@Column(name = "movi_form_paga_id")
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
//    //@JoinColumn(name = "form_paga_id", nullable = false)
    //@JoinColumn(name = "form_paga_id")
    public ModoPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ModoPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "form_rece", length = 30, 
//    //@Column(name = "form_rece", length = 30, nullable = false, 
  //  columnDefinition = "character varying(30) default 'DINHEIRO_A_VISTA'")
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

//    //@Column(name = "dscr", nullable = false)
    //@Column(name = "dscr")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Enumerated(EnumType.STRING)
//    //@Column(name = "peri_calc_tipo", length = 14, nullable = false, 
    //@Column(name = "peri_calc_tipo", length = 14, 
  //  columnDefinition = "character varying(14) default 'DIA'")
    public PeriodoCalculoTipo getPeriodoCalculoTipo() {
        return periodoCalculoTipo;
    }

    public void setPeriodoCalculoTipo(PeriodoCalculoTipo periodoCalculoTipo) {
        this.periodoCalculoTipo = periodoCalculoTipo;
    }

//    //@Column(name = "calc", nullable = false)
    //@Column(name = "calc")
    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name = "acre_tipo", length = 20,
//    //@Column(name = "acre_tipo", length = 20, nullable = false, 
   // columnDefinition = "character varying(20) default 'SEM_ACRESCIMO'")
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

//    //@Column(name = "acre_valo", precision = 13, scale = 4, nullable = false, 
    //@Column(name = "acre_valo", precision = 13, scale = 4, 
 //   columnDefinition = "Numeric(13,4) default '0.00'")
    public BigDecimal getAcrescimoValor() {
        return acrescimoValor;
    }

    public void setAcrescimoValor(BigDecimal acrescimoValor) {
        this.acrescimoValor = acrescimoValor;
    }

//        //@Column(name = "acre_porc", precision = 5, scale = 4, nullable = false, 
    //@Column(name = "acre_porc", precision = 5, scale = 4, 
  //  columnDefinition = "Numeric(5,4) default '0.00'")
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
 //   columnDefinition = "Numeric(13,6) default '0.00'")
    public BigDecimal getValorBase() {
        return valorBase;
    }

    public void setValorBase(BigDecimal valorBase) {
        this.valorBase = valorBase;
    }
    
    //@Column(name = "valo_tota", nullable = false, 
   // columnDefinition = "Numeric(13,4) default '0.00'")
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
  //  columnDefinition = "Numeric(13,6) default '0.00'")
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
    
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPagamento")
    public List<MovimentoPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<MovimentoPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MovimentoFormaPagamento)) {
            return false;
        }
        MovimentoFormaPagamento other = (MovimentoFormaPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "MovimentoFormaPagamento[ id=" + id + ", valorTotal=" + this.valorTotal + ", formaPagamento=\"" + this.formaPagamento + "\"]";
    }

}
