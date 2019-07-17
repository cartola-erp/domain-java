package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 * 13/04/2016 19:52:01
 * //@author murilo
 */
//@Entity
//@Table(name = "movi_paga_baix")
//@XmlRootElement
public class MovimentoPagamentoBaixa extends RegistroBase {
    private static final long serialVersionUID = 39467076222084543L;
    private Long id;
    private MovimentoPagamento movimentoPagamento;
    private Date dataBaixa;
    private BigDecimal saldoPagamento = BigDecimal.ZERO;
    private BigDecimal desconto = BigDecimal.ZERO;
    private BigDecimal juros = BigDecimal.ZERO;
    private BigDecimal multa = BigDecimal.ZERO;
    private BigDecimal valorPago = BigDecimal.ZERO;

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movi_paga_baix_id")
    //@SequenceGenerator(name = "seq_movi_paga_baix_id", sequenceName = "seq_movi_paga_baix_id", allocationSize = 1)
    //@Column(name = "movi_paga_baix_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovimentoPagamento getMovimentoPagamento() {
        return movimentoPagamento;
    }

    public void setMovimentoPagamento(MovimentoPagamento movimentoPagamento) {
        this.movimentoPagamento = movimentoPagamento;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name = "data_baix")
    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    //@Column(name = "sald_paga", precision = 13, scale = 6, nullable = false)
    public BigDecimal getSaldoPagamento() {
        return saldoPagamento;
    }

    public void setSaldoPagamento(BigDecimal saldoPagamento) {
        this.saldoPagamento = saldoPagamento;
    }

    //@Column(name = "dsct", precision = 13, scale = 6)
    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    //@Column(name = "juro", precision = 13, scale = 6)
    public BigDecimal getJuros() {
        return juros;
    }

    public void setJuros(BigDecimal juros) {
        this.juros = juros;
    }

    //@Column(name = "mult", precision = 13, scale = 6)
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MovimentoPagamentoBaixa)) {
            return false;
        }
        MovimentoPagamentoBaixa other = (MovimentoPagamentoBaixa) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "MovimentoPagamentoBaixa[id=" + id + ", ]";
    }

}
