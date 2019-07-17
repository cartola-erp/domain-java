package net.cartola.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 26/04/2016 20:01:10
 * //@author murilo
 */
//@Entity
//@Table(name = "cont_caix_hist")
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "ContaCaixaHistorico.findAll", query = "SELECT c FROM ContaCaixaHistorico c")})
public class ContaCaixaHistorico extends RegistroBase {

    private static final long serialVersionUID = 552923937657272L;
    private Long id;
    private String descricao;
    private Date dataHora;
    private BigDecimal saldoAnterior;
    private BigDecimal valor;
    
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cont_caix_hist_id")
    //@SequenceGenerator(name = "seq_cont_caix_hist_id", sequenceName = "seq_cont_caix_hist_id", allocationSize = 1)
    //@Column(name = "cont_caix_hist_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "dscr", nullable = false)
    //@NotNull(message = "� necess�rio informar alguma descri��o")
    //@Size(min = 1, max = 255, message = "tamanho da descri��o deve conter entre 1 e 255")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "data_hora", nullable = false)
    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    //@Column(name="sald_ante", precision = 13, scale = 4)
    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    //@Column(name="valo", precision = 13, scale = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    
}
