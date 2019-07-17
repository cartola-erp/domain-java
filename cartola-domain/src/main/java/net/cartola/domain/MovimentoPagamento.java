package net.cartola.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * E um credito ou debito com valor e data de vencimento</br>
 * Sao MovimentoPagamento(s) os itens abaixo:
 * <ul>
 * <li>Pagamento em dinheiro</li>
 * <li>Titulo</li>
 * <li>Boleto - um unico boleto</li>
 * <li>Fatura - o vencimento ou parcela de uma fatura</li>
 * <li>Cheque - um unico cheque</li>
 * <li>Transferencia bancaria</li>
 * </ul>
 * 22/07/2015 23:18:46
 * //@author murilo
 */
//@Entity
//@Table(name = "movi_paga")
//@XmlRootElement
public class MovimentoPagamento extends RegistroBase {

    private static final long serialVersionUID = 1928374123946621L;
    private Long id;
    private MovimentoFormaPagamento formaPagamento;
    private MovimentoPagamentoSituacao movimentoPagamentoSituacao = MovimentoPagamentoSituacao.EM_ABERTO;
    private String codigoBarras;
    private Date periodo;
    private long referencia;
    private int idTributo;
    private String codigoOcorrencia;
    private String competencia;
    private long ieMunicipio;
    private long dividaAtivaEtiqueta;
    private double valorReceita;
    private double valorOutrasEntidades;
    private double receita;
    private double percentual;
    private int parcela = 1;
    private Date vencimento;
    private Date pagamento;
    private BigDecimal valorCobrado = BigDecimal.ZERO;
    private BigDecimal valorTroco = BigDecimal.ZERO; 
    private BigDecimal desconto = BigDecimal.ZERO;
    private BigDecimal juros = BigDecimal.ZERO;
    private BigDecimal multa = BigDecimal.ZERO;
    private BigDecimal valorPago = BigDecimal.ZERO;
    private List<MovimentoPagamentoBaixa> movimentoPagamentoBaixas;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movi_paga_id")
    //@SequenceGenerator(name = "seq_movi_paga_id", sequenceName = "seq_movi_paga_id", allocationSize = 1)
    //@Column(name = "movi_paga_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne
    //@JoinColumn(name = "form_paga_id", nullable = false)
    public MovimentoFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(MovimentoFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="movi_paga_situ", nullable = false)
    public MovimentoPagamentoSituacao getMovimentoPagamentoSituacao() {
        return movimentoPagamentoSituacao;
    }

    public void setMovimentoPagamentoSituacao(MovimentoPagamentoSituacao movimentoPagamentoSituacao) {
        this.movimentoPagamentoSituacao = movimentoPagamentoSituacao;
    }

    //@Column(name = "codi_barr")
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    //@Column(name = "parc", nullable = false)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "venc", nullable = false)
    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    
    //@Transient
    public String getVencimentoString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (this.vencimento == null) {
            return "";
        } else {
            return dataFormat.format(this.vencimento);
        }
    }
    

    //@Temporal(TemporalType.DATE)
    //@Column(name = "paga")
    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }
    
    //@Transient
    public String getPagamentoString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.pagamento == null) {
            return "";
        } else {
            return dataFormat.format(this.pagamento) + " �s " + horaFormat.format(this.pagamento);
        }
    }

    //@Column(name = "valo", precision = 13, scale = 6, nullable = false)
    public BigDecimal getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(BigDecimal valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    //@Column(name = "valo_troc", precision = 13, scale = 6, nullable = false)
    public BigDecimal getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = valorTroco;
    }
    
    //@Column(name = "dsct", precision = 13, scale = 6, nullable = false)
    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    //@Column(name = "juro", precision = 13, scale = 6, nullable = false)
    public BigDecimal getJuros() {
        return juros;
    }

    public void setJuros(BigDecimal juros) {
        this.juros = juros;
    }

    //@Column(name = "mora_mult", precision = 13, scale = 6, nullable = false)
    public BigDecimal getMulta() {
        return multa;
    }

    public void setMulta(BigDecimal multa) {
        this.multa = multa;
    }

    //@Column(name = "valo_pago", precision = 13, scale = 6, nullable = false)
    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    //@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "movimentoPagamento", fetch = FetchType.LAZY)
    public List<MovimentoPagamentoBaixa> getMovimentoPagamentoBaixas() {
        return movimentoPagamentoBaixas;
    }

    public void setMovimentoPagamentoBaixas(List<MovimentoPagamentoBaixa> movimentoPagamentoBaixas) {
        this.movimentoPagamentoBaixas = movimentoPagamentoBaixas;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "peri", nullable = false)
    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public int getIdTributo() {
        return idTributo;
    }

    public void setIdTributo(int idTributo) {
        this.idTributo = idTributo;
    }

    public String getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(String codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public double getValorOutrasEntidades() {
        return valorOutrasEntidades;
    }

    public void setValorOutrasEntidades(double valorOutrasEntidades) {
        this.valorOutrasEntidades = valorOutrasEntidades;
    }

    public long getIeMunicipio() {
        return ieMunicipio;
    }

    public void setIeMunicipio(long ieMunicipio) {
        this.ieMunicipio = ieMunicipio;
    }

    public long getDividaAtivaEtiqueta() {
        return dividaAtivaEtiqueta;
    }

    public void setDividaAtivaEtiqueta(long dividaAtivaEtiqueta) {
        this.dividaAtivaEtiqueta = dividaAtivaEtiqueta;
    }

    public double getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MovimentoPagamento)) {
            return false;
        }
        MovimentoPagamento other = (MovimentoPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "MovimentoPagamento[id=" + id + ", formaPagamento=\"" + formaPagamento + "\", valorCobrado=" + valorCobrado + "]";
    }

}
